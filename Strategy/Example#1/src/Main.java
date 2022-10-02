import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


//        System.out.println("Please, select a course:" + "\n" +
//                "1 - Physical culture" + "\n" +
//                "2 - Software Design Patterns" + "\n" +
//                "3 - English");

        Student student = new Student("Asanali");
        Student student2 = new Student("Aset");

        student.giveInfo(new SoftwareDesignPatterns());
        student2.giveInfo(new English(15));

    }
}
