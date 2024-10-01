import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hi sensei
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Число равно одному");
                break;
            case 2:
                System.out.println("Число равно двум");
                break;
            case 3:
                System.out.println("Число равно трем");
                break;
            default:
                System.out.println("Число неизвестно");
                break;
        }
        // End of program
    }
}