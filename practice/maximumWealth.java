public class maximumWealth {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{2,5,6},{7,8,9},{22,5,6}};
        int ans=Maximum(accounts);
        System.out.println(ans);

    }
    static int Maximum(int[][] accounts){
        
        int max=0;
        for(int r=0;r<accounts.length;r++){
            int rowSum=0;
            for(int c=0;c<accounts[r].length;c++){
                rowSum=rowSum+accounts[r][c];
            }
            if(rowSum>max){
                max=rowSum;
            }
        }
        return max  ;
    }

    
    
}
