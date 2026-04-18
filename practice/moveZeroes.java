public  class moveZeroes {
    public static void main(String[] args) {
       
        int[] arr={1,0,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[arr.length-1];
                arr[arr.length-1]=temp;
               


            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
