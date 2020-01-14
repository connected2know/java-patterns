package main.java.facade;

public class FacadeMain {

	public static void main(String[] args) {
		PizzaXRestaurant restaurant = new PizzaXRestaurant();
		DeliverCompanyCarDriver deliverDriver = new DeliverCompanyCarDriver();
		TakewayFacade takewayFacade = new TakewayFacade(restaurant,deliverDriver);
		takewayFacade.makeOrder();
	}

}
