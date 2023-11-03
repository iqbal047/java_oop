package inheritingPrivateMember;

public class Teacher extends Person {
    //getName(), setName(), getAge(), setAge()

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }


    void displayInformation(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        System.out.println("\n\n");
    }
}
