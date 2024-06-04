import java.rmi.StubNotFoundException;
import java.time.LocalDate;
import java.util.Locale;

public interface Crud {
    String createCourse(Course course);
    Course getCourseByld(Long id);
    void  getAllCourse();
    Course updateCourse(Long id,Course newCourse);
    String deleteCourse(Long id);
    //CRUD
    /*C-CREATE
    R-READ
    U-UPDATE
    D-DELETE
     */


}
