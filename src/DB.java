 import java.util.Random;

public class DB implements Crud {
    private final Course[] courses = new Course[10];
    private int courseCount = 0;

    @Override
    public String createCourse(Course course) {
        courses[courseCount++] = course;
        return "course add" + course;
    }

    @Override
    public Course getCourseByld(Long id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    @Override
    public void getAllCourse() {
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i]);
        }
    }

    @Override
    public Course updateCourse(Long id, Course newCourse) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getId().equals(id)) {
                courses[i] = newCourse;
                System.out.println("Course updated"+newCourse);
            }
        }
        return null;
    }

    @Override
    public String deleteCourse(Long id) {
        for (int i = 0; i < courseCount; i++) {
            if (courses[i].getId().equals(id)) {
                for (int j = 0; j < courseCount - 1; j++) {
                    courses[i] = courses[j + 1];
                }
                courseCount--;
                return "Course deleted!";
            }
        }
        return "Course not found!";
    }
}


