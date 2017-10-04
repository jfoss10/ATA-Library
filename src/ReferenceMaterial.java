import java.math.BigDecimal;

public class ReferenceMaterial implements LibraryMaterial {

    String title;
    String category;
    BigDecimal cost;

    public ReferenceMaterial(String title, String category, BigDecimal cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public BigDecimal getCost() {
        return cost;
    }
}
