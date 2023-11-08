
class Chocolate {
    String name;
    float price;

    void giveChocolate() {
        System.out.println("Here's your " + name + " chocolate.You have to pay " + price + " rupees.");
    }
}

class DairyMilk extends Chocolate {
    DairyMilk(String name, float price) {
        this.name = name;
        this.price = price;
    }
}

public class Single {
    public static void main(String[] args) {
        DairyMilk d[] = new DairyMilk[5];

        d[0] = new DairyMilk("Silk", 100);
        d[1] = new DairyMilk("Fruits and Nuts", 150);
        d[2] = new DairyMilk("Bubbly", 150);
        d[3] = new DairyMilk("Hazzelnut", 200);
        d[4] = new DairyMilk("Roast Almond", 160);

        for (int i = 0; i < 5; i++) {
            d[i].giveChocolate();
        }
    }
}
