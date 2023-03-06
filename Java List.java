import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ArrayList<Integer> L = new ArrayList<Integer>(N);
        for(int i=0;i<N;i++)
        {
          int num = scan.nextInt();
          L.add(num); 
        }
        int Q = scan.nextInt();
        for(int i=0;i<Q;i++)
        {
          scan.nextLine();
          String type = scan.nextLine();
          if(type.equals("Insert"))
          {
            int x = scan.nextInt();
            int y = scan.nextInt();
            L.add(x,y);
          }else {
            int x = scan.nextInt();
            L.remove(x);
          }
        }
        String formattedString = L.toString()
         .replace(",","")
         .replace("[","")
         .replace("]","");
        System.out.println(formattedString);  
    }
}
