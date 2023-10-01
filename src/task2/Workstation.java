package task2;
import lombok.Data;
@Data
public class Workstation extends Laptop {
    private Boolean isUpgradeAble;
    private Boolean isBatteryRemoves;

    public String toString(){
        return super.toString() + ", isUpgradeAble:" + isUpgradeAble + ", isBatteryRemoves:" + isBatteryRemoves;
    }
}
