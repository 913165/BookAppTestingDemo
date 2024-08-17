package org.example.bookapptestingdemo.service;


import org.example.bookapptestingdemo.dao.BookDAO;
import org.example.bookapptestingdemo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

   @Autowired
   private BookDAO bookDAO;

    public List<Book> getAllBooks() {
         return bookDAO.getAllBooks();
    }

    public Book getBookById(Long id) {
         return bookDAO.getBookById(id);
    }

    public Book addBook(Book book) {
         return bookDAO.addBook(book);
    }

    public Book updateBook(Book book) {
         return bookDAO.updateBook(book);
    }

    public void deleteBook(Long id) {
         bookDAO.deleteBook(id);
    }

}
