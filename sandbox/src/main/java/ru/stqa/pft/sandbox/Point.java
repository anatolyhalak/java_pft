package ru.stqa.pft.sandbox;

public class Point {

  public static void main(String[] agrs) {
    Point p1 = new Point(5, 5);
    Point p2 = new Point(3, 3);

    System.out.println("Расстояние мужду точками p1 и p2 = " + p1.distance(p2));
  }
  public double x;
  public double y;
  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p1) {
    return Math.sqrt((this.x - p1.x) * (this.x - p1.x) + (this.y - p1.y) * (this.y - p1.y));
  }

}
