import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, total;
        System.out.print("Fibonacci Serisinin Sonunu Girin:");
        n = input.nextInt();
        int s1 = 0;
        int s2 = 1;
        for (i = 1; i <= n; i++) {
            System.out.print(s1 + " ");
            total = s1 + s2;
            s1 = s2;
            s2 = total;
        }
    }
}