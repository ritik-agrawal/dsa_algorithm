### Question:
Given an Integer unsorted array, we need to get the kth max or min number without sorting the given array.

### Solution:
```
if Kth max element than
    buildMaxHeap
else 
    buildMinHeap
```

Now remove the first element with the last element and heapify the array again to rearrange for k-1 times
Now the ar[0] is the answer

### Heap:
Some important/helpful properties of heap:
- parent of the ith index is (i - 1) / 2;
- the left child to an ith index node is at (2*i) + 1
- the right child to an ith index node is at (2*i) + 2