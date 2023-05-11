package factory;

public class OnlineOrderProcessingFactory {
    public static Order createOrder(String orderType) {
        if (orderType.equals("food")) {
            return new FoodOrder();
        } else if (orderType.equals("clothing")) {
            return new ClothingOrder();
        } else if (orderType.equals("electronics")) {
            return new ElectronicsOrder();
        } else {
            throw new IllegalArgumentException("Invalid order type: " + orderType);
        }
    }
}

