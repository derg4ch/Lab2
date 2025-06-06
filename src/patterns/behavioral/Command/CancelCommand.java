package patterns.behavioral.Command;

public class CancelCommand implements Command
{
    public void execute()
    {
        System.out.println("Скасування замовлення");
    }
}