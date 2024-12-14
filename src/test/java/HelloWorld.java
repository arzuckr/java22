public class HelloWorld {

    public static void main (String [] args ) {
   // The line below is our first print statement
        System.out.println("Hello World!");
        System.out.println(2);
        System.out.println("2");
        System.out.println("hello world +");


  //  In Java "2" is not same as 2. "2" is considered as a text(string),and
  //2 is considered  as a number numerical data type(integer).

  //Java is a case -sensitive language so System and system doesn't mean
  //the same thing.
  //Adding two Texts to each other (concatenation)

        System.out.println("Java" + "Programming");
        System.out.println("Java"+" "+"Programming");
        // Combine text and numbers in arithmetic operation

        System.out.println("We are batch "+ 22);
        // we are batch 22
        System.out.println(5+4);
        //9
        System.out.println("5"+"4");
        //54
        System.out.println("the result is" +5 + 3);
        //the result is53

        System.out.println(5+3+"would be the result of 5+3");
        //8would be the result of 5+3
        System.out.println("the result is "+ "5+3");
        System.out.println(5+3+2+"arzu");
        //10arzu
        System.out.println("arzu"+5+3+2);
        //arzu532
        System.out.println((5+3+2)+"arzu");
//10arzu
        System.out.println("arzu "+(5+3+2));
        //arzu 10



    }
}
