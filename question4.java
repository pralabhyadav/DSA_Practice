// program to find repeat
// date 5/1/2025

public class question4 {
   public static void main(String[] args) {
    int a[]={20,10,60,60,20,50};
    
     for(int i=0;i<a.length;i++){
       int count=0;
        for(int j=0;j<a.length;j++){
              if(a[i]==a[j]){
                count++;
              }

        }
        System.out.println("THIS ELEMENT  "+a[i]+" IS REPEAT   "+count+"  TIMES");
     }
     
   } 
}
