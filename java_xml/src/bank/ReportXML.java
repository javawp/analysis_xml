package bank;

import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class ReportXML {

	@Test
	public void testReportXML() throws Exception {
		Document document = readXML2Doc();
		// 获取根节点元素对象
		Element root = document.getRootElement();

		Element e = root.element("QueryReq").element("Name");
		pintXML("客户姓名[customerName]", e);

		Element e1 = root.element("QueryReq").element("Certno");
		pintXML("客户证件号码[customerIdNumber]", e1);

		Element e2 = root.element("IDENTITY").element("Gender");
		pintXML("性别[sex]", e2);

		Element e3 = root.element("IDENTITY").element("EduLevel");
		pintXML("学历[degree]", e3);

		Element e4 = root.element("IDENTITY").element("MaritalState");
		pintXML("婚姻状况[maritalState]", e4);

		Element e5 = root.element("IDENTITY").element("Birthday");
		pintXML("年龄[age]", e5);

		Element e6 = root.element("EndowmentInsuranceDeposit").element("WorkDate");
		pintXML("在现单位工作时间 年月日[workTime]", e6);

		Element e7 = root.element("CreditSummaryCue").element("PerHouseLoanCount");
		Element e8 = root.element("CreditSummaryCue").element("PerBusinessHouseLoanCount");
		Element e9 = root.element("CreditSummaryCue").element("OtherLoanCount");
		pintXML("房产状况 有房有贷款，有房无贷款，无房[house]", e7, e8, e9);

		Element e10 = root.element("RESIDENCE").element("Address");
		pintXML("所在省份[area]", e10);

		Element e11 = root.element("RESIDENCE").element("Address");
		pintXML("所在城市[cityCategory]", e11);

		Element e12 = root.element("PROFESSIONAL").element("Employer");
		pintXML("单位性质 国有企业，机关事业，民营企业，三资企业，其他[orgType]", e12);

		Element e13 = root.element("Salvation").element("RegisterDate");
		pintXML("申请递交时间（信审时间）[submitTime]", e13);

		pintXML("近3个月央行征信报告查询次数[s3mquery], 没有找到这个参数, 缺省");

		pintXML("近1年央行征信报告查询次数[s1yquery], 没有找到这个参数, 缺省");

		Element e14 = root.element("RecordSummary").element("TwoyearQueryrecordSum").element("Sum");
		pintXML("近2年央行征信报告查询次数[s2yquery]", e14);

		Element e15 = root.element("CreditSummaryCue").element("FirstLoanOpenMonth");
		pintXML("第一笔贷款发放时间[FirstLoanOpenMonth]", e15);

		Element e16 = root.element("AssurerRepay").element("LatestAssurerRepayDate");
		pintXML("最近一笔贷款发放时间[RecentLoanOpenDate]", e16);

		Element e17 = root.element("ShareAndDebt").element("GuaranteeSummary").element("Count");
		pintXML("历史总贷款笔数[HistoryLoanCount]", e17);

		Element e18 = root.element("ShareAndDebt").element("UnpaidLoan").element("AccountCount");
		pintXML("现有未结清贷款笔数[UnpaidLoanCount]", e18);

		Element e19 = root.element("ShareAndDebt").element("UnpaidLoan").element("CreditLimit");
		pintXML("现有未结清贷款的总合同金额[UnpaidLoanCreditLimit]", e19);

		Element e20 = root.element("ShareAndDebt").element("UnpaidLoan").element("Balance");
		pintXML("现有未结清贷款的总贷款余额[UnpaidLoanBlance]", e20);

		Element e21 = root.element("CreditSummaryCue").element("FirstLoancardOpenMonth");
		pintXML("首张信用卡开卡时间[FirstCreditCardOpenTime]", e21);

		pintXML("最近一张信用卡开卡时间[RecentCreditCardOpenTime], 没有找到这个参数, 缺省");

		pintXML("近6个月贷记审批查询次数[QueryTimesIn6MonthForCreditCard], 没有找到这个参数, 缺省");

		pintXML("近1年信用卡审批查询次数[QueryTimesIn1YearForCreditCard], 没有找到这个参数, 缺省");

		Element e22 = root.element("RecordSummary").element("TwoyearQueryrecordSum").element("Sum");
		pintXML("近2年信用卡审批查询次数[QueryTimesIn2YearForCreditCard]", e22);

		pintXML("近6个月信用卡开卡张数[CreditCardCountOpenIn6Month], 没有找到这个参数, 缺省");

		pintXML("近1年信用卡开卡张数[CreditCardCountOpenIn1Year], 没有找到这个参数, 缺省");

		pintXML("近2年信用卡开卡张数[CreditCardCountOpenIn2Year], 没有找到这个参数, 缺省");

		Element e23 = root.element("Loancard").element("AwardCreditInfo").element("CreditLimitAmount");
		pintXML("信用卡人民币账户的授信总额度[CreditCardTotalLimit]", e23);

		Element e24 = root.element("Loancard").element("RepayInfo").element("UsedCreditLimitAmount");
		pintXML("信用卡人民币账户的已用总额度[CreditCardUsedLimit]", e24);

		Element e25 = root.element("ShareAndDebt").element("UnpaidLoan").element("MaxCreditLimitPerOrg");
		pintXML("信用卡人民币账户中最高的单家银行授信额度[MaxCreditLimit]", e25);

		pintXML("信用卡中所有的记录条数(现有的信用卡张数)[CreditCardRecordCount], 没有找到这个参数, 缺省");

		pintXML("用卡中人民币卡的记录条数(现有的人民币帐户信用卡张数)[CreditCardCNYCount], 没有找到这个参数, 缺省");
	}

	private void pintXML(String pre, Element... elements) {
		StringBuilder sb = new StringBuilder(pre);
		for (Element e : elements) {
			sb.append(":\t").append(e.getName()).append("=").append(e.getTextTrim()).append("\t");
		}
		System.out.println(sb.toString());
	}

	private Document readXML2Doc() throws DocumentException {
		// 创建saxReader对象
		SAXReader reader = new SAXReader();
		// 通过read方法读取一个文件 转换成Document对象
		InputStream in = ReportXML.class.getClassLoader().getResourceAsStream("bank/CentralBankReport.xml");
		Document document = reader.read(in);
		return document;
	}

	/**
	 * 介绍Element中的element方法和elements方法的使用
	 * 
	 * @param node
	 */
	@SuppressWarnings("unchecked")
	public void elementMethod(Element node) {
		// 获取node节点中，子节点的元素名称为西游记的元素节点。
		Element e = node.element("西游记");
		// 获取西游记元素节点中，子节点为作者的元素节点(可以看到只能获取第一个作者元素节点)
		Element author = e.element("作者");

		System.out.println(author.getName() + "----" + author.getText());

		// 获取西游记这个元素节点 中，所有子节点名称为作者元素的节点 。

		List<Element> authors = e.elements("作者");
		for (Element aut : authors) {
			System.out.println(aut.getName() + "----" + aut.getText());
		}

		// 获取西游记这个元素节点 所有元素的子节点。
		List<Element> elements = e.elements();

		for (Element el : elements) {
			System.out.println(el.getName() + "----" + el.getText());
		}

	}
}
