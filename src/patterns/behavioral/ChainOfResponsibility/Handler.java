package patterns.behavioral.ChainOfResponsibility;

public interface Handler
{
    void setNext(Handler handler);
    void handleRequest(String request);
}