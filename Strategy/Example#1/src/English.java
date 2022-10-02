public class English implements CourseStrategy{

    private int Credits;

    public English(int credit){
        this.Credits = credit;
    }

    @Override
    public void showCourseDetails() {
        System.out.println("English total credit:" +Credits);

    }
}
