package algoritms;

import static tools.Tools.swap;

public class DualQuickSort implements Sorter {

    @Override
    public void sort(int[] n) {
        implementDualQuickSort(n, 0, (n.length - 1));
    }

    private void implementDualQuickSort(int[] n, Integer low, Integer high){
        if (low == high || low > high){
            return;
        }
        var pivot = partition(n, low, high);
        implementDualQuickSort(n, low, (pivot[0] - 1));
        implementDualQuickSort(n, (pivot[0] + 1), (pivot[1] - 1));
        implementDualQuickSort(n, (pivot[1] +1), high);
    }

    private int[] partition(int[] n, int low, int high){
        if (n[low] > n[high]){
            swap(n, low, high);
        }
        var cur = (low + 1);
        var lpMarker = (low + 1);
        var hpMarker = (high - 1);
        var p = n[low];
        var q = n[high];
        while (cur <= hpMarker){
            if (n[cur] < p){
                swap(n, cur, lpMarker);
                lpMarker++;
            } else if (n[cur] >= q){
                while (n[hpMarker] > q && cur < hpMarker){
                    hpMarker--;
                }
                swap(n, cur, hpMarker);
                hpMarker--;
                if (n[cur] < p){
                    swap(n, cur, lpMarker);
                    lpMarker++;
                }
            }
          cur++;  
        }
        lpMarker--;
        hpMarker++;
        swap(n, low, lpMarker);
        swap(n, high, hpMarker);
        return new int[]{lpMarker, hpMarker};
    }
    
}
