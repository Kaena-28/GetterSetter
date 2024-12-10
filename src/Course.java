public class Course {
    private String name;
    private int number;
    private String teacherName;
    private String startedCourse;

    public Course() {
    }

    public Course(String name, int number, String teacherName, String startedCourse) {
        this.name = name;
        this.number = number;
        this.teacherName = teacherName;
        this.startedCourse = startedCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getStartedCourse() {
        return startedCourse;
    }

    public void setStartedCourse(String startedCourse) {
        this.startedCourse = startedCourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", teacherName='" + teacherName + '\'' +
                ", startedCourse='" + startedCourse + '\'' +
                '}';
    }
}
