package bank;

import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.VisitorSupport;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class ReportXMLShowList {

	class XMLVistor extends VisitorSupport {

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

	}

	@Test
	public void testReportXML() throws Exception {
		Document document = readXML2Doc();
		// 获取根节点元素对象
		// Element root = document.getRootElement();
		// 遍历所有的元素节点
		// listNodes(root);
		// 事件触发方式
		document.accept(new XMLVistor());
	}

	private Document readXML2Doc() throws DocumentException {
		// 创建saxReader对象
		SAXReader reader = new SAXReader();
		// 通过read方法读取一个文件 转换成Document对象
		InputStream in = ReportXMLShowList.class.getClassLoader().getResourceAsStream("bank/CentralBankReport.xml");
		Document document = reader.read(in);
		return document;
	}

	/**
	 * 遍历当前节点元素下面的所有(元素的)子节点
	 * 
	 * @param node
	 */
	@SuppressWarnings("unchecked")
	public void listNodes(Element node) {
		System.out.println("当前节点的名称：：" + node.getName());
		// 获取当前节点的所有属性节点
		List<Attribute> list = node.attributes();
		// 遍历属性节点
		for (Attribute attr : list) {
			System.out.println(attr.getText() + "-----" + attr.getName() + "---" + attr.getValue());
		}

		if (!(node.getTextTrim().equals(""))) {
			System.out.println("文本内容：：：：" + node.getTextTrim());
		}

		// 当前节点下面子节点迭代器
		Iterator<Element> it = node.elementIterator();
		// 遍历
		while (it.hasNext()) {
			// 获取某个子节点对象
			Element e = it.next();
			// 对子节点进行遍历
			listNodes(e);
		}
	}
}
