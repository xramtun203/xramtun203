package csh.java.tradecenter.command;

public class TradeCommand {
	private String tradeItem;
	private int tradePrice;
	private String tradeGrade;
	private String tradeClass;
	private int tradeEnchant;
	private int tradeQuality;
	public String getTradeItem() {
		return tradeItem;
	}
	public void setTradeItem(String tradeItem) {
		this.tradeItem = tradeItem;
	}
	public int getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(int tradePrice) {
		this.tradePrice = tradePrice;
	}
	public String getTradeGrade() {
		return tradeGrade;
	}
	public void setTradeGrade(String tradeGrade) {
		this.tradeGrade = tradeGrade;
	}
	public String getTradeClass() {
		return tradeClass;
	}
	public void setTradeClass(String tradeClass) {
		this.tradeClass = tradeClass;
	}
	public int getTradeEnchant() {
		return tradeEnchant;
	}
	public void setTradeEnchant(int tradeEnchant) {
		this.tradeEnchant = tradeEnchant;
	}
	public int getTradeQuality() {
		return tradeQuality;
	}
	public void setTradeQuality(int tradeQuality) {
		this.tradeQuality = tradeQuality;
	}
	@Override
	public String toString() {
		return "TradeCommand [tradeItem=" + tradeItem + ", tradePrice=" + tradePrice + ", tradeGrade=" + tradeGrade
				+ ", tradeClass=" + tradeClass + ", tradeEnchant=" + tradeEnchant + ", tradeQuality=" + tradeQuality
				+ "]";
	}
	
	
}
