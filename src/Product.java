public class Product {
    private  String name;
    private  double price;
    private  int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    void addProducts(int quantity) {
        this.quantity += quantity;
    };

    void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
      return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units " + "Total: $ "  + String.format("%.2f", totalValueInStock());
    };
}
