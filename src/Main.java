import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
Crud crud=new DB();
        Course course1=new Course(1L,"Java","Description", LocalDate.of(2024,4,1),StadyFormat.ONLINE);
        Course course2=new Course(2L,"JS","Description", LocalDate.of(2024,4,1),StadyFormat.ONLINE);
        Course course3=new Course(3L,"Java","Description", LocalDate.of(2024,4,1),StadyFormat.ONLINE);

// ADD course

        System.out.println(crud.createCourse(course1));
        System.out.println(crud.createCourse(course2));
        System.out.println(crud.createCourse(course3));

        // Get by id

        System.out.println("Get by id Course : ");
        System.out.println(crud.getCourseByld(2L));

        //Get all Courses
        System.out.println("All courses : ");
        crud.getAllCourse();

        //Update course

        System.out.println("Update course : ");
        Course newCourse=new Course(3L,"Python","description3",LocalDate.of(2024,6,1),StadyFormat.OFFLINE);
        System.out.println(crud.updateCourse(2L, newCourse));

//Delete course

        System.out.println("Delete course" );
        System.out.println(crud.deleteCourse(1L));
        System.out.println("All courses after deletion");
        crud.getAllCourse();
    }
}