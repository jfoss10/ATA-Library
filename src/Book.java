import java.math.BigDecimal;
import java.util.Date;

public class Book implements Checkoutable {
    private final static BigDecimal LATE_FEE = new BigDecimal(.05);
    
    String category;
    String title;
    int checkoutPeriod;
    int gracePeriod;
    BigDecimal cost;

    public Book(String category, String title) {
        this.category = category;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public String getCategory() {
        return this.category;
    }

    @Override
    public BigDecimal getCost() {
        return this.cost;
    }

    @Override
    public int getCheckoutPeriod() {
        return this.checkoutPeriod;
    }

    @Override
    public int getGracePeriod() {
        return this.gracePeriod;
    }

    @Override
    public BigDecimal getLateFee() {
        return LATE_FEE;
    }
}
