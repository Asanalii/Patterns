import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PenaltyCalculationStrategy penaltyCalculationStrategy;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of book: ");
        String name = sc.nextLine();
        System.out.println("Enter the price of book: ");
        int price = sc.nextInt();
        System.out.println("Enter how many days do you have the book: ");
        int days = sc.nextInt();
        Books book = new Books(name,price,days);

        book.identifyPenalty(days);
        System.out.println(book.toString());

    }
}
