class Worker {
    private String name;
    private int age;
    private int salary;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return this.salary;
    }
}

public class Encap {
    public static void main(String[] args) {
        Worker w = new Worker();
        w.setName("John");
        w.setAge(25);
        w.setSalary(25000);

        System.out.println("Name: " + w.getName());
        System.out.println("Age: " + w.getAge());
        System.out.println("Salary: " + w.getSalary());
    }
}

/*
> Getter and Setter methods are used to access the private attributes of a class.

Access Modifiers:
    1. public - accessible everywhere
    2. private - accessible only within the class
    3. protected - accessible within the package and outside the package but through inheritance only
    4. default - accessible only within the package

*/