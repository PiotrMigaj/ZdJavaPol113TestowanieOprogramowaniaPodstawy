package pl.sdacademy.unit.test.basic.exercises.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Basket {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book){
        if (book!=null){
            this.books.add(book);
        }
    }

    public void cleanBasket(){
        this.books.clear();
    }

    public float getTotalAmount(){
        AtomicReference<Float> sum = new AtomicReference<>((float) 0);
//        for (Book b:books) {
//            sum+=b.getPrice();
//        }
        this.books.stream().forEach(book -> sum.updateAndGet(v -> new Float((float) (v + book.getPrice()))));

        return sum.get();
    }

}
