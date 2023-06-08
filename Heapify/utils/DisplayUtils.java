package utils;

import java.util.Arrays;

public class DisplayUtils {

    private static final String braces = "%s [%s]";
    
    public static void displayArray(String pre, int[] ar){
        if (null != pre){System.out.printf(pre);}
        var array = new StringBuilder();
        Arrays.stream(ar).forEach(i -> {array.append(" ").append(String.valueOf(i)).append(" ");});
        displayWithBraces("Array", array.toString());
    }

    private static void displayWithBraces(String a, String b){
        System.out.println(String.format(braces, a, b));
    }

}
