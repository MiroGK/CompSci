package Sep10;

public class Phone {
    private String brand;
    private boolean isOn;
    private String color;
    private double batteryPercentage;
    private String currentApp;
    private boolean isFoldable;
    private double storageDataGB;
    private boolean factoryResetPressed;

    // set the variable
    // setter updates the variable to something new (sets it)
    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    // read the variable
    // getter READS back the value (gets it)
    public String getBrand() {
        return brand;
    }

    public Phone() {
        brand = "Generic";
        isOn = false; 
        color = "White";
        batteryPercentage = 100.0;
        currentApp = "Home Screen";
        isFoldable = false;
        factoryResetPressed = false;
        storageDataGB = 40.0;
    }

    public String announceFoldablePhone() {
        String phoneName = "";

        if (brand == "Apple") {
            System.out.println("Say hello to the iPhone Duo! Only $7999.");
            phoneName = "iPhone Duo";
        } else {
            phoneName = "Galaxy Fold 387";
            System.out.println("Say hello to the Galaxy Fold Only $200.");
        }

        return phoneName;
    }

    public void toggleOnOff(int type) {
        String offOrOn = "";

        if (type == 1) {
            offOrOn = "on"; 
            isOn = true;
        } else {
            offOrOn = "off";
            isOn = false;
        }

        System.out.println("The phone is now turned " + offOrOn);
    }

    public double chargeBattery() {
        double amountToCharge = 100 - batteryPercentage;
        batteryPercentage += amountToCharge;
        System.out.println("Your phone is now recharged to 100%!");
        return amountToCharge;
    }

    public double factoryReset() {
        factoryResetPressed = true;
        if (factoryResetPressed) {
            storageDataGB -= storageDataGB;
        }
        System.out.println("Your phone has been factory resetted. ALL data has been lost permanently. Sorry not sorry.");
        return storageDataGB;
    }
}


