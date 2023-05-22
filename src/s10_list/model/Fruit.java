package s10_list.model;

public class Fruit {
    private String nameFruit;
    private String typeFruit;
    private String dateOfManu;
    private String expDate;
    private String origin;
    private String price;

     public Fruit(String nameFruit, String typeFruit, String dateOfManu, String expDate, String origin, String price) {
        this.nameFruit = nameFruit;
        this.typeFruit = typeFruit;
        this.dateOfManu = dateOfManu;
        this.expDate = expDate;
        this.origin = origin;
        this.price = price;
    }

    public Fruit() {
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getTypeFruit() {
        return typeFruit;
    }

    public void setTypeFruit(String typeFruit) {
        this.typeFruit = typeFruit;
    }

    public String getDateOfManu() {
        return dateOfManu;
    }

    public void setDateOfManu(String dateOfManu) {
        this.dateOfManu = dateOfManu;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nameFruit='" + nameFruit + '\'' +
                ", typeFruit='" + typeFruit + '\'' +
                ", dateOfManu='" + dateOfManu + '\'' +
                ", expDate='" + expDate + '\'' +
                ", origin='" + origin + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getFileFruitToCsv() {
        return this.nameFruit + "," + this.typeFruit + "," + this.dateOfManu + "," + this.expDate + "," + this.origin +
                "," + this.price;
    }
}
