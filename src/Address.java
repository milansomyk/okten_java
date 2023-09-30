import lombok.Data;
@Data
public class Address {
    protected String street;
    protected String suite;
    protected String city;
    protected int zipcode;
    protected Geo geo;

}
