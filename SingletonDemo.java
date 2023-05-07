public final class Singleton {
    private static Singleton single_instance = null;
    public String s;
    //Create a private constructor of the class to restrict object creation outside of the class.
    private Singleton(){                               
        s = "string part of singleton class."; 
    }
    //Create a public static method that allows us to create and access the object we created.
    public static synchronized Singleton getInstance(){
        if(single_instance == null){
            single_instance = new Singleton();
        }
        return single_instance;
    }
}
public class SingletonDemo {
    public static void main(String args[]){
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        System.out.println("Hashcode of x is: "+x.hashCode());
        System.out.println("Hashcode of y is: "+y.hashCode());

        if(x==y){
            System.out.println("Two objects point to the same memory location on the heap. ");
        }else{
            System.out.println("Two objects does not point to the same memory location on the heap. ");
        }
    }
}
