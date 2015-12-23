package entity;

/**
 * CommunicationScore 央信评分vo
 *
 */
public class CenterScore implements java.io.Serializable {
	private static final long serialVersionUID = -7615658105606988275L;

	// 本次查询唯一编号
	private String queryNumber;
	// 客户证件号码
	private String customerIdNumber;
	// 查询时间
	private String queryTime;
	// 公司代码
	private String companyCode;
	// 产品代码
	private String productCode;
	// 客户姓名
	private String customerName;
	// 性别
	private String sex;
	// 学历
	private String degree;
	// 婚姻状况
	private String maritalState;
	// 年龄
	private double age = 0;
	// 在现单位工作时间 年月日
	private String workTime;
	// 房产状况 有房有贷款，有房无贷款，无房
	private String house;
	// 所在省份
	private String area;
	// 所在城市
	private String cityCategory;
	// 单位性质 国有企业，机关事业，民营企业，三资企业，其他
	private String orgType;
	// 申请递交时间（信审时间）
	private String submitTime;
	// 近3个月央行征信报告查询次数
	private Integer s3mquery;
	// 近1年央行征信报告查询次数
	private Integer s1yquery;
	// 近2年央行征信报告查询次数
	private Integer s2yquery;
	// 第一笔贷款发放时间
	private String FirstLoanOpenMonth;
	// 最近一笔贷款发放时间
	private String RecentLoanOpenDate;
	// 历史总贷款笔数
	private Integer HistoryLoanCount;
	// 现有未结清贷款笔数
	private Integer UnpaidLoanCount;
	// 现有未结清贷款的总合同金额
	private Double UnpaidLoanCreditLimit;
	// 现有未结清贷款的总贷款余额
	private Double UnpaidLoanBlance;
	// 首张信用卡开卡时间
	private String FirstCreditCardOpenTime;
	// 最近一张信用卡开卡时间
	private String RecentCreditCardOpenTime;
	// 近6个月贷记审批查询次数
	private Integer QueryTimesIn6MonthForCreditCard;
	// 近1年信用卡审批查询次数
	private Integer QueryTimesIn1YearForCreditCard;
	// 近2年信用卡审批查询次数
	private Integer QueryTimesIn2YearForCreditCard;
	// 近6个月信用卡开卡张数
	private Integer CreditCardCountOpenIn6Month;
	// 近1年信用卡开卡张数
	private Integer CreditCardCountOpenIn1Year;
	// 近2年信用卡开卡张数
	private Integer CreditCardCountOpenIn2Year;
	// 信用卡人民币账户的授信总额度
	private Double CreditCardTotalLimit;
	// 信用卡人民币账户的已用总额度
	private Double CreditCardUsedLimit;
	// 信用卡人民币账户中最高的单家银行授信额度
	private Double MaxCreditLimit;
	// 信用卡中所有的记录条数(现有的信用卡张数)
	private Integer CreditCardRecordCount;
	// 信用卡中人民币卡的记录条数(现有的人民币帐户信用卡张数)
	private Integer CreditCardCNYCount;
	// 评分
	private double score;
	// 决策建议
	private String strategy;

	/**
	 * @return 本次查询唯一标志
	 */
	public String getQueryNumber() {
		return queryNumber;
	}

	public void setQueryNumber(String queryNumber) {
		this.queryNumber = queryNumber;
	}

	/**
	 * 客户身份证号码
	 * 
	 * @return
	 */
	public String getCustomerIdNumber() {
		return customerIdNumber;
	}

	public void setCustomerIdNumber(String customerIdNumber) {
		this.customerIdNumber = customerIdNumber;
	}

	/**
	 * @return 产品代码
	 */
	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	/**
	 * @return 查询时间
	 */
	public String getQueryTime() {
		return queryTime;
	}

	public void setQueryTime(String queryTime) {
		this.queryTime = queryTime;
	}

	/**
	 * @return 公司代码
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	/**
	 * @return 客户姓名
	 */
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return 性别
	 */
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return 学历
	 */
	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return 婚姻状况
	 */
	public String getMaritalState() {
		return maritalState;
	}

	public void setMaritalState(String maritalState) {
		this.maritalState = maritalState;
	}

