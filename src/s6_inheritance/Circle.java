package s6_inheritance;

public class Circle {


    private String color;
    private double radius;
    //được kế thừa

    public Circle() {
    }
    //constructor không được kế thừa

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    //constructor không được kế thừa
    //Overload

    public String getColor() {
        return color;
    }
    // được kế thừa

    public void setColor(String color) {
        this.color = color;
    }
    // được kế thừa

    public double getRadius() {
        return radius;
    }
    // được kế thừa

    public void setRadius(double radius) {
        this.radius = radius;
    }
    // được kế thừa
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    // được kế thừa

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }// được kế thừa
    //Override.
}
