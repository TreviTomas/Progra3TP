import java.util.LinkedList;

public class User extends Account {
    private static long autoInc = 0;
    private final Long id;
    private final Integer dni;
    private Double maxExpense;
    private Double money;
    private LinkedList<ShoppingRecord> shoppingList;

    public User(Integer dni, Double maxExpense, Double money,String password) {
        this.id = ++autoInc;
        this.dni = dni;
        this.maxExpense = maxExpense;
        this.money = money;
        this.shoppingList = new LinkedList<>();
        this.setPassword(password);
    }

    public Long getId() {
        return id;
    }

    public Integer getDni() {
        return dni;
    }

    public Double getMaxExpense() {
        return maxExpense;
    }

    public void setMaxExpense(Double maxExpense) {
        this.maxExpense = maxExpense;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public LinkedList<ShoppingRecord> getShoppingList() {
        return shoppingList;
    }

    public void addShoppingRecord(ShoppingRecord record) {
        this.shoppingList.add(record);
    }

    public void comprarProducto(Product product) {
        if (product.getPrice() > this.money) {
            System.out.println("No tienes suficiente dinero para comprar este producto.");
        } else if (product.getPrice() > this.maxExpense) {
            System.out.println("El precio del producto excede tu gasto máximo permitido.");
        } else {
            this.money -= product.getPrice();
            ShoppingRecord record = new ShoppingRecord();
            record.addProduct(product);
            addShoppingRecord(record);
            System.out.println("Has comprado: " + product.getName() + " por $" + product.getPrice());
        }
    }
}
