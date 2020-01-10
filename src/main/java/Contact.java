public class Contact {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(){};

    public Contact(String first, String last, String number){
        this.firstName = first;
        this.lastName = last;
        this.phoneNumber = number;
    }

    public Contact(long id, String first, String last, String number){
        this.id = id;
        this.firstName = first;
        this.lastName = last;
        this.phoneNumber = number;
    }


    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
