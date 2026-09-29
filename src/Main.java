import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("LG InstaView Door-in-Door", "12.04.2025", "LG Electronics", "South Korea", 6999, true);
        productsArray[1] = new Product("Samsung Bespoke Family Hub", "18.02.2025", "Samsung Corp.", "South Korea", 8499, true);
        productsArray[2] = new Product("Bosch Series 6 NoFrost", "05.09.2025", "Robert Bosch GmbH", "Germany", 4599, true);
        productsArray[3] = new Product("Xiaomi Mijia Smart Refrigerator 430L", "14.11.2025", "Xiaomi Corp.", "China", 2199, true);
        productsArray[4] = new Product("Haier 3D Series 7", "20.01.2026", "Haier Group", "China", 3899, false);
    }
}