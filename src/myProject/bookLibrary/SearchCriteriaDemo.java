package myProject.bookLibrary;

public class SearchCriteriaDemo {

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Федор Достоевский");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("Двойник");
        SearchCriteria searchCriteria = new AndSearchCriteria(authorSearchCriteria,titleSearchCriteria);

        SearchCriteria authorSearchCriteria1 = new AuthorSearchCriteria("Федор Достоевский");
        SearchCriteria titleSearchCriteria1 = new TitleSearchCriteria("Война и Мир");
        SearchCriteria searchCriteria1 = new OrSearchCriteria(authorSearchCriteria1,titleSearchCriteria1);



}
