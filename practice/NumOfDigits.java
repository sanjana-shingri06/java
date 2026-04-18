public class NumOfDigits {
    public static void main(String[] args) {
        int[] nums={12,3333,555,876,2222};
        int ans=findNumbers(nums);
        System.out.println(ans);
        
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;

    }
    static boolean even(int num){
    //int count=0;
    if(num%2==0){
        return true;
    }
    return false;
    }
    static int countDigits(int num){
        int count=0;
        if(num>0){
            count++;
            num=num/10;
            return count;
        }
        return count;
    }
    
}
