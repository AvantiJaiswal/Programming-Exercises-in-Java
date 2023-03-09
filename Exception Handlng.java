import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sample {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
          int x = scan.nextInt();
          int y = scan.nextInt();
          int compute = x/y;
          System.out.println(compute);
        }
        catch(ArithmeticException e)
        {
          System.out.println(e);
        }catch(InputMismatchException e)
        { 
          System.out.println(e);
        }
    }
}
