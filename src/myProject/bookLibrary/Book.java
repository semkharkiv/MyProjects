package myProject.bookLibrary;

import java.util.Objects;

/**
 * При сохранении каждой книге даётся уникальный номер (id).
 * Id это целое число. Первая в базе книга получает значение id = 1,
 * вторая id = 2 и так далее (автоинкремент - для каждой следующей книги
 * значение id просто увеличивается на единицу). Id присваивается в момент
 * сохранения книги в базу данных и больше никогда не меняется.
 */
public class Book {
    private Long id;
    private String author;
    private String title;
    private int yearOfIssue;

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Book(String author, String title, int yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-15s %-40s %-8d", id, author, title, yearOfIssue);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

}
