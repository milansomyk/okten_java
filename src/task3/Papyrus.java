package task3;
import lombok.Data;
@Data
public class Papyrus {
    protected String size;
    protected int layers;

    public Papyrus(String size, int layers) {
        this.size = size;
        this.layers = layers;
    }
    public String toString(){
        return "Size: "+size+", layers: "+layers;
    }
}
