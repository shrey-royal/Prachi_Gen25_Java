import java.util.Scanner;

public class String1 {

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int start = 0;
        int end = input.length()-1;

        while(start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }
        return new String(charArray);
    }
    
    public static void main(String[] args) {
        // String str = "Prachi";  //Prachi

        // System.out.println(str.hashCode());
        // str = str.concat(" Patel");   //Prachi Patel
        // System.out.println(str);
        // System.out.println(str.hashCode());

        // String str1 = "Prachi";
        // System.out.println(str1.hashCode());

        String storedPassword = "321drowssaP";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new Password: ");
        String pass = sc.nextLine(); 
        sc.close();

        if(storedPassword.equals(reverseString(pass))) {
            System.out.println("Access Granted!");
        } else {
            System.out.println("Access Denied!");
        }
    }
}

/*
In Java, Strings are Immutable Objects (not changeable, unmodifiable)


> Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool.

*/