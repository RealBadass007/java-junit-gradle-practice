package designPatterns.Creational.Builder;

public class BuilderExample {

//	Builder is a creational design pattern that lets you construct complex objects step by step.
//	The pattern allows you to produce different types and representations of an object using the same construction code.
	
//	This pattern avoids telescopic constructors
	
	//Used in java.lang.StringBuilder#append()
	
	public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());
    }
	
}
