package lab5;

/**
 * Represents a novel with a title, author name, and publication year.
 * This class provides methods to retrieve novel details.
 *
 * @author Shawn Lee
 * @author Lucas Liu
 *
 * @version 1.0
 */
class Novel implements Comparable<Novel>
{
    private static final int MINIMUM_YEAR = 0;
    private static final int CURRENT_YEAR = 2025;

    private final String title;
    private final String authorName;
    private final int yearPublished;

    /**
     * Constructs a new Novel with the specified title,
     * author name, and publication year.
     *
     * @param title         the title of the novel
     * @param authorName    the name of the author
     * @param yearPublished the year the novel was published
     */
    Novel(final String title,
          final String authorName,
          final int yearPublished)
    {
        validateTitle(title);
        validateAuthorName(authorName);
        validateYearPublished(yearPublished);

        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the novel.
     *
     * @return the title of the novel
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Returns the name of the novel's author.
     *
     * @return the author's name
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Returns the year the novel was published.
     *
     * @return the publication year
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Compares this Novel with another Novel based on their titles in lexicographical order.
     *
     * @param other the Novel to be compared
     * @return a negative integer, zero, or a positive integer as this Novel's title
     *         is less than, equal to, or greater than the specified Novel's title
     */
    @Override
    public int compareTo(final Novel other)
    {
        return this.title.compareTo(other.title);
    }

    /**
     * Returns a string representation of the Novel, including its title, author, and year published.
     *
     * @return a formatted string containing the novel's details
     */
    @Override
    public String toString()
    {
        final StringBuilder builder;
        final String str;

        builder = new StringBuilder();

        builder.append("Title: ")
                .append(title)
                .append("\nAuthor: ")
                .append(authorName)
                .append("\nYear Published: ")
                .append(yearPublished)
                .append("\n");

        str = builder.toString();

        return str;
    }

    /*
     * A validation method for title which ckecks whether the given
     * title is null or epmpty. If so, it throws an IllegalArgumentException.
     */
    private void validateTitle(final String title)
    {
        final boolean isInvalid;

        isInvalid = title == null || title.isEmpty();

        if(isInvalid)
        {
            throw new IllegalArgumentException("Invalid title\n" +
                                               "Title shouldn't be null or empty");
        }
    }

    /*
     * A validation method for author name which ckecks whether the given
     * author name is null or epmpty. If so, it throws an IllegalArgumentException.
     */
    private void validateAuthorName(final String name)
    {
        final boolean isInvalid;

        isInvalid = name == null || name.isEmpty();

        if(isInvalid)
        {
            throw new IllegalArgumentException("Invalid author name\n" +
                                               "Author name shouldn't be null or empty");
        }
    }

    /*
     * A validation method for published year which ckecks whether the given
     * published year is between 0 and 2025. If not, it throws an IllegalArgumentException.
     */
    private void validateYearPublished(final int yearPublished)
    {
        final boolean isInvalid;

        isInvalid = MINIMUM_YEAR < yearPublished || yearPublished > CURRENT_YEAR;

        if(isInvalid)
        {
            throw new IllegalArgumentException("Year published must be between " +
                                               MINIMUM_YEAR + " and " + CURRENT_YEAR);
        }
    }
}
