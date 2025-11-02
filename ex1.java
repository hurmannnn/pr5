public class ex1 {
    public static void main(String[] args) {
        final double a = 1.725;
        final double b = 19;
        final double c = -2.153;

        double x = Math.abs(Math.pow(a,b/a)-Math.cbrt(b-1));
        //у нас є модуль, тобто стале число, вирза (abs), а у степені a/b - корінь з трьох а під корененем b-1
        double y = ((b-a)*b-c/(b-Math.cos(a)))/(1+Math.pow(b-a,2));
        //ділення, (де у чисельнику) (b-a)b - (нова дія ділення) c/b-cos(a)/ (у знаменнику) 1+(b-a) дужки до квадрату - Math.pow
        //спочатку вирішується чисельник: (b-a)b далі де дізнатися c/b-cos(a), ці дві дії віднімаються
        //знаменник: 1+(b-a)^2 - дужки відкриваються формулою квадрат різниці і потім вже + 1; останнє це усе це поділити один на одногго

        System.out.printf("x = %.5f%n", x);
        System.out.printf("y = %.5f", y);
    }

}
