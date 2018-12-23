package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.ptf.sandbox.Point;

public class PointTests {

@Test
  public void verifyDistanceEqual() {
    Point p1 = new Point(2,6);
    Point p2 = new Point(4, 8);
    Assert.assertTrue(p1.distance(p2)>0);

  }

  @Test
  public void verifyNumberCorrect() {

    Point p1 = new Point(2, 6);
    Point p2 = new Point(4, 8);
    Assert.assertEquals(p1.distance(p2), 2.8284271247461903);

  }
}
