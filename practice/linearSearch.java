public class linearSearch {
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,5,5,8,9,10};
        int target=6;
        int ans=Search(nums,target);
        System.out.println(ans);
        
    }
    static int Search(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1; 
    }
    
}
