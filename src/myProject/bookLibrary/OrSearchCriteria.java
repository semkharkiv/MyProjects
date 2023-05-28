package myProject.bookLibrary;

public class OrSearchCriteria implements SearchCriteria{
    private SearchCriteria leftCondition;
    private SearchCriteria rightCondition;

    public OrSearchCriteria(SearchCriteria leftCondition,
                            SearchCriteria rightCondition) {
        this.leftCondition = leftCondition;
        this.rightCondition = rightCondition;
    }
    @Override
    public boolean match(Book book) {
        if (leftCondition.match(book) || rightCondition.match(book)) {
//            System.out.println("Найденная книга:");
//            System.out.println(book);
            return true;
        }
        return false;
    }
}
