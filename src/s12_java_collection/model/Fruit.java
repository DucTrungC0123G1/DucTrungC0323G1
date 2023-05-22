package s12_java_collection.model;

import java.util.Objects;

public class Fruit {

        private String nameFruit;
        private String typeFruit;
        private String dateOfManu;
        private String expDate;
        private String origin;
        private String price;
        private String idFruit;

    public Fruit() {
    }

    public Fruit(String nameFruit, String typeFruit, String dateOfManu, String expDate, String origin, String price,
                 String idFruit) {
        this.nameFruit = nameFruit;
        this.typeFruit = typeFruit;
        this.dateOfManu = dateOfManu;
        this.expDate = expDate;
        this.origin = origin;
        this.price = price;
        this.idFruit = idFruit;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Fruit fruit = (Fruit) o;
//        return Objects.equals(idFruit, fruit.idFruit);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(idFruit);
//    }

    public String getIdFruit() {
        return idFruit;
    }

    public void setIdFruit(String idFruit) {
        this.idFruit = idFruit;
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
        return "Fruit{" +"Id Fruit"+ idFruit+'\''+
                "nameFruit='" + nameFruit + '\'' +
                ", typeFruit='" + typeFruit + '\'' +
                ", dateOfManu='" + dateOfManu + '\'' +
                ", expDate='" + expDate + '\'' +
                ", origin='" + origin + '\'' +
                ", price='" + price + '\'' +
                '}';
    }



}
