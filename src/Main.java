//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Course course = new Course("IT", 8, "Dastan Abdullaev", "16.10.2024");
        System.out.println(course);
        Student student = new Student("Kanykei", "Dzanybekova", "28.12.2007", 20);
        student.setAge(16);
        if (student.getAge()>0) {
            System.out.println(student.getAge());
        }
        else {
            System.out.println("Терс сан");
        }
        System.out.println(student);*/

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(12);
        rectangle.setWidth(8);
        System.out.println(rectan(rectangle.getLength(), rectangle.getWidth()));
    }
        public static int rectan(int length, int width) {
            int a = length * width;
            return a;
        }
    }
