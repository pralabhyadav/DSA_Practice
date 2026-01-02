//count even and odd in array
// Date ==> 02/01/2025

public class countEvenOdd {
    public static void main(String[] args) {
        int a[]={60,5,20,60,12,31};
int counte=0,counto=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                   counte++;
            }
            else{
                counto++;
            }
        }
        System.out.println("THERE ARE "+counte+ " EVEN ELEMENT IN ARRAY ");
        System.out.println();
        System.out.println("THERE ARE "+counto+ " ODD  ELEMENT IN ARRAY ");
    }
}
