package gameAutomation.entities;

import gameAutomation.abstracts.Entity;

public class campaign implements Entity{
	private int id;
	private String campaingName;
	private int discountRate;
	private double unitPrice;
	
	public campaign() {
		
	}

	public campaign(int id, String campaingName, int discountRate, double unitPrice) {
		this.id = id;
		this.campaingName = campaingName;
		this.discountRate = discountRate;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public String getDiscountRate() {
		return "%" +  discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
