package lab5;

import java.util.*;

/**
 * The {@code BookShop} class represents a bookstore that maintains a collection of novels in a map.
 * It provides functionalities for storing, filtering, and sorting novels based on their titles.
 *
 * @author Shawn Lee
 * @author Lucas Liu
 *
 * @version 1.0
 */
class BookShop
{
    private final Map<String, Novel> novelMap;

    /**
     * Constructs a new {@code BookShop} with the given list of novels.
     * Initializes a map storing the novels with their titles as keys.
     * Removes titles containing "the" (case insensitive) and sorts the remaining ones.
     *
     * @param novelList A list of novels to be stored in the bookshop.
     */
    BookShop(final List<Novel> novelList)
    {
        novelMap = new HashMap<>();

        for(final Novel novel : novelList)
        {
            novelMap.put(novel.getTitle(), novel);
        }

        System.out.println("Original titles:\n");

        final Set<String> keys;
        keys = novelMap.keySet();

        final Iterator<String> it;
        it = keys.iterator();

        while(it.hasNext())
        {
            final String title;
            title = it.next();

            if(title != null)
            {
                System.out.println(title);
            }
        }

        final Iterator<String> it1;
        it1 = keys.iterator();

        while(it1.hasNext())
        {
            final String title;
            title = it1.next();

            if(title != null)
            {
                if(title.toLowerCase().contains("the"))
                {
                    it1.remove();
                }
            }
        }

        System.out.println("\nAfter removing title which contains \"the\" and sorting:\n ");

        final List<String> keyList;
        keyList = new ArrayList<>(keys);

        Collections.sort(keyList);

        final Iterator<String> it2;
        it2 = keyList.iterator();

        while(it2.hasNext())
        {
            final String title;
            title = it2.next();

            if(title != null)
            {
                System.out.println(novelMap.get(title));
            }
        }
    }

    /**
     * The main method that demonstrates the functionality of the {@code BookShop} class.
     * It initializes a {@code BookStore}, retrieves its book list, and passes it to the {@code BookShop}.
     *
     * @param args Command-line arguments.
     */
    public static void main(final String[] args)
    {
        BookStore bookstore = new BookStore("Classic Novels Collection");

        BookShop bookShop = new BookShop(bookstore.getBookList());
    }
}
