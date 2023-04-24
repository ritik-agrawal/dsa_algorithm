package algoritms;

public class QuickSort implements Sorter {

    @Override
    public void sort(int[] n) {
        implementQuickSort(n, 0, (n.length -1));
    }

    private void implementQuickSort(int[] n, Integer low, Integer high){
        if (low < high){
            var pivot = partition(n, low, high);
            implementQuickSort(n, low, (pivot -1));
            implementQuickSort(n, (pivot + 1), high);
        }
    }

    private Integer partition(int[] n, Integer low, Integer high){
        var pivot = n[high];
        var smallMarker = low - 1;
        for (int i = low; i < high; i++){
            if (n[i] < pivot){
                smallMarker++;
                swap(n, smallMarker, i);
            }
        }
        swap(n, smallMarker+1, high);
        return (smallMarker+1);
    }

    private void swap(int[] n, Integer a, Integer b){
        var tmp = n[a];
        n[a] = n[b];
        n[b] = tmp;
    }
    
}
