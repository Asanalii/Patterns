public class SoftwareDesignPatterns implements CourseStrategy{


    private int Credits;

    public SoftwareDesignPatterns(){
        this.Credits = 5;
    }

    @Override
    public void showCourseDetails() {
        System.out.println("Software Design Patterns total credit:" + Credits);

    }
}
