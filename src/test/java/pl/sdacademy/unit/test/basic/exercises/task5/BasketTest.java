package pl.sdacademy.unit.test.basic.exercises.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    private Basket basket;

    @BeforeEach
    void setUp(){
        this.basket = new Basket();
    }

    @Test
    void getAllBooks() {
        //given
        Book book1 = new Book("Harry Potter",new Author("Joanna","Rowling"),30);
        Book book2 = new Book("Harry Potter",new Author("Joanna","Rowling"),40);
        Book book3 = new Book("Harry Potter",new Author("Joanna","Rowling"),50);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        //then
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        assertThat(basket.getBooks()).isEqualTo(bookList);
    }

    @Test
    void shouldAddBookToBasketIfBookNotNull() {
        //given
        Book book = new Book("Harry Potter",new Author("Joanna","Rowling"),30);
        //then
        basket.addBook(book);
        //when
        assertThat(basket.getBooks()).hasSize(1);
        assertThat(basket.getBooks().get(0)).isEqualTo(book);
    }

    @Test
    void shouldBasketBeEmptyAfterClean(){
        //Given
        Book book1 = new Book("Harry Potter",new Author("Joanna","Rowling"),30);
        Book book2 = new Book("Harry Potter",new Author("Joanna","Rowling"),40);
        Book book3 = new Book("Harry Potter",new Author("Joanna","Rowling"),50);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        basket.cleanBasket();
        //then
        assertThat(basket.getBooks()).hasSize(0);
    }

    @Test
    void shouldReturnTotalAmount(){
        //Given
        Book book1 = new Book("Harry Potter",new Author("Joanna","Rowling"),30);
        Book book2 = new Book("Harry Potter",new Author("Joanna","Rowling"),40);
        Book book3 = new Book("Harry Potter",new Author("Joanna","Rowling"),50);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        //when
        float totalAmount = basket.getTotalAmount();
        //then
        assertThat(totalAmount).isEqualTo(30+40+50);
    }
}