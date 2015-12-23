package test.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * SAX不用将整个文档加载到内存,基于事件驱动的API(Observer模式),用户只需要注册自己感兴趣的事件即可。<br>
 * SAX提供EntityResolver, DTDHandler, ContentHandler, ErrorHandler接口, <br>
 * 分别用于监听解析: 实体事件、DTD处理事件、正文处理事件和处理出错事件,与AWT类似, <br>
 * SAX还提供了一个对这4个接口默认的类DefaultHandler（这里的默认实现, 其实就是一个空方法,<br>
 * 一般只要继承DefaultHandler,重写自己感兴趣的事件即可。
 * 
 * @author wangpeng
 *
 */
public class TestSAX {

	public static void main(String[] args) {
		read();
		write();
	}

	public static void read() {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			InputStream in = TestSAX.class.getClassLoader().getResourceAsStream("test.xml");
			parser.parse(in, new MyHandler());
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void write() {
		System.err.println("纯SAX对于写操作无能为力");
	}

}

// 重写对自己感兴趣的事件处理方法
class MyHandler extends DefaultHandler {

	@Override
	public InputSource resolveEntity(String publicId, String systemId) throws IOException, SAXException {
		return super.resolveEntity(publicId, systemId);
	}

	@Override
	public void notationDecl(String name, String publicId, String systemId) throws SAXException {
		super.notationDecl(name, publicId, systemId);
	}

	@Override
	public void unparsedEntityDecl(String name, String publicId, String systemId, String notationName)
			throws SAXException {
		super.unparsedEntityDecl(name, publicId, systemId, notationName);
	}

	@Override
	public void setDocumentLocator(Locator locator) {
		super.setDocumentLocator(locator);
	}

	@Override
	public void startDocument() throws SAXException {
		System.err.println("开始解析文档");
	}

	@Override
	public void endDocument() throws SAXException {
		System.err.println("解析结束");
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		super.startPrefixMapping(prefix, uri);
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		super.endPrefixMapping(prefix);
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.err.print("Element: " + qName + ", attr: ");
		print(attributes);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
	}

	/**
	 * 使用SAX来解析同DOM，当你重写它的 public void characters(char[] ch, int start, int
	 * length)方法时，你就能看到。
	 */
	public void characters(char[] ch, int start, int length) throws SAXException {
		String element = new String(ch, start, length);
		if (!isBlank(element)) {
			element = element.trim();
			System.out.println(element);
		}
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		super.ignorableWhitespace(ch, start, length);
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		super.processingInstruction(target, data);
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		super.skippedEntity(name);
	}

	@Override
	public void warning(SAXParseException e) throws SAXException {
		super.warning(e);
	}

	@Override
	public void error(SAXParseException e) throws SAXException {
		super.error(e);
	}

	@Override
	public void fatalError(SAXParseException e) throws SAXException {
		super.fatalError(e);
	}

	private void print(Attributes attrs) {
		if (attrs == null)
			return;
		System.err.print("[");
		for (int i = 0; i < attrs.getLength(); i++) {
			System.err.print(attrs.getQName(i) + " = " + attrs.getValue(i));
			if (i != attrs.getLength() - 1) {
				System.err.print(", ");
			}
		}
		System.err.println("]");
	}

	public boolean isBlank(String str) {
		int strLen;
		if ((str == null) || ((strLen = str.length()) == 0))
			return true;
		for (int i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}