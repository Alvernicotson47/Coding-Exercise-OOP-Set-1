import java.util.Scanner;

public class CE02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = input.nextDouble(); 
        System.out.println("Enter b:");
        double b = input.nextDouble();
        System.out.println("Enter c:");
        double c = input.nextDouble();
        System.out.println("Enter d:");
        double d = input.nextDouble();
        System.out.println("Enter e:");
        double e = input.nextDouble();
        System.out.println("Enter f:");
        double f = input.nextDouble();
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        if (D == 0) {
            System.out.println("The equation has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;
            System.out.printf("x = %.2f\n", x);
            System.out.printf("y = %.2f\n", y);
        }

        input.close();
    }
}
