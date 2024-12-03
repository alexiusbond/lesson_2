public class Lesson_2_3 {
    public static void main(String[] args) { // DRY
        System.out.println("ЗАВТРАК");
        makeTea();

        System.out.println("ОБЕД");
        makeTea();

        System.out.println("УЖИН");
        makeTea();

        addition(2, 4, "Результат:");
        addition(20, 16, "Сумма чисел:");

        calculatePerimeter("Аудитория 4", 4.5f, 5.0f);
        calculatePerimeter("Кухня", 4, 6.5f);

        int areaOfAuditory4 = calculateArea(4.5f, 5.0f);
        int areaOfKitchen = calculateArea(4, 6.5f);
        System.out.println("Площадь Аудитории 4: " + areaOfAuditory4 + " " + unit() + " в квадрате.");
        System.out.println("Площадь Кухни: " + areaOfKitchen + " " + unit() + " в квадрате.");
        System.out.println("ОБЩАЯ Площадь: " + (areaOfAuditory4 + areaOfKitchen)
                + " " + unit() + " в квадрате.");
    }

    public static String unit() {
        // метод возвращаемый без параметров
        return "см";
    }

    public static int calculateArea(float length, float width) {
        // метод возвращаемый с параметрами
        int area = Math.round(length * width);
        return area;
    }

    public static void calculatePerimeter(String roomName, float length, float width) {
        // метод невозвращаемый с параметрами
        System.out.println("Периметр комнаты " + roomName + ": "
                + (2 * (length + width)) + " " + unit());
    }

    public static void addition(int num1, int num2, String phrase) {
        // метод невозвращаемый с параметрами
        int result = num1 + num2;
        System.out.println(phrase + " " + result);
    }

    public static void makeTea() {
        // метод невозвращаемый без параметров
        System.out.println("Вскипятить воду");
        System.out.println("Насыпать заварку");
        System.out.println("Залить кипятком");
        System.out.println("Дать настояться");
        System.out.println("Налить в чашку");
        System.out.println("Добавить сахар или молоко по-вкусу");
    }
}
