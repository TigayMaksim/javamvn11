package ru.netology.manager;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    // private ProductRepository repo = new ProductRepository();
    private ProductManager manager = new ProductManager();

    Book book1 = new Book(1, "name1", 150, "author1");
    Book book2 = new Book(2, "name2", 100, "author2");
    Smartphone smartphone1 = new Smartphone(3, "name5", 1200, "manufacturer1");
    Smartphone smartphone2 = new Smartphone(4, "name6", 1750, "manufacturer2");

    @Test
    public void addAndFindAll() {
        manager.add(book1);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(book2);
        Product[] actual = manager.findAll();
        Product[] expected = {book1, smartphone1, smartphone2, book2};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemove() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.removeById(1);
        Product[] expected = {book2, smartphone1, smartphone2};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFind1() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        Product[] actual = manager.searchBy("nam");
        Product[] expected = {book1, book2, smartphone1};
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldFind2() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);
        Product[] actual = manager.searchBy("sdkfhsd");
        Product[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }




}



