package factory;

public class ElectronicsOrder implements Order{
    @Override
    public void processOrder() {
        System.out.println("Processing electronics order for.....");
    }
}
