public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    public void giveInfo(CourseStrategy courseStrategy){
        System.out.println("Courses by taken " + name);
        courseStrategy.showCourseDetails();
    }
}
