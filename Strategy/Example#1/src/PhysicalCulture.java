public class PhysicalCulture implements CourseStrategy{

    private int Credits;

    public PhysicalCulture(){
        this.Credits = 2;
    }

    @Override
    public void showCourseDetails() {
        System.out.println("Physical cultures total credit: " + Credits);
    }
}
