package Primitives.Casting;

public class CastingArithmeticOperators {
    public static void main(String[] args) {

        // When two data different primitive type is used in
        //arithmetic operation ,result will automatically be promoted
        //to larger data type

       double var = 4+4.0;

        //what data type can i use
        //arithmetic operation above?
        // since java auto understand ever decimal number as
        //double,the result of the arithmetic operation will
        //be promoted to double data type.

        float f1=5;

       float var1= 6.7f;
       //f at the end value is a shortcut to casting double value to float


        float f2 = (float)6.7;

        double d=5;
        float f3 = (float)d;

        long l1=2;
        float result = f1+l1;

        // Byte,short,char will always be promoted to
        //int data type when used in arithmetic operation.

        byte b=10;
        byte b1=11;

        int b2=b1-b;


        // byte result3 =b1-b;

        // will result in integer value.



        //


        System.out.println();

        double  g =10;
        int fr=8;
        int hj= (int) (fr-g);


        System.out.println(fr-g);

        System.out.println(hj);


        long kl=50;
        int nm=22;
        int kh= (int)( kl+nm);


        System.out.println(kh);




    }
}
