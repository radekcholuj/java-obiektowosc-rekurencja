import java.util.Scanner;

public class FactorialsApp {
    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("n: ");
            int n = scanner.nextInt();

            // pętla
            long factorials = n;
            for (int i = n - 1; i >= 1; i--) {
                factorials *= i;
            }
            System.out.println("Factorials (" + n + ") = " + factorials);

            // rekurencja
            Math math = new Math();
            factorials = math.factorials(n);
            System.out.println("Factorials (" + n + ") = " + factorials);
        }
    }
}