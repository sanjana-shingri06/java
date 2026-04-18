public class SearchInStr {
    public static void main(String[] args) {
        String str="Sanjana";
        char target='S';
        boolean ans=Search(str,target);
        System.out.println(ans);
        
    }
    static boolean Search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    
}
