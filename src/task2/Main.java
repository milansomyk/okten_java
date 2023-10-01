package task2;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook();
        ultrabook.setDisplaySize(13);
        ultrabook.setOnArm(true);
        ultrabook.setDisplaySensor(false);
        ultrabook.setWeight(1.2);
        ultrabook.setManufacturer("Samsung");
        ultrabook.setProcessor(Proccessor.AMD.toString());
        System.out.println(ultrabook);

        Workstation workstation = new Workstation();
        workstation.setDisplaySize(17);
        workstation.setIsUpgradeAble(true);
        workstation.setIsBatteryRemoves(false);
        workstation.setWeight(2.7);
        workstation.setManufacturer("Asus");
        workstation.setProcessor(Proccessor.INTEL.toString());
        System.out.println(workstation);

    }
}
