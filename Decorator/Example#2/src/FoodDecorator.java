public class FoodDecorator implements Food{
    private Food food;
    private String name;
    private int price;

    public FoodDecorator(Food food, String name , int price){
        this.food = food;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getInfo() {
        return this.name + " " + this.price;
    }
}
