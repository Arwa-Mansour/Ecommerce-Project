/**
 * Created by pc on 4/13/2021.
 */
public class Suppliers {
    private String name;
    private String phone;
    private String location;

    public Suppliers(String name, String phone, String location) {
        this.name = name;
        this.phone = phone;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "name : " + name + '\n' +
                "phone : " + phone + '\n' +
                "location : " + location + '\n' ;
    }
}
