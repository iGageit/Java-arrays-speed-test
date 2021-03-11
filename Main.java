
import java.util.ArrayList;
import java.util.Random;
public class Main{
   public static void main(String[] args)
   {      
       //set SIZE
       int SIZE=100000;
       //create a static array
       int[] nums=new int[SIZE];
      
       Random r=new Random();
       long start, stop=0;
       long elpasedTime=0;
       start = System.nanoTime();
       for (int i=0;i<SIZE;i++)
       {
           nums[i]=r.nextInt(10000);
       }
       stop = System.nanoTime();
       elpasedTime=stop-start;
       //calculate time in seconds for the println in for loop
       double printlntime=(double)elpasedTime / 1000000000.0;
          
       int capacity=100000;
       //create a dynamic array at run time
       ArrayList<Integer> arrList=new ArrayList<Integer>();
       start = System.nanoTime();
       for (int i=0;i<capacity;i++)
       {
           arrList.add(r.nextInt(10000));

       }
       stop = System.nanoTime();
       elpasedTime=stop-start;
       double printfTime=(double)elpasedTime / 1000000000.0;
       //calculate time in seconds for the printf in for loop
       System.out.println("It took "+printlntime+" seconds for static array ");
       System.out.println("It took "+printfTime+" seconds for dynamic arraylist");
   }
}