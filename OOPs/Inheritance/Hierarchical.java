
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

class KitKat extends Chocolate {
    KitKat(String name, float price) {
        this.name = name;
        this.price = price;
    }
}

class FiveStar extends Chocolate {
    FiveStar(String name, float price) {
        this.name = name;
        this.price = price;
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        DairyMilk d = new DairyMilk("Silk", 100);
        KitKat k = new KitKat("KitKat", 20);
        FiveStar f = new FiveStar("Five Stars", 5);

        d.giveChocolate();
        k.giveChocolate();
        f.giveChocolate();
    }
}
