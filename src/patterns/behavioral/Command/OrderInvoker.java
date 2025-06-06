package patterns.behavioral.Command;

public class OrderInvoker
{
    private Command command;

    public void setCommand(Command command)
    {
        this.command = command;
    }

    public void invoke()
    {
        command.execute();
    }
}
