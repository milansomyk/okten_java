package task1;

import lombok.Data;
@Data
public class User {
    protected int id;
    protected String name;
    protected String username;
    protected String email;
    protected Address address;
    protected String phone;
    protected String website;
    protected Company company;
}