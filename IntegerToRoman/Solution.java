import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    
    private Map<Integer, String> map = 
        Map.ofEntries(
            Map.entry(1 , "I"),
            Map.entry(4 , "IV"),
            Map.entry(5 , "V"),
            Map.entry(9 , "IX"),
            Map.entry(10 , "X"),
            Map.entry(40 , "XL"),
            Map.entry(50 , "L"),
            Map.entry(90 , "XC"),
            Map.entry(100 , "C"),
            Map.entry(400 , "CD"),
            Map.entry(500 , "D"),
            Map.entry(900 , "CM"),
            Map.entry(1000 , "M")
        );

    private List<Integer> lst = Stream.of(1,4,5,9,10,40,50,90,100,400,500,900,1000).collect(Collectors.toList());

    private class Node{
        Integer value;
        Node left;
        Node right;

        public Node(Integer value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

    private Node constructBST(List<Integer> lst){
        var end = lst.size() - 1;
        return bsTree(lst, 0, end);
    }

    private Node bsTree(List<Integer> lst, int strt, int end){
        if (strt > end){
            return null;
        }
        if (strt == end){
            return new Node(lst.get(strt));
        }
        int m = ((strt + end) / 2);
        var node = new Node(lst.get(m));
        node.left = bsTree(lst, strt, (m-1));
        node.right = bsTree(lst, (m+1), end);
        return node;
    }

    private Integer getNearestValue(int rem, Node head){
        var ret = -1;
        if (null == head){
            return -1;
        }
        var nodeValue = head.value;
        if (rem > nodeValue){
            ret = getNearestValue(rem, head.right);
        } else {
            ret = getNearestValue(rem, head.left);
        }
        if (ret == -1 && rem >= nodeValue){
            ret = nodeValue;
        }
        return ret;
    }

    public String intToRoman(int num) {
        Node head = constructBST(lst);
        var sb = new StringBuilder();
        var rem = num;
        while (rem > 0){
            var value = getNearestValue(rem, head);
            rem-=value;
            sb.append(map.get(value));
        }
        return sb.toString();
    }
}
