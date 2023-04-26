package tools;

public class Tools {


    // An example of reusability and Extraction of commonly used 
    // methods.
    public static void swap(int[] n, int a, int b){
        var tmp = n[a];
        n[a] = n[b];
        n[b] = tmp;
    }
    
}
