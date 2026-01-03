   // Find an second largest element in arrry
// DATE - 03/01/2025

public class secondLargest {
 


    public static void main(String[] args) {
        int a[]={10,-8,30,8};
        int temp;
        for(int i=0;i<a.length-1;i++){
         if (a[i]>a[i+1]) {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
         }    
         
        }
        System.out.println(a[a.length-2]);
    }
}

