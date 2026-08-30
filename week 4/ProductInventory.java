class Product {
    private String code;
    private String name;
    private double price;
    private int quantity;
    private static int productCount = 0;

    Product(String code, String name, double price) {
        this(code, name, price, 0);
    }

    Product(String code, String name, double price, int quantity) {
        this.code = code;
        this.name = name;

        if (price > 0)
            this.price = price;
        else
            this.price = 1;

        if (quantity >= 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        productCount++;
    }

    void restock(int amount) {
        if (amount > 0)
            quantity = quantity + amount;
    }

    boolean sell(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity = quantity - amount;
            return true;
        }
        return false;
    }

    double getInventoryValue() {
        return price * quantity;
    }

    static int getProductCount() {
        return productCount;
    }

    public String toString() {
        return code + " " + name + " Price: " + price
                + " Quantity: " + quantity;
    }
}

public class ProductInventory {
    public static void main(String[] args) {

        Product p1 = new Product("P101", "Pen", 10, 5);
        Product p2 = new Product("P102", "Book", 50);
        Product p3 = new Product("P103", "Bag", 500, 2);

        p1.restock(3);
        p1.sell(2);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("Inventory Value: " + p1.getInventoryValue());
        System.out.println("Product Count: " + Product.getProductCount());
    }
}