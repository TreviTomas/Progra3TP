import java.util.HashSet;

public class Business extends Account {
    private static long autoInc = 0;
    private final Long id;
    private HashSet<Product> productList;
    //private HashSet<Warehouse> warehouseList;

    public Business(String name, String password) {
        this.id = ++autoInc;
        this.productList = new HashSet<>();
        //this.warehouseList = new HashSet<>();
        this.setName(name);
        this.setPassword(password);
    }
    public Long getId() {
        return id;
    }

    public HashSet<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

   /* public HashSet<Warehouse> getWarehouseList() {
        return warehouseList;
    }

    public void addWarehouse(Warehouse warehouse) {
        this.warehouseList.add(warehouse);
    }

    */
}
