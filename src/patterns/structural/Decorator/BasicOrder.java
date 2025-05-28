package patterns.structural.Decorator;

public class BasicOrder implements OrderProcessor
{
    public void process() {
        System.out.println("Обробка базового замовлення");
    }
}