package ru.stqa.ptf.sandbox;

public class PointProgram {

  public static void main (String[] args) {

    Point p1 = new Point(2.0, 6.0);
    Point p2 = new Point(4.0, 8.0);

    System.out.println("Расстояние между точкой p1 " + p1.x + ", " + p1.y + " и точкой p2 " + p2.x + ", " + p2.y  + " = " + distance(p1, p2));

    System.out.println("Расстояние между точкой p1 " + p1.x + ", " + p1.y + " и точкой p2 " + p2.x + ", " + p2.y  + " = " + p1.distance(p2));

  }

  public static double distance(Point p1, Point p2) { //функция - дистанция между двумя точками
    return Math.sqrt(square(p2.x, p1.x) + square(p2.y, p1.y));
  }

  public static double square(double x, double y) { //функция - квадрат разницы двух чисел
    return (x * x) - 2 * x * y + (y * y);

  }
}
