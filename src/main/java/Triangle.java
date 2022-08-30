import java.lang.Math;


public class Triangle {
    public static void main(String[] args) {

    //    System.out.println(triangleArea(3, 4, 5));
    }

    public static double triangleArea(int a, int b, int c) throws MyException {
        if(a<=0 || b<=0 || c<=0) throw new MyException("Error text");
        double x = (a + b + c) / 2.0;
        return Math.sqrt(x * (x - a) * (x - b) * (x - c));

    }

}