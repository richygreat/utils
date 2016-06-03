package bean;

public class Stock {
	private String companyName;
	private String industry;
	private Double lastPrice;
	private Double changeInPrice;
	private Double changeInPercent;
	private Double marketCapital;
	private String linkToData;

	@Override
	public String toString() {
		return "Stock [companyName=" + companyName + ", industry=" + industry + ", lastPrice=" + lastPrice
				+ ", changeInPrice=" + changeInPrice + ", changeInPercent=" + changeInPercent + ", marketCapital="
				+ marketCapital + ", linkToData=" + linkToData + "]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Double getChangeInPrice() {
		return changeInPrice;
	}

	public void setChangeInPrice(Double changeInPrice) {
		this.changeInPrice = changeInPrice;
	}

	public Double getChangeInPercent() {
		return changeInPercent;
	}

	public void setChangeInPercent(Double changeInPercent) {
		this.changeInPercent = changeInPercent;
	}

	public Double getMarketCapital() {
		return marketCapital;
	}

	public void setMarketCapital(Double marketCapital) {
		this.marketCapital = marketCapital;
	}

	public String getLinkToData() {
		return linkToData;
	}

	public void setLinkToData(String linkToData) {
		this.linkToData = linkToData;
	}

}
