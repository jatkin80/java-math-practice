public class MathApp {
  static int job1Salary = 85000;
  static int job2Salary = 72000;
  static int carPrice = 50000;
  static int truckPrice = 80000;
  static double circleRadius = 7.25f;
  static double num1 = 5.0;
  static double point1 = 5;
  static double point2 = 10;
  static double point3 = 85;
  static double point4 = 50;
  static double num2 = -3.8;
  static double rand = Math.random();

  public static void main(String[] args) {
    System.out.println(salary());
    System.out.println(newCar());
    System.out.println(circleArea());
    System.out.println(squareRoot());
    System.out.println(distance());
    System.out.println(positiveValue());
    System.out.println(rand);
  }

  static int salary() {
    return Math.max(job1Salary, job2Salary);
  }

  static int newCar() {
    return Math.min(carPrice, truckPrice);
  }

  static double circleArea() {
    return Math.PI * circleRadius * circleRadius;
  }

  static double squareRoot() {
    return Math.sqrt(num1);
  }

  static double distance() {
    return Math.hypot(point2 - point1, point4 - point3);
  }

  static double positiveValue() {
    return Math.abs(num2);
  }
}
