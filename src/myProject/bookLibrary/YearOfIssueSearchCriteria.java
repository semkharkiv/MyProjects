package myProject.bookLibrary;

public class YearOfIssueSearchCriteria implements SearchCriteria{
    private String yearOfIssueToSearch;


    public YearOfIssueSearchCriteria(String yearOfIssueToSearch) {
        this.yearOfIssueToSearch = yearOfIssueToSearch;
    }

    @Override
    public boolean match(Book book) {
        return book.getYearOfIssue() == Integer.parseInt(yearOfIssueToSearch);
    }
}
