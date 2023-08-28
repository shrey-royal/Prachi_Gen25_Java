class Prachi {
	public static void main(String[] prachi) {
		//main method
		System.out.println("Hello World!");
	}
}

class Simple {
	public static void main(String[] prachi) {
		//main method
		System.out.println("Hello World!");
	}
}


/*
public class First_Program {
	public static void main(String[] prachi) {
		//main method
		System.out.println("Hello World!");
	}
}
*/

/*
System.out.println - to print data in the system
ln in the println method is used to enter new line at the end after the data gets printed.

System.out.print() - prints the data
System.in - get data from the system

to compile the program: javac name_of_the_file.java
to run the program: java name_of_the_file

Q. What is Java? 
A. Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming langauge.


robust: java have stronger and abstracted memory management.
Garbage Collector - collects the unwanted data or code that is not being used by the program. (System.gc();)


platform: ANy hardware and software environment in which a program runs.



3 categories or levels:

high level - java, python, etc.
mid level - c/c++
low level - assembly level - fortran, pascal, etc. -> instruction sets


Program Internal: 

At compiler Time, the java file is compiled by the java compiler (it doesn't interact with the OS) and converts it into bytecode (.class).

(First_Program.java -> compiler -> First_Program.class)
(java source code   -> compiler -> 	bytecode)


Run time?

Class File -> Classloader -> Bytecode verifier -> Interpreter -> Runtime -> Hardware

Classloader: It is a subsystem of JVM that is used to load class files

Bytecode verifier: checks the code fragments for illegal code that can violate access rights to objects.

Interpreter: Read bytecode stream then executes the instructions.


JDK - JRE - JVM

JVM: java virtual machine

> it doesn't physically exist. JVM is an abstract machine.

> it is a specification that provides a runtime environment in which java bytecode can be executed.

> java is platform independent

tasks performed by JVM:

-> loads code
-> verifies code
-> executes code
-> provides runtime environment


JRE: java runtime environment

JRE consists of JVM and set of libraries(.jars) + some other files.

JDK: java development kit

JDK consists of JRE + Development tools (javac, java, etc.)

*/