
###Logical Operators







| Operator    | Symbol | Description                                                            |
|-------------|-------|------------------------------------------------------------------------|
| Logical AND | `&&`  | Returns `true` if **both** conditions are true                         |
| Logical OR  | `||   |`   | Returns `true` if **at least one** condition is true                                         |
| Logical NOT | `!`   | **Negates** the boolean value (inverts `true` to `false` and vice versa) 

    ## logical Nagation '!'
* the '!' operator negates or inverts the value of boolean.If the values is 'true'
*makes it 'false',and vice versa
''java

boolean isRaising = true
boolean canGoOutside= !isRaining;

System.out.printLn(canGoOutside);
//Output= false since isRaining variable is true.

##Logical And '&&'

* Such as to travel I need passport and visa
  Passport           Visa             Travel
    +                  -                false(no)
    -                  +                false(no)
    -                  -                 false(no)
    +                  +                 true(yes)
* Such as to travel I need passport, visa and money
  Passport           Visa       Money             Travel
    +                  +           -             false(no)    
    +                  -            +            false(no)
    -                   +           +            false(no)
    +                   +           +            true(yes)

- The '&&' operator evaluates to true only if *all* the conditions in the expressions are true
-If any one of the operand is false the result is false.
''java
//In order to enter the club ,the customer needs to be 21 and should have the tickets.
int age=22;
boolean hasTicket=true;
boolean canEnter=age>=21 && hasTicket;
 
System.out.printLn(canEnter);// Output true since conditions given were true.

''java
//In order to enter the club ,the customer needs to be 21 and should have the tickets and must have a partner

int age=22;
boolean hasTicket=true;
boolean hasPartner=false;
boolean canEnter=age>=21 && hasTicket&& hasPartner;

System.out.printLn(canEnter);// Output false->since one of theoperand is false all result will be false
 
##logical Or '//'
*The '//' operators evaluates to true if at least one is true

/I would like to buy a computer from the store.The store accepts cash or card.
     CC              Cash                CanIBuy
     +               -                    true
     -               +                    true
     +               +                    true
     -               -                    false

       CC              Cash      PayPall          CanIBuy
       +               -             -              true
       -               +            -               true
      +               +             +              true
       -               -             -               false
//I could get a rest if it is weekend or if it is  holiday or  if the kids at grandparents.
boolean isWeekend=true;
boolean isHoliday=true;
boolean kidsAtGrandP=false;
boolean canRelax=isWeekend||isHoliday||kidsAtGranP;
//the value of can relax is since one of three given condition was true which is holiday.

//I could get a rest if it is weekend or if it holiday or  if the kids at grandparents.
boolean isWeekend=false;
boolean isHoliday=false;
boolean kidsAtGrandP=false;
boolean canRelax=isWeekend||isHoliday||kidsAtGranP;
//the value of can relax is false since none of three given condition was true.


###Summary
* Logical and '&&'**: requires all conditions to be true.
* Logical or '||'**:requires at least one of the conditions are true
* Logical not '!'**: invert a boolean value.

##Note;
-If '&&' and '//' operator is used the same operation '&& " will be calculated before or'//'

  



