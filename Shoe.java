public class Shoe {
    String brand;
    String color;
    String state;
    int price;

    void printProperties() {
        System.out.printf("%s %s %s | %d php", state, brand, color, price);
    }
}