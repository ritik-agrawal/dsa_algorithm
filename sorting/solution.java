import java.util.Arrays;

import algoritms.QuickSort;
import algoritms.Sorter;

class Solution{


    public static void main(String[] args){
        var sc = SingleScanner.getScanner();
        System.out.println("Get the array to be sorted:");
        var input = sc.nextLine().split(",");
        var nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        Sorter sorter = new QuickSort();
        sorter.sort(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}