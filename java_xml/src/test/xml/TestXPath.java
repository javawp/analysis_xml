package test.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * XPath 是一门在 XML 文档中查找信息的语言， 可用来在 XML 文档中对元素和属性进行遍历。XPath 是 W3C XSLT 标准的主要元素，并且
 * XQuery 和 XPointer 同时被构建于 XPath 表达之上。因此，对 XPath 的理解是很多高级 XML 应用的基础。
 * XPath非常类似对数据库操作的SQL语言，或者说JQuery，它可以方便开发者抓起文档中需要的东西。（dom4j也支持xpath）
 * 
 * @author wangpeng
 *
 */
public class TestXPath {

	public static void main(String[] args) {
		read();
	}

	public static void read() {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dbf.newDocumentBuilder();
			InputStream in = TestXPath.class.getClassLoader().getResourceAsStream("test.xml");
			Document doc = builder.parse(in);
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			// 选取所有class元素的name属性
			// XPath语法介绍： http://w3school.com.cn/xpath/
			XPathExpression expr = xpath.compile("//class/@name");
			NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
			for (int i = 0; i < nodes.getLength(); i++) {
				System.out.println("name = " + nodes.item(i).getNodeValue());
			}
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}