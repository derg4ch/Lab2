package patterns.structural.Proxy;

public class RealStore implements StoreAccess
{
    public void enterStore() {
        System.out.println("Вхід у магазин дозволено");
    }
}