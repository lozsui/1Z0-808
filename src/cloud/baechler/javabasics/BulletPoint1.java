package cloud.baechler.javabasics;

/*
 * Topic: Define the scope of variables
 * 
 * Source:
 * 
 * Java How To Program, Late Objects, 11th Edition by
 * Paul J. Deitel, Harvey M. Deitel
 * 
 * */

public class BulletPoint1 {
	
	/*
	 * The basic scope rules are as follows:

    1. The scope of a parameter declaration is the body of the method in which the declaration appears.
    2. The scope of a local-variable declaration is from the point at which the declaration appears to
       the end of that block. A block in Java is a group of one or more statements enclosed in braces.
    3. The scope of a local-variable declaration in a for statement’s header is the body of the for
       statement and the other expressions in the header.
    4. A method or field’s scope is the entire body of the class.
    
	 * */
	
    // field that is accessible to all methods of this class
    private static int x = 1;                               

    // method main creates and initializes local variable x
    // and calls methods useLocalVariable and useField
    public static void main(String[] args) {
       int x = 5; // method's local variable x shadows field x

       System.out.printf("local x in main is %d%n", x);

       useLocalVariable(); // useLocalVariable has local x
       useField(); // useField uses class Scope's field x
       useLocalVariable(); // useLocalVariable reinitializes local x
       useField(); // class Scope's field x retains its value

       System.out.printf("%nlocal x in main is %d%n", x);
    }

    // create and initialize local variable x during each call
    public static void useLocalVariable() {
       int x = 25; // initialized each time useLocalVariable is called

       System.out.printf(
          "%nlocal x on entering method useLocalVariable is %d%n", x);
       ++x; // modifies this method's local variable x
       System.out.printf(
          "local x before exiting method useLocalVariable is %d%n", x);
    }

    // modify class Scope's field x during each call
    public static void useField() {
       System.out.printf(
          "%nfield x on entering method useField is %d%n", x);
       x *= 10; // modifies class Scope's field x
       System.out.printf(
          "field x before exiting method useField is %d%n", x);
    }
}
