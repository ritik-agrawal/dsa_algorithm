package algoritms;

import static tools.Tools.swap;

public class SelectionSort implements Sorter {

    @Override
    public void sort(int[] n) {
        var nlen = n.length;
        var sortedMarker = (nlen - 1);
        while (sortedMarker != 0){
            var limit = sortedMarker - 1;
            for(int cur = 0; cur <= limit; cur++){
                var left = n[cur];
                var ryt = n[cur + 1];
                if (left > ryt){
                    swap(n, cur, (cur + 1));
                }
            }
            sortedMarker--;
        }
    }
    
}
