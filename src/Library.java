import java.util.ArrayList;
import java.util.List;

public class Library {

    private final LocationManager locationManager = new LocationManager();
    private List<LibraryMaterial> materials;
    private List<Visitor> visitors;
    private List<Checkout> checkouts;

    public Library() {
        materials = new ArrayList<LibraryMaterial>();
        visitors = new ArrayList<Visitor>();
        checkouts = new ArrayList<Checkout>();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void doCheckout(Visitor visitor, Checkoutable material) {
        locationManager.checkOut(material);
        
        if(material instanceof Book) {
            locationManager.removeFromShelf((Book)material);
        }else if(material instanceof DVD) {
            locationManager.removeFromCounter((DVD)material);
        }
        
        checkouts.add(new Checkout(visitor, material));
        visitor.addItemsOut(material);
    }
    
    public void doCheckIn(Checkout checkout) {
        Checkoutable material = checkout.getMaterial();
        checkout.getVisitor().removeItemsOut(material);
        
        checkouts.remove(checkout);
        locationManager.checkIn(material);
        
        if(material instanceof Book) {
            locationManager.addToShelf((Book)material);
        }else if(material instanceof DVD) {
            locationManager.addToCounter((DVD)material);
        }
    }

    public boolean hasMaterial(String title) {
        for (LibraryMaterial material : materials) {
            if (material.getTitle().equals(title)) {
                return true;
            }
        }

        return false;
    }

    public LibraryMaterial getMaterialByTitle(String title) {
        for (LibraryMaterial material : materials) {
            if (material.getTitle().equals(title)) {
                return material;
            }
        }
        return null;
    }
}
