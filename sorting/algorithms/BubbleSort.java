package algorithms;

import static tools.Tools.swap;

public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] n) {
        var sorted = true;
        var nlen = n.length;
        while (sorted){
            sorted = false;
            for (int cur = 0; cur < (nlen - 2); cur++){
                if (n[cur] > n[cur + 1]){
                    sorted = true;
                    swap(n, cur, (cur + 1));
                }
            }
        }
    }
    
}
