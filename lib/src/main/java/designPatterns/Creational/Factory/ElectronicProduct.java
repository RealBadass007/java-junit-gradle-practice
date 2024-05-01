package designPatterns.Creational.Factory;

public class ElectronicProduct implements Product {

	private int productId;
	private String productName;
	private final ProductType productType = ProductType.ELECTRONIC;
	
	@Override
	public int getProductId() {
		return productId;
	}

	@Override
	public String getProductName() {
		return productName;
	}

	@Override
	public ProductType getProductType() {
		return productType;
	}
	
	@Override
	public String getProductDescription() {
		return null;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
