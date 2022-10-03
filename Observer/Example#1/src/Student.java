public class Student {

    private String name;

    public Student(String name, University university){
        this.name = name;
        university.registerStudent(this);
    }

    void sendInfo(String universityNews){
        System.out.println("Student- "+name + " got news "+ universityNews);
    }


}
