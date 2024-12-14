package Inharitance.Devices;

public class DeviceTest {
    public static void main(String[] args) {
        //Let's learn all about smart device

        SmartDevice.deviceInfo();

        SmartDevice genericDevice=new SmartDevice("GenericBrand",24);
        //what can I do with the generic device object?

        genericDevice.turnOn();
        genericDevice.turnOff();

        //Creating and instance of the WearableDevice

        WearableDevice fitnessBand=new WearableDevice("FitBand",10,"Silicone");

        fitnessBand.turnOn();// This turn on method is inherited from SmartDevice class
        fitnessBand.wear();//This is a special behavior  specific to WearableDevice objects.
        fitnessBand.turnOn();//This turn of method is inherited from SmartDevice class

        System.out.println();

        SmartWatch appleWatch=new SmartWatch("Apple",18,"Leather",true);

        appleWatch.turnOn();//This is inherited from  smartDevice
        appleWatch.turnOff();//This is inherited from  smartDevice
        appleWatch.wear();//This method is inherited from WearableDevice class
        appleWatch.heartRateCheck();//This method is specific to smartwatches.

        // Is-A relationship in Java
        // Is SmartWatch a SmartDevice? (Based on our implementation) // yes
        // Is SmartWatch a WearableDevice? (Based on our implementation) // yes
        // Is SmartDevice a WearableDevice? (Based on our implementation) // no

        // This relationship will help us understand polymorphism in java.
        // 3rd concept of OOP.



    }
}
