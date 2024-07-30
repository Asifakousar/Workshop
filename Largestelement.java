import java.util.*;
public class Largestelement {
    public static int largest(int [] a, int k){
        PriorityQueue<Integer>minHeap = new PriorityQueue<>(k);
        for(int num :a){
            minHeap.offer(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int [] a = {1,28,30, 4, 6,89};
        int k=1;
        System.out.println("The"+" "+k+ " "+"the largest element is:"+ largest(a,k));
    }
}
