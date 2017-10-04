import java.math.BigDecimal;
import java.util.List;

public class Visitor {
    String name;
    Long id;
    BigDecimal balance;
    List<Checkoutable> itemsOut;

    public Visitor(String name, Long id, BigDecimal balance, List<Checkoutable> itemsOut) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.itemsOut = itemsOut;
    }

    public List<Checkoutable> getItemsOut() {
        return itemsOut;
    }

    public int getItemsOutCount() {
        return itemsOut.size();
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Long getID() {
        return id;
    }

    public void addItemsOut(Checkoutable item) {
        itemsOut.add(item);
    }
    
    public void removeItemsOut(Checkoutable item) {
        itemsOut.remove(item);
    }
}
