//import java.util.*;
public class demo{
    public static void main(String[] args) {
        int arr[]={1,5,7,3,10,56};
        int max=0;
        int second=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second && arr[i]!=max){
                second=arr[i]; 
            }

        }
        System.out.println(second);
    }
}