package Producto;

public class Smoothie {
    private String name;
    private String type;
    private String typeMilk;
    private String flavour;
    private String iceCream;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeMilk() {
        return typeMilk;
    }

    public void setTypeMilk(String typeMilk) {
        this.typeMilk = typeMilk;
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public String getIceCream() {
        return iceCream;
    }

    public void setIceCream(String iceCream) {
        this.iceCream = iceCream;
    }

    public void showInfo() {
        System.out.println("Smoothie Information:");
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Type of Milk: " + typeMilk);
        System.out.println("Flavour: " + flavour);
        System.out.println("Ice Cream: " + iceCream);
        System.out.println("--------------------------");   
    }
}
