import java.util.Scanner;
public class valueCheck {
    public static void main(String[]args){


int arr[] = {1, 2, 6, 5, 4, 5, 2,  7};
int n = 10; // we want to check numbers from 1 to 10

boolean a[] =new boolean[n+1];

for(int c:arr){
if(c<=n) a[c]=true;
}

for(int b=1;b<=10;b++){
if(!a[b]){
System.out.println(b+" misssing");}
}}}
 