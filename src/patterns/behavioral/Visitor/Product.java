package patterns.behavioral.Visitor;

public class Product implements Element
{
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
