package patterns.creational.AbstractFactory;

class FactoryY implements AbstractFactory
{
    public AbstractProduct createProduct() { return new ProductY(); }
}
