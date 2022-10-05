import java.util.ArrayList;
import java.util.List;

public class SecondYearUniversity implements University{
    List<Student> studentsList;

    private String universityNews;

    public SecondYearUniversity(){
        studentsList = new ArrayList<>();
    }

    public void setUniversityNews(String news) {
        this.universityNews = news;
        sendInfo();
    }

    @Override
    public void registerStudent(Student student) {
        studentsList.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentsList.remove(student);

    }

    @Override
    public void sendInfo() {
        for (Student student : studentsList){
            student.sendInfo(universityNews);
        }
    }
}
