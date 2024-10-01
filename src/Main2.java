public class Main2 {
    public static void main(String[] args) {
        int numberOfStudents = 20, temperature = 15;
        boolean isRainy = true;
        if (temperature > 10 && temperature < 35) { // true && true
            // && - логический оператор и (AND)
            System.out.println("Хорошей прогулки");
        }

        if (numberOfStudents == 22 && temperature > 7) { // false && true
            System.out.println("Играем в футбол");
        }

        if (isRainy || temperature < 15) { // true || false
            // || - логический оператор или (OR)
            System.out.println("Холодно");
        }

        if (isRainy) {
        } else {
            System.out.println("Идем купаться");
        }

        if (!isRainy) { // false
            // ! - логический оператор отрицания не (NOT)
            System.out.println("Идем купаться");
        }

        if (temperature > 0 && temperature < 15
                || numberOfStudents > 5 && numberOfStudents < 10
                || isRainy) {
            // true && false || true && false || true
            // => 1 * 0 + 1 * 0 + 1 => 0 + 0 + 1 = 1 (TRUE)
            System.out.println("Идем в кафе");
        }

        if (temperature > 0 && (temperature < 15 || numberOfStudents > 5)
                && numberOfStudents < 10 || isRainy) {
            // true && (false || true) && false || true
            // => 1 * (0 + 1) * 0 + 1 => 1 * 1 * 0 + 1 => 0 + 1 = 1 (TRUE)
            System.out.println("Идем в кино");
        }
    }
}
