public class Main {

    public static void main(String[] args) {

        Food food = new Soup(1000);

        Food foodWithHorseMeat = new SoupWithHorseMeat(food);
        Food foodWithBeefMeat = new SoupWithBeefMeat(food);

        System.out.println(foodWithHorseMeat.getInfo());
        System.out.println(foodWithBeefMeat.getInfo());

    }
}
