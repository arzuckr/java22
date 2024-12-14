package StringObject;

import java.beans.JavaBean;
import java.sql.SQLOutput;

public class ExampleHome {
    public static void main(String[] args) {

        String str1 = "arzu cakir";
        String str2 = "yasin cakir";
        String str6 = "kerem";
        String str3 = str1.concat(str2).concat(str6);
        System.out.println(str3);

        String str4 = "Java";
        int str5 = str4.length();
        System.out.println(str5);

        System.out.println(str4.charAt(2));

        int str7 = str1.indexOf("c");
        System.out.println(str7);

        String str9 = "programming";
        int str10 = str9.indexOf("i");
        System.out.println(str10);

       String str11= str9.toUpperCase();

        System.out.println(str9.toUpperCase());
        System.out.println(str11.toLowerCase());

        String drink="teA";
        System.out.println(drink.toLowerCase());
        String drinkL=drink.toLowerCase();
        System.out.println(drinkL);
        System.out.println(drink);
        System.out.println(drink.toUpperCase());

       boolean isTrue= str9.startsWith("pa");
        System.out.println(isTrue);

        boolean isFalse=str9.endsWith("k");
        System.out.println(isFalse);

        boolean isContain=str9.contains("z");
        System.out.println(isContain);

        String str15=str3.substring(5);
        System.out.println(str15);
        String str16=str3.substring(2,5);
        System.out.println(str16);


        String str17=str3.replace("arzu","ihsan");
        System.out.println(str17);
         String str18=str3.replace('z','s');
        System.out.println(str18);
    }
}