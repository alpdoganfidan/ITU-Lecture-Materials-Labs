package mat335Labs.Lab4;

public class Invoice {

	
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	
	public Invoice(String partNumber,String partDescription,int quantity,double pricePerItem) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
		
	}
	
	public double getInvoiceAmount() {
		if (this.pricePerItem<0 || this.quantity<0) {
			return 0;
		}
		return this.pricePerItem*this.quantity;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

}
