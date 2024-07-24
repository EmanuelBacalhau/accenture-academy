package activity8;

public class Circle {
  private double radius;
  private double area;
  private double perimeter;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void calculeArea() {
    this.area = Math.pow(this.radius, 2) * Math.PI;
  }

  public void calculePerimeter() {
    this.perimeter = 2 * Math.PI * this.radius;
  }

  public double getArea() {
    return area;
  }

  public double getPerimeter() {
    return perimeter;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
