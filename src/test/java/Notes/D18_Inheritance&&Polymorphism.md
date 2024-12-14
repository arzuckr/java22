## Method Overriding
* Method overriding occurs when a **child /sub** class provide its own specific
implementation  for a method that is already defined in itd **parent/super class
* The method in the child /sub class must have the same  name,same parameters , and same return type 
* as the method in the parent/ super class .
* This access modifier should be more lenient or same in the child/sub class.
* To make overriding easy use @Override annotation . when @Override annotation used it will
* complain if we are not properly overriding, However without using this annotation there is no specific way to now.
*@Override annotation is not required d to override methods.


##Rules of Overriding
1. **Access Modifiers**
  * Overriding method can;t have more restrictive access modifiers than the method in parent class.
2. **Return Type**
3. **Annotation**
   * It is best practice to use @Override annotation.This ensure the method is properly overriding a parebt method.
4. **Exceptions**
   * The overriding method can't throw mre checked exceptions than the parent method.
   * We will cover exception  later

## What Can't Be Overridden?
1. Static Methods
2. Final Methods
3. Private Methods
4. Constructors


## access modifier from restricted to least restricted (least accessible to most accessible)
* private -> default -> protected -> public



# Polymorphism 
* 1 of the 4 concept of OOP
* Polymorphism means many (poly) forms (morphism)
* In java polymorphism allows a single method name to behave differently based on the object it is called upon.
*  ** There are 2 types of Polymorphism in Java**
    1. * Compile Time Polymorphism (Method Overloading)
    * Happens when methods with same exist in same class but have different set of parameters.
    * The method  execute is decided at compile time.
2. **Runtime Polymorphism(Method Overriding)**
   * Happens when a child class overrides a method of its parent class.
   * The method to execute is decided at runtime based on the actual type of object.


