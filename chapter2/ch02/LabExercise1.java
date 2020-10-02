package ch02;
public class LabExercise1 {
    public static void main(String[] args) {
        System.out.println(sum(4));
        System.out.println(biPower(4));
        System.out.println(times(4));
    }

    public static int sum (int n){
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }

    public static int biPower (int n){
        if (n == 1)
            return 1;
        else
            return n + biPower(n - 1);
    }

    public static int times (int v){
        if (v == 1)
            return 1;
        else
            return v * times(v - 1);
    }
}