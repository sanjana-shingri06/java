public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,6,7,8,9,55};
        int target=6;
        int start=1;
        int end=7;
        int ans=Search(arr,target,start,end);
        System.out.println(ans);
        
    }
    static int Search(int[] arr,int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(target==arr[i]){
                return i;
            }
           
        } 
        return -1;
    }
    
}
