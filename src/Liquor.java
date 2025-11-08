public class Liquor implements Visitable {
    private double price;

    // Constructor to initialize the price
    Liquor(double item) {
        price = item;
    }

    // Getter method to return the price
    public double getPrice() {
        return price;
    }

    // Accept method for visitor pattern
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
