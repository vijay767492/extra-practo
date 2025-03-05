
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Vijay");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}
class Student {
    static String college = "JNTU"; // Static variable
     String name;
 
     Student(String name) {
         this.name = name;
     }
 
     void display() {
         System.out.println(name + " - " + college);
     }
 }
 