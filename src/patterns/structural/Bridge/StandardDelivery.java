package patterns.structural.Bridge;

public class StandardDelivery implements DeliveryService
{
    public void deliver(String item) {
        System.out.println("Доставка стандартною службою: " + item);
    }
}

