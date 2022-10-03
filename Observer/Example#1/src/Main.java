public class Main {

    public static void main(String[] args) {

        FirstYearUniversity firstYearUniversity = new FirstYearUniversity();

        Student student = new Student("Asan", firstYearUniversity);
        Student student2 = new Student("Nurasyl", firstYearUniversity);
        Student student3 = new Student("Aset", firstYearUniversity);


        firstYearUniversity.setUniversityNews("Hello freshmen!");


    }
}
