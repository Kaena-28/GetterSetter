public class Student {
    private String name;
    private String surname;
    private String birtday;
    private int age;

    public Student() {
    }

    public Student(String name, String surname, String birtday, int age) {
        this.name = name;
        this.surname = surname;
        this.birtday = birtday;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirtday() {
        return birtday;
    }

    public void setBirtday(String birtday) {
        this.birtday = birtday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birtday='" + birtday + '\'' +
                ", age=" + age +
                '}';
    }
}
