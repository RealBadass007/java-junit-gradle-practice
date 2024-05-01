package designPatterns.Creational.Factory;

public class ProductFactory {

	private static ProductFactory singletonInstance;
	
	private ProductFactory() {
		
	}
	
	public static ProductFactory getInstance() {
		if(singletonInstance == null) {
			synchronized (ProductFactory.class) {
				if(singletonInstance == null) {
					singletonInstance = new ProductFactory();
				}
			}
		}
		return singletonInstance;
	}
	
	public static Product getProduct(ProductType productType) {
		Product product = null;
		switch(productType) {
			case CONSUMABLE:
				product = new ConsumableProduct();
				break;
			case ELECTRONIC:
				product = new ElectronicProduct();
				break;
		}
		return product;
	}
	
}
