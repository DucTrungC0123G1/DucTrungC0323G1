package s6_inheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(String color, double radius, double height) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return  super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder with height is"
                + this.height
                +", which í a subclass of"
                + super.toString();
    }
}
//Phương thức getArea(); được lớp Cylinder kế thừa từ Class Circle.
//Constructor class Circle không được kế thừa từ lớp Cylinder.
//Overload xảy ra tại khởi tạo constructor.
//Override xảy ra tại toString();.
