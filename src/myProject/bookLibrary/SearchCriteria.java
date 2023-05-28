package myProject.bookLibrary;
@FunctionalInterface
public interface SearchCriteria {
    boolean match(Book book);
}
