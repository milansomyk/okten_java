package task1;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Leane Bragham");
        user.setUsername("Bret");
        user.setEmail("email@gmail.com");
        user.setPhone("21231231231231231");
        user.setWebsite("dodo.org");

        Address address = new Address();
        address.setStreet("street");
        address.setSuite("suite");
        address.setCity("City");
        address.setZipcode(81652);

        Geo geo = new Geo();
        geo.setLat(123);
        geo.setLng(321);
        address.setGeo(geo);

        Company company = new Company();
        company.setName("Roman");
        company.setCatchPhrase("Lol lol lol");
        company.setBs("Bs bs bsbsbs");

        user.setAddress(address);
        user.setCompany(company);
        System.out.println(user);
    }
}