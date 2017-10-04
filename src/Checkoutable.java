import java.math.BigDecimal;

public interface Checkoutable extends LibraryMaterial {

    public int getCheckoutPeriod();
    public int getGracePeriod();
    public BigDecimal getLateFee();
}
