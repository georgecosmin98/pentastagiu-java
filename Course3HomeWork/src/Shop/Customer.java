package Shop;

public class Customer {

    private int id;
    private String name;
    static membership membership;

    enum membership {
        Gold, Silver, Nomembership
    }

    public Customer(int id, String name, membership membershipUser) {
        this.id = id;
        this.name = name;
        this.membership = membershipUser;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembership(membership membership) {
        this.membership = membership;
    }

    public membership getMembership() {
        return membership;
    }
}
