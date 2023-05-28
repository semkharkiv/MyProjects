package myProject.bookLibrary;

public class MyLibraryTest {
    private final BookDatabaseImpl bookDatabase = new BookDatabaseImpl();

    public MyLibraryTest() {
        Book book1 = new Book("Лев Толстой", "Детство", 1852);
        bookDatabase.save(book1);

        Book book2 = new Book("Федор Достоевский", "Бесы", 1871);
        bookDatabase.save(book2);

        Book book3 = new Book("Антон Чехов", "Дуэль", 1891);
        bookDatabase.save(book3);

        Book book4 = new Book("Николай Гоголь", "Шинель", 1843);
        bookDatabase.save(book4);

        Book book5 = new Book("Джейн Остин", "Гордость и предубеждение", 1813);
        bookDatabase.save(book5);

        Book book6 = new Book("Патрик Зюскинд", "Парфюмер", 1985);
        bookDatabase.save(book6);

        Book book7 = new Book("Марио Пьюзо", "Крестный Отец", 1969);
        bookDatabase.save(book7);

        Book book8 = new Book("Джейн Остин", "Эмма", 1815);
        bookDatabase.save(book8);

        Book book9 = new Book("Федор Достоевский", "Игрок", 1866);
        bookDatabase.save(book9);

        Book book10 = new Book("Федор Достоевский", "Двойник", 1845);
        bookDatabase.save(book10);

        Book book11 = new Book("Антон Чехов", "Тоска", 1886);
        bookDatabase.save(book11);

        Book book12 = new Book("Антон Чехов", "Хамелеон", 1884);
        bookDatabase.save(book12);

        Book book13 = new Book("Николай Гоголь", "Тарас Бульба", 1835);
        bookDatabase.save(book13);

        //        bookDatabase.bookListContains(bookDatabase.getBooks(), "Зюскинд", "Парфюмер");


//        System.out.println("Первоначальный список книг: ");
//        bookDatabase.getAllBooksInf(bookDatabase.getBooks());

        /***/
//        bookDatabase.delete(1l);  //удалить книгу по id
        /***/
//        bookDatabase.delete(book4); //удалить книгу по имени

//        bookDatabase.findById(1l); //true


//        bookDatabase.findByAuthor("Антон Чехов"); //true
//        bookDatabase.findByAuthor("фвд");   //false

//        bookDatabase.findByTitle("Эмма");
//        bookDatabase.findByTitle("Эма");


//        bookDatabase.deleteByAuthor("Чехов");
//        bookDatabase.deleteByTitle("Хамелеон");


//        System.out.println("---------");
//        bookDatabase.getAllBooksInf(bookDatabase.getBooks());
//        System.out.println("Количество книг в нашем списке- " + bookDatabase.countAllBooks());  //кол-во книг
//
//        AuthorSearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Федор Достоевский");
//        authorSearchCriteria.match(book2); //true
//
//        String titleToSearch = "Шинель";
//        TitleSearchCriteria titleSearchCriteria = new TitleSearchCriteria(titleToSearch);
//        titleSearchCriteria.match(book4);  //true
//
//        String yearOfIssueToSearch = "1843";
//        YearOfIssueSearchCriteria yearOfIssueSearchCriteria = new YearOfIssueSearchCriteria(yearOfIssueToSearch);
//        yearOfIssueSearchCriteria.match(book13); //false
//
//        AndSearchCriteria andSearchCriteria = new AndSearchCriteria(yearOfIssueSearchCriteria, titleSearchCriteria);
//        System.out.println(andSearchCriteria.match(book4));
        //-------------------------------------------------------
        /**На консоль выводятся ссылки, не могу найти в чем проблема */
//        SearchCriteriaDemo searchCriteriaDemo = new SearchCriteriaDemo();
//        System.out.println(searchCriteriaDemo.searchCriteria);
//        System.out.println(searchCriteriaDemo.searchCriteria1);
        //-------------------------------------------------------


        SearchCriteria searchCriteriaByAuthor = new AuthorSearchCriteria("Федор Достоевский");
        bookDatabase.find(searchCriteriaByAuthor);

        bookDatabase.contains(book2);
    }

}

