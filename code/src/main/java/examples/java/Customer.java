package examples.java;

import java.util.Arrays;

public class Customer {
    private final int id;
    private final String creditCardNumber;

    public Customer(int id, String creditCardNumber) {
        this.id = id;
        this.creditCardNumber = creditCardNumber;
    }

    public int getId() {
        return id;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    private Object identity() {
        return Arrays.asList(id, creditCardNumber);
    }

    @Override
    public boolean equals(Object o) {
        return o == this || (
                o != null && o.getClass() == getClass() &&
                        identity().equals(((Customer) o).identity())
        );
    }

    @Override
    public int hashCode() {
        return identity().hashCode();
    }

    @Override
    public String toString() {
        return "Customer(" + id + "," + creditCardNumber + ")";
    }

    public static Customer apply(int id, String creditCardNumber) {
        return new Customer(id, creditCardNumber);
    }
}