	/**
	 * @return 年龄
	 */
	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	/**
	 * @return 在现单位工作时间 年月日
	 */
	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	/**
	 * @return 房产状况 有房有贷款，有房无贷款，无房
	 */
	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	/**
	 * @return 所在省份
	 */
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return 所在城市
	 */
	public String getCityCategory() {
		return cityCategory;
	}

	public void setCityCategory(String cityCategory) {
		this.cityCategory = cityCategory;
	}

	/**
	 * @return 单位性质 国有企业，机关事业，民营企业，三资企业，其他
	 */
	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	/**
	 * @return 申请递交时间（信审时间）
	 */
	public String getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	/**
	 * @return 近3个月央行征信报告查询次数
	 */
	public Integer getS3mquery() {
		return s3mquery;
	}

	public void setS3mquery(Integer s3mquery) {
		this.s3mquery = s3mquery;
	}

	/**
	 * @return 近1年央行征信报告查询次数
	 */
	public Integer getS1yquery() {
		return s1yquery;
	}

	public void setS1yquery(Integer s1yquery) {
		this.s1yquery = s1yquery;
	}

	/**
	 * @return 近2年央行征信报告查询次数
	 */
	public Integer getS2yquery() {
		return s2yquery;
	}

	public void setS2yquery(Integer s2yquery) {
		this.s2yquery = s2yquery;
	}

	/**
	 * @return 第一笔贷款发放时间
	 */
	public String getFirstLoanOpenMonth() {
		return FirstLoanOpenMonth;
	}

	public void setFirstLoanOpenMonth(String firstLoanOpenMonth) {
		FirstLoanOpenMonth = firstLoanOpenMonth;
	}

	/**
	 * @return 最近一笔贷款发放时间
	 */
	public String getRecentLoanOpenDate() {
		return RecentLoanOpenDate;
	}

	public void setRecentLoanOpenDate(String recentLoanOpenDate) {
		RecentLoanOpenDate = recentLoanOpenDate;
	}

	/**
	 * @return 历史总贷款笔数
	 */
	public Integer getHistoryLoanCount() {
		return HistoryLoanCount;
	}

	public void setHistoryLoanCount(Integer historyLoanCount) {
		HistoryLoanCount = historyLoanCount;
	}

	/**
	 * @return 现有未结清贷款笔数
	 */
	public Integer getUnpaidLoanCount() {
		return UnpaidLoanCount;
	}

	public void setUnpaidLoanCount(Integer unpaidLoanCount) {
		UnpaidLoanCount = unpaidLoanCount;
	}

	/**
	 * @return 现有未结清贷款的总合同金额
	 */
	public Double getUnpaidLoanCreditLimit() {
		return UnpaidLoanCreditLimit;
	}

	public void setUnpaidLoanCreditLimit(Double unpaidLoanCreditLimit) {
		UnpaidLoanCreditLimit = unpaidLoanCreditLimit;
	}

	/**
	 * @return 现有未结清贷款的总贷款余额
	 */
	public Double getUnpaidLoanBlance() {
		return UnpaidLoanBlance;
	}

	public void setUnpaidLoanBlance(Double unpaidLoanBlance) {
		UnpaidLoanBlance = unpaidLoanBlance;
	}

	/**
	 * @return 首张信用卡开卡时间
	 */
	public String getFirstCreditCardOpenTime() {
		return FirstCreditCardOpenTime;
	}

	public void setFirstCreditCardOpenTime(String firstCreditCardOpenTime) {
		FirstCreditCardOpenTime = firstCreditCardOpenTime;
	}

	/**
	 * @return 最近一张信用卡开卡时间
	 */
	public String getRecentCreditCardOpenTime() {
		return RecentCreditCardOpenTime;
	}

	public void setRecentCreditCardOpenTime(String recentCreditCardOpenTime) {
		RecentCreditCardOpenTime = recentCreditCardOpenTime;
	}

	/**
	 * @return 近6个月贷记审批查询次数
	 */
	public Integer getQueryTimesIn6MonthForCreditCard() {
		return QueryTimesIn6MonthForCreditCard;
	}

