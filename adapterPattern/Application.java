package adapterPattern;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int laptopPlugCheck = 0;
        int refrigeratorPlugCheck = 0;
        int smartphoneChargerPlugCheck = 0;

        boolean loop = false;

        while (!loop) {
            System.out.println("\n\nElectronic Devices available to plug:");
            System.out.println("1 - Laptop");
            System.out.println("2 - Refrigerator");
            System.out.println("3 - Smartphone Charger");
            System.out.println("4 - Exit");

            System.out.print("\nSelect device to plug in: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    if (laptopPlugCheck == 0) {
                        Laptop laptop = new Laptop();
                        PowerOutlet laptopPowerOutlet = new LaptopAdapter(laptop);
                        System.out.print("\n" + laptopPowerOutlet.plugIn());
                        laptopPlugCheck++;
                    } else {
                        System.out.println("\nLaptop is already charging. \nDo you wish to unplug it? (Y/N): ");
                        String unplugChoice = sc.nextLine();
                        if (unplugChoice.equalsIgnoreCase("Y") || unplugChoice.equalsIgnoreCase("yes")) {
                            laptopPlugCheck = 0;
                            System.out.println("\nLaptop has been unplugged.");
                        }
                    }
                    break;
                case "2":
                    if (refrigeratorPlugCheck == 0) {
                        Refrigerator refrigerator = new Refrigerator();
                        PowerOutlet refrigeratorPowerOutlet = new RefrigeratorAdapter(refrigerator);
                        System.out.print("\n" + refrigeratorPowerOutlet.plugIn());
                        refrigeratorPlugCheck++;
                    } else {
                        System.out.println("\nRefrigerator is already plugged in. \nDo you wish to unplug it? (Y/N): ");
                        String unplugChoice = sc.nextLine();
                        if (unplugChoice.equalsIgnoreCase("Y") || unplugChoice.equalsIgnoreCase("yes")) {
                            refrigeratorPlugCheck = 0;
                            System.out.println("\nRefrigerator has been unplugged.");
                        }
                    }
                    break;
                case "3":
                    if (smartphoneChargerPlugCheck == 0) {
                        SmartphoneCharger smartphoneCharger = new SmartphoneCharger();
                        PowerOutlet smartphoneChargerPowerOutlet = new SmartphoneChargerAdapter(smartphoneCharger);
                        System.out.print("\n" + smartphoneChargerPowerOutlet.plugIn());
                        smartphoneChargerPlugCheck++;
                    } else {
                        System.out.println("Smartphone Charger is already plugged in. \nDo you wish to unplug it? (Y/N): ");
                        String unplugChoice = sc.nextLine();
                        if (unplugChoice.equalsIgnoreCase("Y") || unplugChoice.equalsIgnoreCase("yes")) {
                            smartphoneChargerPlugCheck = 0;
                            System.out.println("\nSmartphone Charger has been unplugged.");
                        }
                    }
                    break;
                case "4":
                    loop = true;
                    System.out.println("\nProgram Closed, coded by Angelo Gerard T. Mallari");
                    break;
                default:
                    System.out.println("\nInvalid Choice, please select a valid option");
            }
        }
    }
}
