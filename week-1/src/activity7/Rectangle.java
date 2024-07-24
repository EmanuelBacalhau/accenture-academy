package activity7;

public class Rectangle {
  private double base;
  private double height;
  private double area;
  private double perimeter;

  public Rectangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  public void calculeArea() {
    this.area = this.base * this.height;
  }

  public void calculePerimeter() {
    this.perimeter = 2 * (this.base + this.height);
  }

  public double getArea() {
    return area;
  }

  public double getPerimeter() {
    return perimeter;
  }

  public void setArea(double area) {
    this.area = area;
  }

  public void setPerimeter(double perimeter) {
    this.perimeter = perimeter;
  }

  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}
