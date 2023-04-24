package tools;

public class Tools {


    public static void swap(int[] n, int a, int b){
        var tmp = n[a];
        n[a] = n[b];
        n[b] = tmp;
    }
    
}
