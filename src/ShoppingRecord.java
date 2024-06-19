import java.time.Instant;
import java.util.ArrayList;

public class ShoppingRecord {
    private Instant purchase;
    private Instant deliver;
    private ArrayList<Product> shoppingList;

    public ShoppingRecord() {
        this.shoppingList = new ArrayList<>();
        this.purchase = Instant.now();
        this.deliver = this.purchase.plusSeconds(7 * 24 * 60 * 60);
    }

    public Instant getPurchase() {
        return purchase;
    }

    public Instant getDeliver() {
        return deliver;
    }

    public ArrayList<Product> getShoppingList() {
        return shoppingList;
    }

    public void addProduct(Product product) {
        this.shoppingList.add(product);
    }

    @Override
    public String toString() {
        return "Compra realizada el " + purchase + ", entrega estimada el " + deliver;
    }
}
