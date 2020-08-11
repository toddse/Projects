public class Circle {
    private double radius;
    private double diameter;

    public Circle(){
        radius = 1;
        computeDiameter();
    }

    public Circle(double d){
        radius = d;
        computeDiameter();
    }

    private void computeDiameter(){
        diameter = radius * 2;
    }

    public void setRadius(double d){
        radius = d;
        computeDiameter();
    }

    public double getDiameter(){
        return diameter;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }
}
