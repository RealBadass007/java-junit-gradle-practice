package designPatterns.Creational.Factory;

public class ConsumableProduct implements Product {

	private int productId;
	private String productName;
	private final ProductType productType = ProductType.CONSUMABLE;
	private String productDescription;
	
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
		return productDescription;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
}
