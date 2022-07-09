package inheritance.bakery;

public class Cake {
    private String flavor;
    private double price;

    public Cake() {
        this("Vanilla");
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Cake(String flavor){
        setFlavor(flavor);
        setPrice(9.99);
    }
}
