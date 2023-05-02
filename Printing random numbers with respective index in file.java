import java.util.Dictionary;
import java.util.Random;
import java.util.Hashtable;
import java.io.*;
class RandomNumber{
    public static void main(String args[])throws IOException{
        Random ran = new Random();
        int length = 100000;                                                  //printing 1 lakh random numbers
        Dictionary<Integer, Integer> dict = new Hashtable<Integer, Integer>();
        
        int maxRange = 500000;
        for(int i=0;i<length;i++){
            dict.put(i, ran.nextInt(maxRange)); 
        }
        FileWriter writer = new FileWriter("Desktop/data.txt");
        for (int i=0; i<length; i++) {
                writer.write(i + " " + dict.get(i) + " ");
            }
            writer.close();  
    }
}
 
