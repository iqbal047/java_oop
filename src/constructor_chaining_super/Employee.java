package constructor_chaining_super;

public class Employee extends Person{
    float salary;

    public Employee(int age, String name, String address, float salary){
        super(age,name,address);
        this.salary = salary;
    }
}
