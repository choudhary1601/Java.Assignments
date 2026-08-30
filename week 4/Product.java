class Product{
    private String code;
    private String name;
    private double unitPrice;
    private int quantity;

    private static int productCount = 0;

    Product(String code, String name, double unitPrice) {
        this(code, name, unitPrice, 0);
    }

    Product(String code, String name, double unitPrice, int quantity) {
        if (unitPrice < 0 || quantity < 0)
            System.out.println("Invalid price or quantity");

        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        productCount++;
    }

    void restock(int amount) {
        if (amount < 0)
            System.out.println("Amount cannot be negative");

        quantity += amount;
    }

    boolean sell(int amount) {
        if (amount < 0 || amount > quantity)
            return false;

        quantity -= amount;
        return true;
    }

    double getInventoryValue() {
        return unitPrice * quantity;
    }

    static int getProductCount() {
        return productCount;
    }

    public String toString() {
        return code + " - " + name +
               " | Price: " + unitPrice +
               " | Quantity: " + quantity;
    }
}

