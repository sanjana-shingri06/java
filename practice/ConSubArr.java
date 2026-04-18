public class ConSubArr {
    public static void main(String[] args) {
        int[] arr={-1,2,5,8,10,11,44,55,99};
        int k=18;
        int l=0;
        int r=0;
        int sum=0;
        int MaxLen=0;
        int start=-1,end=-1;
        while(r<arr.length){
            sum=sum+arr[r];
            if(sum>k){
                sum=sum-arr[l];
                l++;
            }
            if(sum<=k){
                MaxLen=Math.max(MaxLen,r-l+1);
                start=l;
                end=r;
                
            }
            r++;
        }
        System.out.println(MaxLen);
        System.out.println("Start index: " + start + ", End index: " + end);
      

    }
    
}
