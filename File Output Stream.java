import java.io.*;
class FileOutputStreamDemo {
public static void main(String args[]) throws IOException {
String source = "Your work is going to fill a large part of your life," + 
"and the only way to be truly satisfied is to do what you believe is great work." + 
" And the only way to do great work is to love what you do." + 
" If you haven't found it yet, keep looking. Don't settle. " + 
"As with all matters of the heart, you'll know when you find it. _Steve Jobs";
byte buf[] = source.getBytes();
OutputStream f1 = new FileOutputStream("file1.txt");
f1.write(buf);
f1.close();
}
}
