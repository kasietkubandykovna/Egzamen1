import java.time.LocalDate;
import java.util.Random;

public class Course  {
    private Long id;
    private  String name;
    private String description;
    private LocalDate localdate;
    private StadyFormat stadyFormat;

    public Course() {
    }

    public Course(Long id, String name, String description, LocalDate localdate, StadyFormat stadyFormat) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.localdate = localdate;
        this.stadyFormat = stadyFormat;
    }

    public Course(String name, String description, LocalDate localdate, StadyFormat stadyFormat) {
        this.name = name;
        this.description = description;
        this.localdate = localdate;
        this.stadyFormat = stadyFormat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setLocaldate(LocalDate localdate) {
        this.localdate = localdate;
    }

    public void setStadyFormat(StadyFormat stadyFormat) {
        this.stadyFormat = stadyFormat;
    }

    public StadyFormat getStadyFormat() {
        return stadyFormat;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public void setLocaldateDuration(LocalDate localdateDuration) {

        this.localdate = localdateDuration;
    }

    public static void create(){

    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getDescription() {
        return description;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", localdate=" + localdate +
                ", stadyFormat=" + stadyFormat +
                '}';

}
}
