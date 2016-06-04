package bean;

import com.google.gson.annotations.SerializedName;

public class Stock {
	@SerializedName("companyName")
	private String companyName;
	private transient String industry;
	@SerializedName("lastPrice")
	private Double lastPrice;
	@SerializedName("change")
	private Double changeInPrice;
	@SerializedName("pChange")
	private Double changeInPercent;
	private transient Double marketCapital;
	private transient String linkToData;

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
