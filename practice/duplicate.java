public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,4,5,6,7};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
     for(int i=0;i<=j;i++){
        System.out.print(arr[i] + " ");     }
    
    
}
}
