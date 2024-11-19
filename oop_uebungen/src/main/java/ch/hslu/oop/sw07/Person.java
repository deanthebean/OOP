package ch.hslu.oop.sw07;

public class Person {
    private final long id;
    private String lastname;
    private String firstname;

    public Person(final long id, final String lastname, final String firstname) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public long getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "Person: [id=" + id + ", lastname=" + lastname + ", firstname=" + firstname + "]";
    }

    @Override
    public final boolean equals(final Object person) {
        if (this == person) {
            return true;
        } else if (!(person instanceof Person)) {
            return false;
        } else if (this.firstname.equals(((Person)person).getFirstname()) && this.lastname.equals(((Person)person).getLastname()) && this.id == ((Person)person).getId()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final int hashCode() {
        return (int)(id + hashString(this.firstname) + hashString(this.lastname));
    }

    private int hashString(String string) {
        int hash = 13;
        for (int i = 0; i < string.length(); i++) {
            hash = hash * 31 + string.charAt(i);
        }
        return hash;
    }
}
