// Here, T is a type parameter that will be replaced by a real type when an object of type Gen is created.
class Gen<T> {
T ob; // declare an object of type T
// Pass the constructor a reference to an object of type T.
Gen(T o) {
ob = o;
}
// Return ob.
T getob() {
return ob;
}
// Show type of T.
void showType() {
System.out.println("Type of T is " +
ob.getClass().getName());
}
}
// Demonstrate the generic class.
class GenDemo {
public static void main(String args[]) {
// Create a Gen reference for Integers.
Gen<Integer> iOb;
// Create a Gen<Integer> object and assign its reference to iOb. 
iOb = new Gen<Integer>(88);
// Show the type of data used by iOb.
iOb.showType();
int v = iOb.getob();
System.out.println("value: " + v);
System.out.println();
// Create a Gen object for Strings.
Gen<String> strOb = new Gen<String>("Generics Test");
// Show the type of data used by strOb.
strOb.showType();
String str = strOb.getob();
System.out.println("value: " + str);
}
}
