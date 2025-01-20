package CHorizon;

import java.util.Scanner;

 class Chorizon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = scanner.nextInt();
        if (H < 0) {
            System.out.println("Height cannot be negative.");
            scanner.close();
            return;
        }
        
        double result = Math.sqrt((long) H * (12800000L + H));
        

        System.out.printf("%.2f\n", result);

        scanner.close();
    }
}