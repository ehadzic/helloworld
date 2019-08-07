package ba.unsa.etf.rpr.helloworld;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world" + " nešta još");
        Student student = new Student();
        student.setName("Aid");
        student.setSurname("Ne znam");
        student.setAge(22);
        System.out.println(student);
    }
}
