import java.util.Scanner;

public class grade {
    public static void main(String[]args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your grade !!");
        double grade = inp.nextDouble();


        if (grade >= 2.00 && grade < 2.99) {
            System.out.println("Fail");
        } else if (grade >= 3.00 && grade < 3.49) {
            System.out.println("Poor");
        } else if (grade >= 3.50 && grade < 4.49) {
            System.out.println("Good");
        } else if (grade >= 4.50 && grade < 5.49) {
            System.out.println("Very Good");
        } else if (grade >= 5.50 && grade <= 6.00) {
            System.out.println("Excellent");
        } else {
            System.out.println("Invalid grade entered.");
        }
    }


}
