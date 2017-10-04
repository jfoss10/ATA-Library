import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Checkout {
    private long iD;
    private Checkoutable item;
    private Calendar checkoutDate;

    public Checkout(long iD, Checkoutable item, Calendar checkoutDate) {
        this.iD = iD;
        this.item = item;
        this.checkoutDate = checkoutDate;
    }
    
    public boolean isLate() {
        Calendar currentDate = Calendar.getInstance();
        if(ChronoUnit.DAYS.between(currentDate.toInstant(), checkoutDate.toInstant()) > item.getCheckoutPeriod()) {
            return true;
        }
        return false;
    }

}
