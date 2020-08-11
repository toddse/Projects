public class CircleDemo {
    public static void main(String[] args) {
        Circle Ball1 = new Circle();

        Circle Ball2 = new Circle(1000.50);

        Circle Ball3 = new Circle();

        Ball1.setRadius(1.5);

        System.out.println("The area of the first object is " + Ball1.getArea());
        System.out.println("The diameter of the first object is " + Ball1.getDiameter());

        System.out.println("The area of the second object is " + Ball2.getArea());
        System.out.println("The diameter of the second object is " + Ball2.getDiameter());

        System.out.println("The area of the third object is " + Ball3.getArea());
        System.out.println("The diameter of the third object is " + Ball3.getDiameter());
    }
}
