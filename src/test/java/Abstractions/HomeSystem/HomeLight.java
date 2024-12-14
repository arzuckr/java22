package Abstractions.HomeSystem;

public class HomeLight implements SmartHomeDevice{
    private boolean isOn;
    private String brightnessLevel;

    //Lets create a constructor that assign values for instance variables.


    public HomeLight(){
        this.isOn=false;
        this.brightnessLevel= "%50";

    }

    @Override
    public  void turnOn(){
        isOn =true;
        System.out.println("Light is now on. ");

    }
    @Override
    public void turnOff(){
        System.out.println("Light is off now ");
    }
     @Override
    public void deviceStatus(){
        if(isOn) {
        }else {
            System.out.println("The light is off");
        }
     }

}




