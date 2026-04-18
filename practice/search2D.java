import java.util.Arrays;

public class search2D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6,7},{11,12},{23,55}};
        int target=11;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
        
    } 
    static int[] search(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
