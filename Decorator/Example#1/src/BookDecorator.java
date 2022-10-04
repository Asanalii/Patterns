public class BookDecorator implements Book {
    private Book book;
    private int pages;
    private int tomes;
    private int cost;

    public BookDecorator(Book book, int pages, int tomes, int cost){
        this.book = book;
        this.pages = pages;
        this.cost = cost;
        this.tomes = tomes;
    }

    @Override
    public String getInfo() {
        return ("Book has this characteristics :"+ book.getInfo()+ "\n"+ "Trylogy has this characteristics:" + "Book has" + pages + " pages, and consists" + tomes + " tome");
    }

    @Override
    public int getPrice() {
        return this.cost + book.getPrice();
    }
}
