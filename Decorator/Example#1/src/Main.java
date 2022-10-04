public class Main {

    public static void main(String[] args) {
	// write your code here

        Book book = new SimpleBook(300,1,500);
        Book encyclopedia = new Encyclopedia(book,900,1,400);
        Book trylogy = new Trylogy(book,500,800);

        System.out.println(trylogy.getInfo());

    }
}
