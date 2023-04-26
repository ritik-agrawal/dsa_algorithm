import java.util.Arrays;

import algorithms.BubbleSort;
import algorithms.Sorter;
import tools.SingleScanner;

class Solution{


    public static void main(String[] args){
        var sc = SingleScanner.getScanner(); //An example of Singleton Pattern
        System.out.println("Get the array to be sorted:");
        var input = sc.nextLine().split(",");
        var nums = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        Sorter sorter = new BubbleSort(); // An example of Strategy Pattern
        sorter.sort(nums);
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}