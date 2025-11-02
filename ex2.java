import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть x: ");
        double x = scanner.nextDouble();

        double fx;

        if (x > -3 && x < 3) {
            fx = Math.sqrt(x * x - a);
        } else if (x == 3) {
            fx = 5 * Math.pow(x, 3) - b * x + 3;
        } else if (x > 3 && x < 8) {
            fx = Math.cos(x);
        } else {
            System.out.println("x не підходить");
            scanner.close();
            // нам треба ввести 3 різних числа і всі вони пов'язані з кожною дією, щоб дізнатися f(x) треба, щоб ОСТАННІЙ х задовольняв умову, наприклад, якщо ввести останнє "Введіть х" число 9, то нічого не вийде:(, бо за умовою у нас є обмеження від -3 до 8, з цього зрозуміло, що якщо ввести замість числа а число, яке МЕНЬШЕ за -3, то теж нічого не вийде
            return;
        }

        System.out.printf("f(x) = %.5f%n", fx);

        scanner.close();
    }
}
