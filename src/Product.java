public class Product {
    private static long autoInc = 0;
    private final Long id;
    private String businessName;
    private String name;
    private Integer stock;
    private Double price;
    //private EDepartment department;
    private Integer daysToDeliver;
    private Boolean status;

    public Product(String businessName, String name, Integer stock, Double price, Integer daysToDeliver) {
        this.id = ++autoInc;
        this.businessName = businessName;
        this.name = name;
        this.stock = stock;
        this.price = price;
       // this.department = department;
        this.daysToDeliver = daysToDeliver;
        this.status = true;
    }

    public Long getId() {
        return id;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /*public EDepartment getDepartment() {
        return department;
    }

    public void setDepartment(EDepartment department) {
        this.department = department;
    }

     */

    public Integer getDaysToDeliver() {
        return daysToDeliver;
    }

    public void setDaysToDeliver(Integer daysToDeliver) {
        this.daysToDeliver = daysToDeliver;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - Stock: " + stock;
    }
}
