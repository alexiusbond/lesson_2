public class Lesson_2_2 {
    public static void main(String[] args) {
        int temperature = 5;
        int numberOfStudents = 10;
        boolean isSnowy = false;

        if (temperature > 0 && numberOfStudents > 5) { // логический оператор И (AND) - &&
            System.out.println("Идем в парк");
        }

        if (temperature > 20 && numberOfStudents > 8) {
            System.out.println("Идем купаться");
        }

        if (temperature < 10 || isSnowy) { // логический оператор ИЛИ (OR) - ||
            System.out.println("Остаемся дома");
        }

        if (temperature == 13 || isSnowy) {
            System.out.println("Идем лепить снеговика");
        }

        /*if (isSnowy) {
        } else {
            System.out.println("Идем гулять");
        }*/
        if (!isSnowy) { // логический оператор отрицания НЕ (NOT) - !
            System.out.println("Идем гулять");
        }

        if (!(temperature > 20 && numberOfStudents > 8)) {
            System.out.println("Идем купаться");
        }

        if (temperature > 15 && temperature < 40 || numberOfStudents >= 10 || isSnowy) {
            // false && true || true || false => 0 * 1 + 1 + 0 => 0 + 1 + 0 = 1(true)
            System.out.println("Едем в школу");
        }

        if (temperature > 15 && (temperature < 40 || numberOfStudents >= 10 || isSnowy)) {
            // false && (true || true || false) => 0 * (1 + 1 + 0) => 0 * 1 = 0(false)
            System.out.println("Едем на пикник");
        }
    }
}
