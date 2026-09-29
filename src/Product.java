public class Product {
    private String productName;
    private String productDate;
    private String manufacturer;
    private String countryOfOrigin;
    private int price;
    private boolean reservStatus;

    public Product(String productName, String productDate, String manufacturer, String countryOfOrigin, int price, boolean reserveStatus) {
        this.productName = productName;
        this.productDate = productDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.reservStatus = reserveStatus;
    }

    public void info() {
        System.out.println("productName: " + productName + "; productDate: " + productDate + ", manufacturer: " + manufacturer +
                ", countryOfOrigin: " + countryOfOrigin + ", price: " + price + ", reservStatus: " + reservStatus);
    }
}
