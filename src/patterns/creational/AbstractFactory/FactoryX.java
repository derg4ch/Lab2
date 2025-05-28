package patterns.creational.AbstractFactory;

public class FactoryX implements AbstractFactory
{
    public AbstractProduct createProduct() { return new ProductX(); }
}