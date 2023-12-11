public class StringBuff {
    public static void main(String[] args) {
        StringBuffer strBuff = new StringBuffer();
        strBuff.append("dfg");
        System.out.println(strBuff.capacity());
        // System.out.println("new string buffer object".length());
        strBuff.append("new string buffer object");
        System.out.println(strBuff.capacity());
        strBuff.ensureCapacity(50);
        System.out.println(strBuff.capacity());

        // System.out.println("Current String Buffer capacity is " + strBuff.capacity());
    }
}

/*
String Buffer Class: 

String class objects are immutable.
If we want to make mutable string objects than we will use string buffer class.
> StringBuffer class is thread-safe i.e. multiple threads can't access it simultaneously. So it is safe and will result in an order.

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