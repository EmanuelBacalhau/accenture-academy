package activity8;

public class Main {
  public static void main(String[] args) {
    Circle rectangle = new Circle(10);

    rectangle.calculeArea();
    rectangle.calculePerimeter();

    System.out.println(rectangle.getPerimeter());

    rectangle.setRadius(4);

    rectangle.calculeArea();
    rectangle.calculePerimeter();

    System.out.println(rectangle.getPerimeter());

    System.out.println("------------------------------");

    for (int i = 0; i < 5; i++) {
      Circle newRectangle = new Circle(10);

      newRectangle.calculeArea();
      newRectangle.calculePerimeter();

      System.out.println(newRectangle.getPerimeter());

      newRectangle.setRadius(4);

      newRectangle.calculeArea();
      newRectangle.calculePerimeter();

      System.out.println(newRectangle.getPerimeter());

      System.out.println("------------------------------");
    }
  }
}
