package heap;

public class MinHeapBuilder extends AbstractHeapBuilder {

    @Override
    public int compare(int[] ar, int a, int b) {
        var ret = a;
        if (ar[a] > ar[b]){
            ret = b;
        }
        return ret;
    }
    
}
