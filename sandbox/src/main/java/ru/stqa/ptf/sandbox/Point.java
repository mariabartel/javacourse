package ru.stqa.ptf.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance(Point p2) {
    return Math.sqrt(squareX(p2.x, this.x) + squareX(p2.y, this.y));

  }

  public static double squareX(double x, double y) { //квадрат разницы двух чисел
    return (x * x) - 2 * x * y + (y * y);
  }
}
