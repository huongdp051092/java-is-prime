import java.util.Scanner;

public class IsPrime20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in ra: ");
        int numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        while (count < numbers) {
            boolean isNotPrime = false;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isNotPrime = true;
                    break;
                }
            }
            if (!isNotPrime) {
                System.out.println("So nguyen to la " + N);
                count++;
            }
            N++;
        }
    }
}
