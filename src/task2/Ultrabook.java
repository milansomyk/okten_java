package task2;
import lombok.Data;
@Data
public class Ultrabook extends Laptop{
    private boolean isDisplaySensor;
    private boolean isOnArm;
    public String toString(){
        return super.toString() + ", isDisplaySensor:" + isDisplaySensor + ", isOnArm:" + isOnArm;
    }
}
