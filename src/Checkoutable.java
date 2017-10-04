
public interface Checkoutable {

    public int getCheckoutPeriod();
    public Checkout checkOutItem(Visitor visitor);
    public int getGracePeriod();
    public Checkout returnItem(Visitor visitor);
}
