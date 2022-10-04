public class SimpleBook implements Book{

    private int pages;
    private int tomes;
    private int cost;

    public SimpleBook(int pages, int tomes,int price ){
        this.pages = pages;
        this.tomes = tomes;
        this.cost = price;
    }

    @Override
    public String getInfo() {
        return ("Book has " + pages + " pages, and consists" + tomes + " tome");
    }

    @Override
    public int getPrice() {
        return this.cost;
    }

}
