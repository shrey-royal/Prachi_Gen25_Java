
class GrandParent {
    String name;
    int age;
}

class Parent extends GrandParent {
    float property;
}

class Child extends Parent {

    Child(String name, int age, float property) {
        this.name = name;
        this.age = age;
        this.property = property;
    }

    void print() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nProperty: " + property);
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Child c = new Child("Prachi", 15, 10000);

        c.print();
    }
}
