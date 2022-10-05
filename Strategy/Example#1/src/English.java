public class English implements CourseStrategy{

    private int Credits;

    public English(){
        this.Credits = 15;
    }

    @Override
    public void showCourseDetails() {
        System.out.println("English total credit:" +Credits);

    }
}
