
// Program to sum all the element of array
// Date ==> 01/01/2025

public class averageOfArray {
    public static void main(String[] args){
      int arry[]={20,15,30,80,4};
      
      int sum=0,length=arry.length;
     
for(int value:arry){
         sum+=value;
        }
        double Average=sum/length;
System.out.println("average of element of array is "+Average);
        

    }
}
