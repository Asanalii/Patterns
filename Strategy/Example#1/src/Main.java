import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);



        Student student = new Student("Asanali");
        Student student2 = new Student("Aset");


        student.giveInfo(new SoftwareDesignPatterns());
        student2.giveInfo(new English());

    }
}
