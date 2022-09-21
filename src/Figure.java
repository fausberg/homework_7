public class Figure implements Krug, Prymougolnik, Treugolnik{

    public void SK(double a) {
        a = Math.PI*Math.sqrt(a);
        System.out.println("Площадь круга: "+ a);
    }


    public double PK(double a) {
        a = Math.PI*a;
        System.out.println("Периметр кргуа: "+ a);
        return a ;
    }


    public void SP(double a, double b) {
        double S = a*b;
        System.out.println("Площадь прямоугольника: "+S);
    }


    public double  PP(double a, double b) {
        double P = 2*a+2*b;
        System.out.println("Периметр прямоугольника: " + P);
        return P;
    }


    public void ST(double h, double a) {
        double S = 1/2*h*a;
        System.out.println("Площадь треугольника: "+ S);
    }


    public double PT(double a, double b, double c) {
        double P = a+b+c;
        System.out.println("Периметр треугольника: "+P);
        return P;
    }


}
