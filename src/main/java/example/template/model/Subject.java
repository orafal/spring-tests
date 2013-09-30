package example.template.model;

/**
 * Models a subject (signer) with properties as in Signicat's Document WSDL.
 */
public class Subject {
    private final String id;
    private final String nationalId;
    private final String firstName;
    private final String lastName;
    private final String mobile;
    private final String email;

    public Subject(String id, String nationalId, String firstName, String lastName, String mobile, String email) {
        this.id = id;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }
}
