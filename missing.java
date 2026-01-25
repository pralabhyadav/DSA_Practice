public class missing{
    public static void main(String[] args) {
        int arr[]={1,4,6,8,5,2,9,7,3};
        int n=10;
        
       for(int i=1;i<=n;i++){
         int count=0;
        for(int j=0;j<arr.length;j++){
           
            if(arr[j]==i){
                count++;
                
            }
           
        }
         if (count==0) {
                System.out.println(i +" is not present in array");
            }
       }

    }
}