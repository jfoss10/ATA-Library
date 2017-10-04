import java.util.ArrayList;
import java.util.List;

public class LocationManager {
    private List<LibraryMaterial> counter;
    private List<LibraryMaterial> shelf;
    private List<Checkoutable> checkedOut;

    public LocationManager() {
        counter = new ArrayList<>();
        shelf = new ArrayList<>();
        checkedOut = new ArrayList<>();
    }

    public final List<LibraryMaterial> getCounter() {
        return counter;
    }

    public final List<LibraryMaterial> getShelf() {
        return shelf;
    }

    public final List<Checkoutable> getCheckedOut() {
        return checkedOut;
    }

    public void addToShelf(Book material) {
        shelf.add(material);
    }

    public void removeFromShelf(Book material) {
        shelf.remove(material);
    }

    public void addToCounter(DVD material) {
        counter.add(material);
    }

    public void removeFromCounter(DVD material) {
        counter.remove(material);
    }

    public void checkOut(Checkoutable material) {
        checkedOut.add(material);
    }

    public void checkIn(Checkoutable material) {
        checkedOut.remove(material);
    }
}
