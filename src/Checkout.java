import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

/**
 * An object to represent the checkout transactions.
 * @author jennaw
 *
 */
public class Checkout {
    private Visitor visitor;
    private Checkoutable item;
    private Date checkoutDate;

    public Checkout(Visitor visitor, Checkoutable item) {
        this(visitor, item, Calendar.getInstance().getTime());
    }

    public Checkout(Visitor visitor, Checkoutable item, Date date) {
        this.visitor = visitor;
        this.item = item;
        this.checkoutDate = date;
    }

    public Checkoutable getMaterial() {
        return item;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public boolean isLate() {
        Calendar currentDate = Calendar.getInstance();
        if (ChronoUnit.DAYS.between(currentDate.toInstant(), checkoutDate.toInstant()) > item.getCheckoutPeriod()) {
            return true;
        }
        return false;
    }

}
