public class ShoeMain {
    public static void main(String[] args) {
        Shoe obj1 = new Shoe();
        obj1.state = "New";
        obj1.brand = "Nike";
        obj1.color = "Red";
        obj1.price = 2400;
        

        Shoe obj2 = new Shoe();
        obj2.state = "Old";
        obj2.brand = "Blue";
        obj2.color = "Adidas";
        obj2.price = 1200;

        obj1.printProperties();
        System.out.println();
        obj2.printProperties();

    }
}