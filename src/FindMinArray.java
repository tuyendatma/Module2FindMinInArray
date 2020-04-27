import java.util.Arrays;
import java.util.Collections;

public class FindMinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1,6,7,8,9,0};
        int index = findMin(arr);
        int min=arr[index];
        //int index = Arrays.binarySearch(arr,0);
        //binarySearch khi su dung thi mang phai duoc sap xep truoc;
        System.out.println("Gia tri nho nhat cua mang la: "+min+" tai vi tri "+index);
    }
    public static int findMin(int[] arr){
        int min=arr[0];
        int index =0;
        for (int i = 1; i <arr.length ; i++) {
            if(min>arr[i]){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }
}
