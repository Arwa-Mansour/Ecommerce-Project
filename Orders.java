/**
 * Created by pc on 3/21/2021.
 */
public class Orders {

    private String id;
    private User customer ;
    private String date ;


    public Orders(String id, User customer, String date) {
        this.id = id;
        this.customer = customer;
        this.date = date;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public void print ()
    {
        String s = "id : '" + id + '\n' +
                "customer : " + customer +
                "date : " + date +
                '\n';
        System.out.println(s);
    }

}
