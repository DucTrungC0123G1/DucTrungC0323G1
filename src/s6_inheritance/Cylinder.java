package s6_inheritance;

public class Cylinder extends Circle{
    private double height;
    // được kế thừa

    public Cylinder() {
    }
    // không được kế thừa

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }
    //không được kế thừa
    //Overload

    public double getHeight() {
        return height;
    }
    // được kế thừa

    public void setHeight(double height) {
        this.height = height;
    }
    // được kế thừa
    public double getVolume(){
        return  super.getArea()*this.height;
    }
    // được kế thừa

    @Override
    public String toString() {
        return "A Cylinder with height is"
                + this.height
                +", which is a subclass of"
                + super.toString();
    }
    // được kế thừa
    //Override
}
//Phương thức getArea(); được lớp Cylinder kế thừa từ Class Circle.
//Constructor class Circle không được kế thừa từ lớp Cylinder.
//Overload xảy ra tại khởi tạo constructor.
//Override xảy ra tại toString();.
