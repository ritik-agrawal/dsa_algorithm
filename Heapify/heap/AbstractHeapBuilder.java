package heap;

public abstract class AbstractHeapBuilder {

    public void buildHeap(int[] ar) {
        var nodes = ar.length;
        var i = getNonLeafNode(nodes);
        for(int cur = i; cur >= 0; cur--){
            heapify(ar, nodes, cur);
        }
    }

    private int getLeftIndex(int i){
        return ((2*i) + 1);
    }

    private int getRightIndex(int i){
        return ((2*i) + 2);
    }

    // private int getParentIndex(int i){
    //     return ((i - 1)/2);
    // }

    private int getNonLeafNode(int n){
        return ((n/2) - 1);
    }

    public void heapify(int[] ar, int nodes, int cur){
        var extreme = cur;
        var left = getLeftIndex(cur);
        left = ((left < nodes) ? left : cur);
        var ryt = getRightIndex(cur);
        ryt = ((ryt < nodes) ? ryt : cur);
        extreme = compare(ar, extreme, left);
        extreme = compare(ar, extreme, ryt);

        if (extreme != cur){
            swap(ar, extreme, cur);
            heapify(ar, nodes, extreme);
        }
    }

    private void swap(int[] ar, int a, int b){
        int tmp = ar[a];
        ar[a] = ar[b];
        ar[b] = tmp;
    }

    public abstract int compare(int[] ar, int a, int b);
    
}
