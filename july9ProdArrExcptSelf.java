import java.util.Arrays;

public class july9ProdArrExcptSelf {
    public static int[] productExceptItself(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int ans[] =new int[arr.length];

        left[0] = 1;
        for(int i=1;i<arr.length;i++){
            left[i] = left[i-1]*arr[i-1];
        }

         right[arr.length-1] = 1;
        for(int i=arr.length-2;i>-1;i--){
           right[i] =right[i+1] * arr[i+1];
        }

        for(int i=0;i<arr.length;i++){
            ans[i] = left[i] * right[i];
        }

        return ans;


    }
    public static void main(String[] args) {
         int arr[] = {3,4,6,1,2};
         System.out.println(Arrays.toString(productExceptItself(arr)));
    }
}
