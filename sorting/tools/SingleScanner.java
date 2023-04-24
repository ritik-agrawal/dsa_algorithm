package tools;
import java.util.Scanner;

public class SingleScanner {
    
    private static Scanner onlyScanner = new Scanner(System.in);

    private SingleScanner(){}

    public static Scanner getScanner(){
        return onlyScanner;
    }
    
}
