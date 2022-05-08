package pl.sdacademy.unit.test.basic.exercises.task3;

import java.util.Objects;

public class Customer {

    private final String name;
    private final String lastName;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