	public void setQueryTimesIn6MonthForCreditCard(Integer queryTimesIn6MonthForCreditCard) {
		QueryTimesIn6MonthForCreditCard = queryTimesIn6MonthForCreditCard;
	}

	/**
	 * @return 近1年信用卡审批查询次数
	 */
	public Integer getQueryTimesIn1YearForCreditCard() {
		return QueryTimesIn1YearForCreditCard;
	}

	public void setQueryTimesIn1YearForCreditCard(Integer queryTimesIn1YearForCreditCard) {
		QueryTimesIn1YearForCreditCard = queryTimesIn1YearForCreditCard;
	}

	/**
	 * @return 近2年信用卡审批查询次数
	 */
	public Integer getQueryTimesIn2YearForCreditCard() {
		return QueryTimesIn2YearForCreditCard;
	}

	public void setQueryTimesIn2YearForCreditCard(Integer queryTimesIn2YearForCreditCard) {
		QueryTimesIn2YearForCreditCard = queryTimesIn2YearForCreditCard;
	}

	/**
	 * @return 近6个月信用卡开卡张数
	 */
	public Integer getCreditCardCountOpenIn6Month() {
		return CreditCardCountOpenIn6Month;
	}

	public void setCreditCardCountOpenIn6Month(Integer creditCardCountOpenIn6Month) {
		CreditCardCountOpenIn6Month = creditCardCountOpenIn6Month;
	}

	/**
	 * @return 近1年信用卡开卡张数
	 */
	public Integer getCreditCardCountOpenIn1Year() {
		return CreditCardCountOpenIn1Year;
	}

	public void setCreditCardCountOpenIn1Year(Integer creditCardCountOpenIn1Year) {
		CreditCardCountOpenIn1Year = creditCardCountOpenIn1Year;
	}

	/**
	 * @return 近2年信用卡开卡张数
	 */
	public Integer getCreditCardCountOpenIn2Year() {
		return CreditCardCountOpenIn2Year;
	}

	public void setCreditCardCountOpenIn2Year(Integer creditCardCountOpenIn2Year) {
		CreditCardCountOpenIn2Year = creditCardCountOpenIn2Year;
	}

	/**
	 * @return 信用卡人民币账户的授信总额度
	 */
	public Double getCreditCardTotalLimit() {
		return CreditCardTotalLimit;
	}

	public void setCreditCardTotalLimit(Double creditCardTotalLimit) {
		CreditCardTotalLimit = creditCardTotalLimit;
	}

	/**
	 * @return 信用卡人民币账户的已用总额度
	 */
	public Double getCreditCardUsedLimit() {
		return CreditCardUsedLimit;
	}

	public void setCreditCardUsedLimit(Double creditCardUsedLimit) {
		CreditCardUsedLimit = creditCardUsedLimit;
	}

	/**
	 * @return 信用卡人民币账户中最高的单家银行授信额度
	 */
	public Double getMaxCreditLimit() {
		return MaxCreditLimit;
	}

	public void setMaxCreditLimit(Double maxCreditLimit) {
		MaxCreditLimit = maxCreditLimit;
	}

	/**
	 * @return 信用卡中所有的记录条数(现有的信用卡张数)
	 */
	public Integer getCreditCardRecordCount() {
		return CreditCardRecordCount;
	}

	public void setCreditCardRecordCount(Integer creditCardRecordCount) {
		CreditCardRecordCount = creditCardRecordCount;
	}

	/**
	 * @return 信用卡中人民币卡的记录条数(现有的人民币帐户信用卡张数)
	 */
	public Integer getCreditCardCNYCount() {
		return CreditCardCNYCount;
	}

	public void setCreditCardCNYCount(Integer creditCardCNYCount) {
		CreditCardCNYCount = creditCardCNYCount;
	}

	/**
	 * @return 评分
	 */
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	/**
	 * @return 决策建议
	 */
	public String getStrategy() {
		return strategy;
	}

	public void setStrategy(String strategy) {
		this.strategy = strategy;
	}

