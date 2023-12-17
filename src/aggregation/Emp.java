package aggregation;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Gazipur", "Dhaka", "Bangladesh");
        Address address2 = new Address("Cox's Bazar", "CTG", "Bangladesh");

        Emp e1 = new Emp(101, "Mahadi", address1);
        Emp e2 = new Emp(102, "Alamin", address2);

        e1.display();

        System.out.println();

        e2.display();
    }

}
