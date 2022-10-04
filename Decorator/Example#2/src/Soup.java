public class Soup implements Food{
    private String name = "Soup";
    private int price;

    public Soup(int price){
        this.price = price;
    }

    @Override
    public String getInfo() {
        return (name + " costs "+ price);
    }
}
