import java.util.Scanner;
public class DisplaySubjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle ");
        System.out.println("4. Exit");

        while (true) {
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println(" Print the rectangle ");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 9; j++) {
                            System.out.print("* ");
                        }   System.out.println();
                    }
                    break;
                case 2:
                    System.out.println(" Print the square triangle ");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }   System.out.println();
                    }
                    break;
                case 3:
                    System.out.println(" Print isosceles triangle");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("* ");
                        }   System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(4);
                default:
                    System.out.println("Input again!");
            }
        }
    }
}