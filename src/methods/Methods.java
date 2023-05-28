package methods;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static int methodScanner(String scannerInput) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(scannerInput);
        return scanner.nextInt();
    }
    public static int methodRandom(){
        Random random= new Random();
        return random.nextInt(1,100);
    }
}
