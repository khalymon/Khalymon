package module07;

public class User implements Comparable {
    private long id;
    private String firstName;
    private String lastName;
    private String city;
    private int balance;

    public User(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "\nUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (balance != user.balance) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (lastName != null ? !lastName.equals(user.lastName) : user.lastName != null) return false;
        return city != null ? city.equals(user.city) : user.city == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + balance;
        return result;
    }

    @Override
    public int compareTo(Object o) {
        User user = (User) o;
        if (this.equals(user)) {
            return 0;
        }
        if (this.id > user.id) {
            return 1;
        }
        if (this.id < user.id) {
            return -1;
        }
        if (this.firstName.compareTo(user.firstName) != 0) {
            return this.firstName.compareTo(user.firstName);
        }
        if (this.lastName.compareTo(user.lastName) != 0) {
            return this.lastName.compareTo(user.lastName);
        }
        if (this.city.compareTo(user.city) != 0) {
            return this.city.compareTo(user.city);
        }
        if (this.balance > user.balance) {
            return 1;
        }
        if (this.balance < user.balance) {
            return -1;
        }
        return 0;
    }

}
