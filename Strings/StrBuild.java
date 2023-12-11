public class StrBuild {
    public static void main(String[] args) {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("dfg");
        System.out.println(strBuild.capacity());
        // System.out.println("new string builder object".length());
        strBuild.append("new string builder object");
        System.out.println(strBuild.capacity());
        strBuild.ensureCapacity(50);
        System.out.println(strBuild.capacity());

        // System.out.println("Current String Builder capacity is " + strBuild.capacity());
    }
}

/*
String Builder Class: 

String class objects are immutable.
If we want to make mutable string objects than we will use string builder class.
> StringBuilder class is not thread-safe i.e. multiple threads can access it simultaneously.

methods:

append(): it adds a new string at the end of the old string //str1.append(str2)
insert
replace
delete
capacity(): it returns the current capacity newcapacity: (old*2)+2 (default is 16)
ensureCapacity(min capacity): is used to ensure the capacity at least equal to the given minimum.
charAt
length
substring


*/