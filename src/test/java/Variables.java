public class Variables {
    public static void main(String[] args) {

        String str = "hello arzu";
        byte b=127;
        short s=269;
        int h = 75;
        double d= 75;
        float l=75f;
        double k=2.5;
        char key='H';
        System.out.println(str);
        System.out.println(b);
        System.out.println(s);
        System.out.println(h);
        System.out.println(d);
        System.out.println(l);
        System.out.println(k);
        System.out.println(key);
        //In a farm we have 20 cows,48 ducks,and 14 cats.
        //calculate the total number of legs in the farm and
        //display the result.
        //Don't only display the result, at least 6 different variables
        //created and result is calculated using variable names.

        int cows=20,ducks=48,cats=14;
        int cLegs=4,dLegs=2,caLegs=4;
        int totalCLegs=cows*cLegs;
        int totalDLegs=ducks*dLegs;
        int totalCaLegs=cats*caLegs;
        int totalLegsOfAnimals=totalCLegs+totalDLegs+totalCaLegs;
        System.out.println("Total Legs:"+ totalLegsOfAnimals);






    }
}
