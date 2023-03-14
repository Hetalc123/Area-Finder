public class AreaFinder {
    static double a=5.0;
    static double b=5.0;
    static double c=9.0;
    static double h=10;
    public static void main(String[] args){
       AreaOfCircle();
       AreaOfSquare();
       AreaOfTriangle();
    }
    static void AreaOfCircle(){
        double PI= 3.14;
       double answer=PI*a*a;
       System.out.println(answer);
    }
    static void AreaOfSquare(){
        double answer=a*b;
        System.out.println(answer);
    }
    static void AreaOfTriangle(){
        double answer=(a*h)/2;
        System.out.println(answer);
    }
}
