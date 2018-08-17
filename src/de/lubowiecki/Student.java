package de.lubowiecki;

/**
 *
 * @author T.Lubowiecki
 */
public abstract class Student {
    
    private String firstName;
    private String lastName;
    private Date birthDate;

    public Student() {
    }
    
    public abstract String getIrgendwas();
    
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
