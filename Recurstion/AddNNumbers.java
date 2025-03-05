package Recurstion;

public class AddNNumbers {
    public static int natural_numbers(int a) { 
        if (a == 0) {
            return 0; 
        }

        int sum = a + natural_numbers(a - 1); 
        System.out.println("The sum of first " + a + " numbers is " + sum);
        return sum;
    }

    public static void main(String[] args) {
        natural_numbers(5); 
    }
}
