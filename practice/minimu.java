public class minimu {
    public static void main(String[] args) {
        int[] arr={1,2,333,55,66,-1};
        int ans=min(arr);
        System.out.println(ans);
        
    }
    static int min(int[] arr){
        if(arr.length==0){
            return -1;
            
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    
}
