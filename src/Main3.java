import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) { // DRY
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();
        addition(2, 3, "Сумма чисел:");
        addition(10, 65, "Результат сложения -");
        calculatePerimeter(5.7f, 5.1f, "Аудитория 1");
        calculatePerimeter(3.5f, 2.0f, "Кухня");
        calculatePerimeter(7, 10, "Холл");
        int areaOfAuditory1 = calculateArea(5.7f, 5.1f);
        System.out.println("Площадь Аудитории 1: " + areaOfAuditory1);
        int areaOfKitchen = calculateArea(3.5f, 2.0f);
        System.out.println("Площадь Кухни: " + areaOfKitchen);
        int areaOfHall = calculateArea(7, 10);
        System.out.println("Площадь Холла: " + areaOfHall);
        System.out.println("Общая площадь: " +
                (areaOfAuditory1 + areaOfKitchen + areaOfHall));
        System.out.println("Приятно познакомиться, " + nameInput());
    }

    public static String nameInput() {
        // возвращаемый метод без параметров
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        return sc.nextLine();
    }

    public static int calculateArea(float length, float width) {
        // возвращаемый метод с 2-мя параметрами
        int area = Math.round(length * width);
        return area;
    }

    public static void calculatePerimeter(float length, float width, String roomName) {
        // невозвращаемый метод с 3-мя параметрами
        float perimeter = (length + width) * 2;
        System.out.println("Периметр комнаты " + roomName + ": " + perimeter);
    }

    // method signature           // parameters
    public static void addition(int num1, int num2, String phrase) {
        // невозвращаемый метод с 3-мя параметрами
        System.out.println(phrase + " " + (num1 + num2));
    }

    public static void makeTea() {
        // невозвращаемый метод без параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить молоко или сахар по-вкусу");
        duration();
    }


    public static void duration() {
        // невозвращаемый метод без параметров
        System.out.println("Процесс занял 10 минут");
    }
}
