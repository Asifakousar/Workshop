import java.util.*;
public class Main {
    public static int Maximum(int[] a) {
        if (a == null || a.length < 2) {
            return 0;
        }
        int gap =  0;
        for(int i=1;i<a.length-1;i++){
            int max = a[i]-a[i-1];
            if(max>gap){
                gap=max;

            }
        }
        return gap;
    }

    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40};
        System.out.println("Maximum gap:" +Maximum (a));
    }
}
