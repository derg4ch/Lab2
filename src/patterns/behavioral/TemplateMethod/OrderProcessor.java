package patterns.behavioral.TemplateMethod;

public abstract class OrderProcessor
{
    public final void processOrder()
    {
        selectProduct();
        makePayment();
        deliver();
    }

    abstract void selectProduct();
    abstract void makePayment();
    abstract void deliver();
}