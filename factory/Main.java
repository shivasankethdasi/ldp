package factory;

public class Main {
    public static void main(String[] args) {
        Order foodOrder = OnlineOrderProcessingFactory.createOrder("food");
        Order clothingOrder = OnlineOrderProcessingFactory.createOrder("clothing");
        Order electronicsOrder = OnlineOrderProcessingFactory.createOrder("electronics");

        foodOrder.processOrder();
        clothingOrder.processOrder();
        electronicsOrder.processOrder();
    }
}

