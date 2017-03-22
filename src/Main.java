public class Main {

    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(rand(-10,10), rand(-10,10), rand(-10,10), rand(-10,10), rand(-10,10), rand(-10,10));
        System.out.println("A(" + triangle1.getX1() + ";" + triangle1.getY1() + ")");
        System.out.println("B(" + triangle1.getX2() + ";" + triangle1.getY2() + ")");
        System.out.println("C(" + triangle1.getX3() + ";" + triangle1.getY3() + ")");
        System.out.println("Площадь треугольника ABC равна " + triangle1.getArea());
        System.out.println("Периметр треугольника ABC равен " + triangle1.getPerimeter());
        Circle circle1 = new Circle(rand(-5, 5), rand(-5, -5), rand(1, 5));
        System.out.println("Центр окружности O(" + circle1.getoX() + ";" + circle1.getoY() + ")");
        System.out.println("Радиус окружности r = " + circle1.getR());
        System.out.println("Длина окружности круга равна " + circle1.getPerimeter());
        System.out.println("Площадь круга равна " + circle1.getArea());
    }

    static public int rand(int rFrom, int rTo) {
        return rFrom + (int)(Math.random() * ((rTo - rFrom) + 1));
    }
}
