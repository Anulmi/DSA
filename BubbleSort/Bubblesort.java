import java.util.Arrays;

public class Bubblesort{

  public static void main(String[]args){
  
  Integer a[]=new Integer[]{9,7,11,8,1};
   int temp;
   int i=a[3];
   int j=a[4];
   
   System.out.println("Before swapping");
   System.out.println(Arrays.deepToString(a));
   
   //Swapping values 4th and 5th
   temp=j;
   j=i;
   i=temp;
   
   System.out.println("After swapping");
   System.out.println(Arrays.deepToString(a));
  }
 } 