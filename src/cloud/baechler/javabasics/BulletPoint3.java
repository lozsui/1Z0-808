package cloud.baechler.javabasics;

/*
 * - Create executable Java applications with a main method
 * - run a Java program from the command line;
 * - produce console output
 * 
 * */

public class BulletPoint3 {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	/*
	 * $ pwd
	 * /home/shb/temp
	 * $ cat BulletPoint3.java
	 * 
	 * package cloud.baechler.javabasics;
	 * public class BulletPoint3 {
	 * public static void main(String[] args) {
	 * 		System.out.println("Hello World");
	 * }}
	 * 
	 * $ javac BulletPoint3.java
	 * 
	 * # must correspond to package cloud.baechler.javabasics
	 * $ mkdir -p classes/cloud/baechler/javabasics
	 * 
	 * $ mv BulletPoint3.class classes/cloud/baechler/javabasics/
	 * 
	 * $ rm BulletPoint3*
	 * $ tree
	 * .
	 * └── classes
	 *     └── cloud
	 *         └── baechler
	 *             └── javabasics
	 *                 └── BulletPoint3.class
	 * 
	 * 4 directories, 1 file
	 * 
	 * $ pwd
	 * /home/shb/temp
	 * 
	 * $ java -classpath classes cloud.baechler.javabasics.BulletPoint3
	 * Hello World
	 * 
	 * As jar...
	 * 
	 * */
}
