package patterns.structural.Proxy;

public class StoreProxy implements StoreAccess
{
    private RealStore realStore;
    private final boolean isLoggedIn; // чи увійшов у систему

    public StoreProxy(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public void enterStore()
    {
        if (isLoggedIn)
        {
            if (realStore == null)
            {
                realStore = new RealStore();
            }
            realStore.enterStore();
        } else
        {
            System.out.println("Доступ заборонено. Увійдіть у систему.");
        }
    }
}
