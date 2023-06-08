import heap.AbstractHeapBuilder;
import heap.MaxHeapBuilder;
import heap.MinHeapBuilder;
import utils.DisplayUtils;
import utils.SingleScanner;

class Solution{

    public static void main(String[] args){
        var sc = SingleScanner.getScanner();
        System.out.println("Please give an integer array to heaify.");
        var in = sc.nextLine().split(",");
        var ar = new int[in.length];
        for (int cur = 0; cur < in.length; cur++){
            ar[cur] = Integer.valueOf(in[cur]);
        }
        System.out.println("1> MinHeap \n2> maxHeap");
        var heapType = sc.nextInt();
        AbstractHeapBuilder builder = null;
        switch(heapType){
            case 1:
                builder = new MinHeapBuilder();
                break;
            
            case 2:
                builder = new MaxHeapBuilder();
                break;

            default:
                System.out.println("Please enter a valid input.");
        }
        builder.buildHeap(ar);
        DisplayUtils.displayArray("Heaified Array is \n", ar);
        System.out.println("What is the value of K?");
        var k = sc.nextInt();
        var ret = 0;
        var alen = ar.length;
        for(int i = 0; i < (k-1); i++){
            int sup = Integer.MAX_VALUE;
            if (heapType == 2){
                sup = Integer.MIN_VALUE;
            }
            if (alen == 0){
                ret = sup;
            }

            ret = ar[0];
            if (alen > 1){
                ar[0] = ar[alen - 1];
                builder.heapify(ar, alen, 0);
            }
            alen--;
        }
        ret = ar[0];
        switch(heapType){
            case 1:
                System.out.println("Kth smallest element is "+ ret);
                break;

            case 2:
                System.out.println("Kth Largest element is "+ ret);
                break;
        }
    }
}