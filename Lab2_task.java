import java.util.*;
import java.awt.*;
public class Lab2 {
   public static void main(String[] args) {
    
    int n;
    System.out.println("enter the size of the array");
    Scanner sc=new Scanner(System.in);
n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter the values of the arry");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
int count=0;
System.out.println("enter the number you need to find the frequency");
int x;
x=sc.nextInt();
for(int i=0;i<n;i++){
    if(arr[i]==x)
    count++;
}
System.out.println("the frequency of the number "+count);
   } 
}
