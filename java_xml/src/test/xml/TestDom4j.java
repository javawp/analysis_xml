package test.xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.ProcessingInstruction;
import org.dom4j.VisitorSupport;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

/**
 * dom4j是目前在xml解析方面是最优秀的(Hibernate、Sun的JAXM也都使用dom4j来解析XML)，它合并了许多超出基本 XML
 * 文档表示的功能，包括集成的 XPath 支持、XML Schema 支持以及用于大文档或流化文档的基于事件的处理
 * 
 * @author wangpeng
 *
 */
public class TestDom4j {
	public static void main(String[] args) {
		// read1();
		read2();
		// write();
	}

	public static void read1() {
		try {
			Document doc = readXML2Doc();
			Element root = doc.getRootElement();
			readNode(root, "");
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	public static void read2() {
		try {
			Document doc = readXML2Doc();
			doc.accept(new MyVistor());
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}

	private static Document readXML2Doc() throws DocumentException {
		SAXReader reader = new SAXReader();
		InputStream in = TestDom4j.class.getClassLoader().getResourceAsStream("test.xml");
		Document doc = reader.read(in);
		return doc;
	}

	@SuppressWarnings("unchecked")
	public static void readNode(Element root, String prefix) {
		if (root == null)
			return;
		// 获取属性
		List<Attribute> attrs = root.attributes();
		if (attrs != null && attrs.size() > 0) {
			System.err.print(prefix);
			for (Attribute attr : attrs) {
				System.err.print(attr.getValue() + " ");
			}
			System.err.println();
		}
		// 获取他的子节点
		List<Element> childNodes = root.elements();
		prefix += "\t";
		for (Element e : childNodes) {
			readNode(e, prefix);
		}
	}

	public static void write() {
		try {
			// 创建一个xml文档
			Document doc = DocumentHelper.createDocument();
			Element university = doc.addElement("university");
			university.addAttribute("name", "tsu");
			// 注释
			university.addComment("这个是根节点");
			Element college = university.addElement("college");
			college.addAttribute("name", "cccccc");
			college.setText("text");

			File file = new File("src/dom4j-modify.xml");
			if (file.exists()) {
				file.delete();
			}
			file.createNewFile();
			XMLWriter out = new XMLWriter(new FileWriter(file));
			out.write(doc);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class MyVistor extends VisitorSupport {
	public void visit(Attribute node) {
		System.out.println("Attibute: " + node.getName() + "=" + node.getValue());
	}

	public void visit(Element node) {
		if (node.isTextOnly()) {
			System.out.println("Element: " + node.getName() + "=" + node.getTextTrim());
		} else {
			System.out.println(node.getName());
		}
	}

	@Override
	public void visit(ProcessingInstruction node) {
		System.out.println("PI:" + node.getTarget() + " " + node.getText());
	}
}