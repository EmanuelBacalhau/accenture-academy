package activity7;

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 5);

    rectangle.calculeArea();
    System.out.println(rectangle.getArea());
    rectangle.calculePerimeter();
    System.out.println(rectangle.getPerimeter());

    rectangle.setHeight(7);

    rectangle.calculeArea();
    System.out.println(rectangle.getArea());
    rectangle.calculePerimeter();
    System.out.println(rectangle.getPerimeter());

    System.out.println("------------------------------");

    for (int i = 0; i < 5; i++) {
      Rectangle newRectangle = new Rectangle(10, 5);

      newRectangle.calculeArea();
      System.out.println(newRectangle.getArea());
      newRectangle.calculePerimeter();
      System.out.println(newRectangle.getPerimeter());

      newRectangle.setHeight(7);

      newRectangle.calculeArea();
      System.out.println(newRectangle.getArea());
      newRectangle.calculePerimeter();
      System.out.println(newRectangle.getHeight());

      System.out.println("------------------------------");
    }
  }
}
