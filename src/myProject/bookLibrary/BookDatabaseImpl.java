package myProject.bookLibrary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImpl implements BookDatabase {

    private List<Book> books; // Список для хранения книг

    @Override
    public String toString() {
        return "* " + books + " *" ;
    }

    public List<Book> getBooks() {
        return books;
    }

    private long nextId; // Следующий доступный id

    public BookDatabaseImpl() {
        this.books = new ArrayList<>();
        this.nextId = 1L; // Изначальное значение id
    }

    public String bookListContains(List<Book> books, String author, String title) {
        String result = "Нет";
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                result = "В нашем списке книг есть эта книга";
                System.out.println(result);
                return result;
            }
        }
        System.out.println(result);
        return result;
    }

    @Override
    public Long save(Book book) {
        // Присваиваем книге следующий доступный id и увеличиваем значение nextId
        book.setId(nextId++);
        books.add(book); // Добавляем книгу в список
        return book.getId(); // Возвращаем присвоенный id
    }


    @Override
    public boolean delete(Long bookId) {
        /** закомментированная часть кода равна строке перед return!!!*/
//        Iterator<Book> bookIterator = books.iterator();
//        while (bookIterator.hasNext()){
//            Book tempBook = bookIterator.next();
//            if (tempBook.getId().equals(bookId)){
//                bookIterator.remove();
//            }
//        }
        /***/
        books.removeIf(tempBook -> tempBook.getId().equals(bookId));
        return false;
    }

    @Override
    public boolean delete(Book book) {
        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()) {
            Book tempBook = bookIterator.next();
            if (tempBook.equals(book)) {
                bookIterator.remove();
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                System.out.println("Книга под данным id существует в нашем списке.");
                return Optional.of(book);
            }
        }
        System.out.println("Книга под данным id не существует в нашем списке.");
        return Optional.empty();

    }

    @Override
    public List<Book> findByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println("Книга с данным автором есть в нашем списке- Автор: " + book.getAuthor() + ", Название: " + book.getTitle());
            }
        }
        return new ArrayList<>();
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> foundBooksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                foundBooksByTitle.add(book);
                System.out.println("Книга с данным названием есть в нашем списке- Автор: " + book.getAuthor() + ", Название: " + book.getTitle());
            }
        }
        if (foundBooksByTitle.size() > 0) {
            return foundBooksByTitle;
        }
        System.out.println("Книги по названию- " + title + " не найдены");
        return new ArrayList<>();

    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()) {
            Book tempBook = bookIterator.next();
            if (tempBook.getAuthor().equals(author)) {
                bookIterator.remove();
            }
        }
        System.out.println("Книги с автором " + author + " удалены.");
    }

    @Override
    public void deleteByTitle(String title) {
        Iterator<Book> bookIterator = books.iterator();
        while (bookIterator.hasNext()) {
            Book tempBook = bookIterator.next();
            if (tempBook.getTitle().equals(title)) {
                bookIterator.remove();
            }
        }
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> resultBooks = new ArrayList<>();

        for (Book book : books) {
            if (searchCriteria.match(book)) {
                resultBooks.add(book);
            }
        }
        System.out.println(resultBooks);
        return resultBooks;
    }

    @Override
    public boolean contains(Book book) {
        for (Book myBook : books){
            if (books.contains(myBook)){
                return true;
            }
        }
        return false;
    }

    public void getAllBooksInf(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

