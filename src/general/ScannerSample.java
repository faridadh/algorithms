package general;

import java.util.Scanner;

public class ScannerSample {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        String line = scanner.nextLine();
        String token = scanner.next();

        System.out.println(i);
        System.out.println(line);
        System.out.println(token);

    }
}