	@Override
	public String toString() {
		return "CenterScore ["
				+ (queryNumber != null ? "queryNumber=" + queryNumber + ", " : "")
				+ (customerIdNumber != null ? "customerIdNumber=" + customerIdNumber + ", " : "")
				+ (queryTime != null ? "queryTime=" + queryTime + ", " : "")
				+ (companyCode != null ? "companyCode=" + companyCode + ", " : "")
				+ (productCode != null ? "productCode=" + productCode + ", " : "")
				+ (customerName != null ? "customerName=" + customerName + ", " : "")
				+ (sex != null ? "sex=" + sex + ", " : "")
				+ (degree != null ? "degree=" + degree + ", " : "")
				+ (maritalState != null ? "maritalState=" + maritalState + ", " : "")
				+ "age="
				+ age
				+ ", "
				+ (workTime != null ? "workTime=" + workTime + ", " : "")
				+ (house != null ? "house=" + house + ", " : "")
				+ (area != null ? "area=" + area + ", " : "")
				+ (cityCategory != null ? "cityCategory=" + cityCategory + ", " : "")
				+ (orgType != null ? "orgType=" + orgType + ", " : "")
				+ (submitTime != null ? "submitTime=" + submitTime + ", " : "")
				+ (s3mquery != null ? "s3mquery=" + s3mquery + ", " : "")
				+ (s1yquery != null ? "s1yquery=" + s1yquery + ", " : "")
				+ (s2yquery != null ? "s2yquery=" + s2yquery + ", " : "")
				+ (FirstLoanOpenMonth != null ? "FirstLoanOpenMonth=" + FirstLoanOpenMonth + ", " : "")
				+ (RecentLoanOpenDate != null ? "RecentLoanOpenDate=" + RecentLoanOpenDate + ", " : "")
				+ (HistoryLoanCount != null ? "HistoryLoanCount=" + HistoryLoanCount + ", " : "")
				+ (UnpaidLoanCount != null ? "UnpaidLoanCount=" + UnpaidLoanCount + ", " : "")
				+ (UnpaidLoanCreditLimit != null ? "UnpaidLoanCreditLimit=" + UnpaidLoanCreditLimit + ", " : "")
				+ (UnpaidLoanBlance != null ? "UnpaidLoanBlance=" + UnpaidLoanBlance + ", " : "")
				+ (FirstCreditCardOpenTime != null ? "FirstCreditCardOpenTime=" + FirstCreditCardOpenTime + ", " : "")
				+ (RecentCreditCardOpenTime != null ? "RecentCreditCardOpenTime=" + RecentCreditCardOpenTime + ", "
						: "")
				+ (QueryTimesIn6MonthForCreditCard != null ? "QueryTimesIn6MonthForCreditCard="
						+ QueryTimesIn6MonthForCreditCard + ", " : "")
				+ (QueryTimesIn1YearForCreditCard != null ? "QueryTimesIn1YearForCreditCard="
						+ QueryTimesIn1YearForCreditCard + ", " : "")
				+ (QueryTimesIn2YearForCreditCard != null ? "QueryTimesIn2YearForCreditCard="
						+ QueryTimesIn2YearForCreditCard + ", " : "")
				+ (CreditCardCountOpenIn6Month != null ? "CreditCardCountOpenIn6Month=" + CreditCardCountOpenIn6Month
						+ ", " : "")
				+ (CreditCardCountOpenIn1Year != null ? "CreditCardCountOpenIn1Year=" + CreditCardCountOpenIn1Year
						+ ", " : "")
				+ (CreditCardCountOpenIn2Year != null ? "CreditCardCountOpenIn2Year=" + CreditCardCountOpenIn2Year
						+ ", " : "")
				+ (CreditCardTotalLimit != null ? "CreditCardTotalLimit=" + CreditCardTotalLimit + ", " : "")
				+ (CreditCardUsedLimit != null ? "CreditCardUsedLimit=" + CreditCardUsedLimit + ", " : "")
				+ (MaxCreditLimit != null ? "MaxCreditLimit=" + MaxCreditLimit + ", " : "")
				+ (CreditCardRecordCount != null ? "CreditCardRecordCount=" + CreditCardRecordCount + ", " : "")
				+ (CreditCardCNYCount != null ? "CreditCardCNYCount=" + CreditCardCNYCount + ", " : "") + "score="
				+ score + ", " + (strategy != null ? "strategy=" + strategy : "") + "]";
	}

}
