package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class BookStore
{
    private static final int PERCENTAGE_FACTOR = 100;
    private static final int CURRENT_YEAR = 2025;

    private final String name;
    private final List<Novel> bookList;

    BookStore(final String name)
    {
        this.name = name;
        this.bookList = new ArrayList<>();

        bookList.add(new Novel("The Adventures of Augie March",
                "Saul Bellow", 1953));

        bookList.add(new Novel("All the King’s Men",
                "Robert Penn Warren", 1946));

        bookList.add(new Novel("American Pastoral",
                "Philip Roth", 1997));

        bookList.add(new Novel("An American Tragedy",
                "Theodore Dreiser", 1925));

        bookList.add(new Novel("Animal Farm",
                "George Orwell", 1946));

        bookList.add(new Novel("Appointment in Samarra",
                "John O'Hara", 1934));

        bookList.add(new Novel("Are You There God? It's Me, Margaret.",
                "Judy Blume", 1970));

        bookList.add(new Novel("The Assistant",
                "Bernard Malamud", 1957));

        bookList.add(new Novel("At Swim-Two-Birds",
                "Flann O'Brien", 1938));

        bookList.add(new Novel("Atonement", "Ian McEwan", 2002));
        bookList.add(new Novel("Beloved", "Toni Morrison", 1987));
        bookList.add(new Novel("The Berlin Stories", "Christopher Isherwood", 1946));
        bookList.add(new Novel("The Big Sleep", "Raymond Chandler", 1939));
        bookList.add(new Novel("The Blind Assassin", "Margaret Atwood", 2000));
        bookList.add(new Novel("Blood Meridian", "Cormac McCarthy", 1986));
        bookList.add(new Novel("Brideshead Revisited", "Evelyn Waugh", 1946));
        bookList.add(new Novel("The Bridge of San Luis Rey", "Thornton Wilder", 1927));
        bookList.add(new Novel("Call It Sleep", "Henry Roth", 1935));
        bookList.add(new Novel("Catch-22", "Joseph Heller", 1961));
        bookList.add(new Novel("The Catcher in the Rye", "J.D. Salinger", 1951));
        bookList.add(new Novel("A Clockwork Orange", "Anthony Burgess", 1963));
        bookList.add(new Novel("The Confessions of Nat Turner", "William Styron", 1967));
        bookList.add(new Novel("The Corrections", "Jonathan Franzen", 2001));
        bookList.add(new Novel("The Crying of Lot 49", "Thomas Pynchon", 1966));
        bookList.add(new Novel("A Dance to the Music of Time", "Anthony Powell", 1951));
        bookList.add(new Novel("The Day of the Locust", "Nathanael West", 1939));
        bookList.add(new Novel("Death Comes for the Archbishop", "Willa Cather", 1927));
        bookList.add(new Novel("A Death in the Family", "James Agee", 1958));
        bookList.add(new Novel("The Death of the Heart", "Elizabeth Bowen", 1958));
        bookList.add(new Novel("Deliverance", "James Dickey", 1970));
        bookList.add(new Novel("Dog Soldiers", "Robert Stone", 1974));
        bookList.add(new Novel("Falconer", "John Cheever", 1977));
        bookList.add(new Novel("The French Lieutenant's Woman", "John Fowles", 1969));
        bookList.add(new Novel("The Golden Notebook", "Doris Lessing", 1962));
        bookList.add(new Novel("Go Tell It on the Mountain", "James Baldwin", 1953));
        bookList.add(new Novel("Gone with the Wind", "Margaret Mitchell", 1936));
        bookList.add(new Novel("The Grapes of Wrath", "John Steinbeck", 1939));
        bookList.add(new Novel("Gravity's Rainbow", "Thomas Pynchon", 1973));
        bookList.add(new Novel("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        bookList.add(new Novel("A Handful of Dust", "Evelyn Waugh", 1934));
        bookList.add(new Novel("The Heart Is a Lonely Hunter", "Carson McCullers", 1940));
        bookList.add(new Novel("The Heart of the Matter", "Graham Greene", 1948));
        bookList.add(new Novel("Herzog", "Saul Bellow", 1964));
        bookList.add(new Novel("Housekeeping", "Marilynne Robinson", 1981));
        bookList.add(new Novel("A House for Mr. Biswas", "V.S. Naipaul", 1962));
        bookList.add(new Novel("I, Claudius", "Robert Graves", 1934));
        bookList.add(new Novel("Infinite Jest", "David Foster Wallace", 1996));
        bookList.add(new Novel("Invisible Man", "Ralph Ellison", 1952));
        bookList.add(new Novel("Light in August", "William Faulkner", 1932));
        bookList.add(new Novel("The Lion, The Witch and the Wardrobe", "C.S. Lewis", 1950));
        bookList.add(new Novel("Lolita", "Vladimir Nabokov", 1955));
        bookList.add(new Novel("Lord of the Flies", "William Golding", 1954));
        bookList.add(new Novel("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        bookList.add(new Novel("Loving", "Henry Green", 1945));
        bookList.add(new Novel("Lucky Jim", "Kingsley Amis", 1954));
        bookList.add(new Novel("The Man Who Loved Children", "Christina Stead", 1940));
        bookList.add(new Novel("Midnight's Children", "Salman Rushdie", 1981));
        bookList.add(new Novel("Money", "Martin Amis", 1984));
        bookList.add(new Novel("The Moviegoer", "Walker Percy", 1961));
        bookList.add(new Novel("Mrs. Dalloway", "Virginia Woolf", 1925));
        bookList.add(new Novel("Naked Lunch", "William Burroughs", 1959));
        bookList.add(new Novel("Native Son", "Richard Wright", 1940));
        bookList.add(new Novel("Neuromancer", "William Gibson", 1984));
        bookList.add(new Novel("Never Let Me Go", "Kazuo Ishiguro", 2005));
        bookList.add(new Novel("1984", "George Orwell", 1948));
        bookList.add(new Novel("On the Road", "Jack Kerouac", 1957));
        bookList.add(new Novel("One Flew Over the Cuckoo's Nest", "Ken Kesey", 1962));
        bookList.add(new Novel("The Painted Bird", "Jerzy Kosinski", 1965));
        bookList.add(new Novel("Pale Fire", "Vladimir Nabokov", 1962));
        bookList.add(new Novel("A Passage to India", "E.M. Forster", 1924));
        bookList.add(new Novel("Play It as It Lays", "Joan Didion", 1970));
        bookList.add(new Novel("Portnoy's Complaint", "Philip Roth", 1969));
        bookList.add(new Novel("Possession", "A.S. Byatt", 1990));
        bookList.add(new Novel("The Power and the Glory", "Graham Greene", 1939));
        bookList.add(new Novel("The Prime of Miss Jean Brodie", "Muriel Spark", 1961));
        bookList.add(new Novel("Rabbit, Run", "John Updike", 1960));
        bookList.add(new Novel("Ragtime", "E.L. Doctorow", 1975));
        bookList.add(new Novel("The Recognitions", "William Gaddis", 1955));
        bookList.add(new Novel("Red Harvest", "Dashiell Hammett", 1929));
        bookList.add(new Novel("Revolutionary Road", "Richard Yates", 1961));
        bookList.add(new Novel("The Sheltering Sky", "Paul Bowles", 1949));
        bookList.add(new Novel("Slaughterhouse-Five", "Kurt Vonnegut", 1969));
        bookList.add(new Novel("Snow Crash", "Neal Stephenson", 1992));
        bookList.add(new Novel("The Sot-Weed Factor", "John Barth", 1960));
        bookList.add(new Novel("The Sound and the Fury", "William Faulkner", 1929));
        bookList.add(new Novel("The Sportswriter", "Richard Ford", 1986));
        bookList.add(new Novel("The Spy Who Came in from the Cold", "John le Carré", 1964));
        bookList.add(new Novel("The Sun Also Rises", "Ernest Hemingway", 1926));
        bookList.add(new Novel("Their Eyes Were Watching God", "Zora Neale Hurston", 1937));
        bookList.add(new Novel("Things Fall Apart", "Chinua Achebe", 1959));
        bookList.add(new Novel("To Kill a Mockingbird", "Harper Lee", 1960));
        bookList.add(new Novel("To the Lighthouse", "Virginia Woolf", 1929));
        bookList.add(new Novel("Tropic of Cancer", "Henry Miller", 1934));
        bookList.add(new Novel("Ubik", "Philip K. Dick", 1969));
        bookList.add(new Novel("Under the Net", "Iris Murdoch", 1954));
        bookList.add(new Novel("Under the Volcano", "Malcolm Lowry", 1947));
        bookList.add(new Novel("Watchmen", "Alan Moore and Dave Gibbons", 1986));
        bookList.add(new Novel("White Noise", "Don DeLillo", 1985));
        bookList.add(new Novel("White Teeth", "Zadie Smith", 2000));
        bookList.add(new Novel("Wide Sargasso Sea", "Jean Rhys", 1966));
    }

    public List<Novel> getBookList()
    {
        return bookList;
    }

    /**
     * A method which prints all the tiles in the list in uppercase.
     */
    private void printAllTitles()
    {
        if(bookList != null)
        {
            for(final Novel novel : bookList)
            {
                if(novel != null)
                {
                    System.out.println(novel.getTitle().toUpperCase());
                }
            }
        }
        // Not sure if I need to add another println when bookList is Null.
    }

    /**
     * A method which prints all titles that contain the
     * specified parameter.
     *
     * @param title To check whether the title of the novel contains it.
     */
    public void printBookTitle(final String title)
    {
        if(bookList != null)
        {
            for(final Novel novel: bookList)
            {
                if(novel != null)
                {
                    if(novel.getTitle().toUpperCase().contains(title.toUpperCase()))
                    {
                        System.out.println(novel.getTitle());
                    }
                }
            }
        }
    }

    /**
     * A method which prints all titles in alphabetical
     * order, A-Z.
     */
    public void printTitlesInAlphaOrder()
    {
        Collections.sort(bookList);

        for(final Novel novel : bookList)
        {
            System.out.println(novel.getTitle());
        }
    }

    /**
     * Checks if there is a book written in a specific year.
     *
     * @param year The year to search for.
     * @return {@code true} if a book was published in the given year, otherwise {@code false}.
     */
    public boolean isThereABookWrittenIn(final int year)
    {
        if(bookList != null)
        {
            for(final Novel novel : bookList)
            {
                if(novel != null)
                {
                    if(novel.getYearPublished() == year)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /**
     * Check and count the amount of books which contains
     * a specific word in a title.
     *
     * @param word the word to search for.
     * @return the amount of Books that
     * contain this word in their title.
     */
    public int howManyBooksContain(final String word)
    {
        int count;
        count = 0;

        if(bookList != null)
        {
            for(final Novel novel : bookList)
            {
                if(novel != null)
                {
                    if(novel.getTitle().toLowerCase().contains(word.toLowerCase()))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * A method which returns the percentage of the books
     * which were written between the given two years (inclusive).
     * @param first The given first year.
     * @param last The given last year.
     * @return The percentage of the books which were
     * written between these two years (inclusive).
     */
    public int whichPercentWrittenBetween(final int first, final int last)
    {
        final int totalBooks;
        final int percentage;
        int withinRange;

        totalBooks = bookList.size();
        withinRange = 0;

        if(bookList != null)
        {
            for(final Novel novel : bookList)
            {
                if(novel != null)
                {
                    if(first <= novel.getYearPublished() &&
                            novel.getYearPublished() <= last)
                    {
                        withinRange++;
                    }
                }
            }
        }
        percentage = withinRange * PERCENTAGE_FACTOR / totalBooks ;
        System.out.println(percentage); // For debugging
        System.out.println(totalBooks); // For debugging
        return percentage;
    }

    /**
     * A method which returns a list of books whose title is the length of the argument.
     * @param titleLength The given length for the title.
     * @return A List of all books whose title is this length.
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        final List<Novel> newBookList;

        newBookList = new ArrayList<>();

        if(bookList != null)
        {
            final Iterator<Novel> it;
            it = bookList.iterator();

            while(it.hasNext())
            {
                final Novel novel;
                novel = it.next();

                if(novel != null)
                {
                    if(novel.getTitle().length() == titleLength)
                    {
                        newBookList.add(novel);
                    }
                }
            }
        }
        return newBookList;
    }

    public Novel getOldestBook()
    {
        Novel oldestBook;

        oldestBook = bookList.getFirst();

        for(Novel novel : bookList)
        {
            if(novel.getYearPublished() < oldestBook.getYearPublished())
            {
                oldestBook = novel;
            }
        }
        return oldestBook;
    }

    public void printGroupByDecade(final int year)
    {
        for(Novel novel : bookList)
        {
            if(novel.getYearPublished() - year <= 9 &&
            novel.getYearPublished() - year >= 0)
            {
                System.out.println(novel.getTitle());
            }
        }
    }

    public void getLongest()
    {
        Novel longestBook;

        longestBook = bookList.getFirst();

        for(Novel novel : bookList)
        {
            if(novel.getTitle().length() > longestBook.getTitle().length())
            {
                longestBook = novel;
            }
        }
        System.out.println(longestBook.getTitle());
    }

    public static void main(final String[] args)
    {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;
        bookstore = new BookStore("Classic Novels Collection");
        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();
        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");
        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();
        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);
        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();
        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenIn(1950));
        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));
        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");
        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " +
                oldest.getYearPublished());
        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }
}
