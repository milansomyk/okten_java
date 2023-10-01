package task2;
import lombok.Data;
@Data
public class Laptop extends PC{
    protected int displaySize;
    protected double weight;
    public String toString(){
        return super.toString() + ", displaySize:" + displaySize + ", weight:" + weight;
    }
}
