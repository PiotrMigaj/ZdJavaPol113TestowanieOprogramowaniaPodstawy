package pl.sdacademy.unit.test.basic.exercises.task5;

import java.util.Objects;

public class Book {

    private final String title;
    private final Author author;
    private final float price;

    public Book(String title, Author author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }
}
