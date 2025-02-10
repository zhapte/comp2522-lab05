package lab5;

/**
 * Represents a novel with a title, author name, and publication year.
 * This class provides methods to retrieve novel details.
 *
 * @author Shawn Lee
 * @author Lucas
 *
 * @version 1.0
 */
class Novel implements Comparable<Novel>
{
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
        return this.getTitle().compareTo(other.getTitle());
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
}
