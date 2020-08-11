import java.lang.String;
public class Student {
    private int idNumber;
    private String name;
    private double numberOfCredit;
    private double numberOfPoints;



    public Student(int id, String guy, double cred, double points) {
        idNumber = id;
        name = guy;
        numberOfCredit = cred;
        numberOfPoints = points;
    }

    public void displayFields(int id, String guy, double cred, double points) {
        System.out.println("The Student's id number is :" + id);
        System.out.println("The student's name is: " + guy);
        System.out.println("The Student earned " + cred + " credits.");
        System.out.println("The student earned " + points + " points.");
    }

    public double getGPA(){
        return (numberOfPoints / numberOfCredit);}
}
