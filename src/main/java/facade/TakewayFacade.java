package main.java.facade;

public class TakewayFacade {
	
	private Restaurant restaurant;
	
	private Driver driver;
	
	public TakewayFacade(Restaurant restaurant, Driver driver){
		this.restaurant = restaurant;
		this.driver = driver;
	}
	
	public void makeOrder() {
		int orderNbr = this.restaurant.createOrder();
		System.out.println("Order with number " + orderNbr + " created.");
		boolean isReady = this.restaurant.isBakingDone();
		if(isReady) {
			System.out.println("Dish is Ready to deliver!!");
			String deliverProcessed = this.driver.deliverOrder(orderNbr);
			System.out.println(deliverProcessed);
		}
	}
	
}
