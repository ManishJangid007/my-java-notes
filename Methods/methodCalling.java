package Methods;

public class methodCalling {
    public static void main(String[] args) {
        int i = 1;
        int result = changeValue(i);
        System.out.println("i is : " + result);

        Student jhon = new Student("Jhon", 25, "23, East, California");

        // changeNameInSameObject(jhon);

        System.out.println(jhon.getName());

        Student resultObj = changeNameInDifferentObject(jhon)

        System.out.println(resultObj.getName());
        
        System.out.println(jhon.getAge());
        System.out.println(jhon.getAddress());
    }

    private static int changeValue(int i) {
        i = i + 1;
        return i;
    }

    // static void changeNameInSameObject(Student student) { // this is wrong way of
    // passing arguments
    // student.setName("Jane");
    // }

    static Student changeNameInDifferentObject(Student student) { // this is correct way
        Student newStudent = new Student("Jane", student.getAge(), student.getAddress());
        return newStudent;
    }
}
