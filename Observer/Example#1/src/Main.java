public class Main {

    public static void main(String[] args) {

        FirstYearUniversity firstYearUniversity = new FirstYearUniversity();
        SecondYearUniversity secondYearUniversity = new SecondYearUniversity();

        Student student = new Student("Asan", firstYearUniversity);
        new Student("Nurasyl", firstYearUniversity);
        new Student("Aset", firstYearUniversity);
        new Student("Serik",secondYearUniversity);

        firstYearUniversity.setUniversityNews("Hello freshmen!");
        secondYearUniversity.setUniversityNews("Hello 2nd year!");

    }
}
