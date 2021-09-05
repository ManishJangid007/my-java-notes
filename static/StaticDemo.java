import encapsulation.student;

package static;

public class StaticDemo {
    public static void main(String[] args) {
        student jhon = new Student("Jhon", 25, "23 East, California");

        System.out.println(jhon.getName());
        System.out.println(jhon.getAge());
        System.out.println(jhon.getAddress());
        System.out.println(Student.collage);
    }
}
