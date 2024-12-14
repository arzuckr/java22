# Methods
###Components of a method
1.Access Modifiers
2.Return type
3.Method name
4.parameters

###
1.Access Modifiers
  *Define the visibility or scope of a method. Where you could access the method.
  *Access modifiers in java
     *'public' Accessible from anywhere in the program.
     *'private Accessible **only** within the same class
     *'protected' Accessible within the same package and subclasses.
     *'Default(no modifier) accessible within the same package only.

 *Example
'''java
public void display(){
System out println("This is a public method");
}
void calculate(){
  System out printLn("This method has a default access method")

}
private void print(){
System.out.printLn("This method is a private method")
}
protected void find(){
System.out.printLn("This method has protected access modifier")

}
***NOTE:Access modifier could also be used with "instance variables"
 2.Return Type
   * The return type specifies the type of value a method will return.(eg int,string,void)
   * Void means method does not return any value.
 ''java
public int add(int a ,int b ){
   * return a+b ;// this method is returned an integer value.
}
   * public void greet (){
   
     System.out.printLn("Hello");//We have printed ,but did not return any values.
   * 
     }

3.Method Names
  * Name the methods as you are naming a variable.
4.Parameters
  * Parameters allow yu to pass data into a method
  * Define within parentheses and specify the type of data method expects.
'''''java
  public void greet(String name){
 
    System.out.printLn("Hello" + name +"!");
    }
  * *Method Overloading 
  * Allows multiple methods in the same class same but different parameters.
  * for methods combinatiom of a method name and parameters are called method signature 
  ##java
      public class example{
  *   public void greet(string name){
     System.out.printLn("Hello" + name);

# CONSTRUCTORS
*Constructor is a special method in a class used to initialise objects.
*It has the same as the class and n return type
*Constructors are automatically called when an object is created.
*Every class is in java has a constructor .If constructor is not created explicitl.

***java
public class Cat{
  public Cat(){
///Constructor of the Cat class, and it will be called any time an object is created from the class

     System.out.printLn("Constructor is called");
}


       public static void  main (string[] args ){
          Cat cat=new cat
       /// Output of this code when I run
       ///Constructor is called.
 }  