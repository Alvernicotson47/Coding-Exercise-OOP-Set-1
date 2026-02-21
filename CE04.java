import java.util.Scanner;

public class CE04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double inches = sc.nextDouble();
        double weightInKg = pounds * 0.45359237;
        double heightInMeters = inches * 0.0254;
        double b = weightKg / (heightInMeters * heightInMeters);
        System.out.printf("Your BMI is: %.2f\n", b);
    }
}

