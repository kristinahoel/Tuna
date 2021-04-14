import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.3
 */
public class MessagePost extends Post
{
    private String message;  // an arbitrarily long, multi-line message

    /**
     * Constructor for objects of class MessagePost.
     * 
     * @param author    The username of the author of this post.
     * @param text      The text of this post.
     */
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }

    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getText()
    {
        return message;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {
        super.display();
        System.out.println(message);
    }

    /**
     * Overriding, Endre equals-metoden fra å sammenligne minneadresse, til å 
     * sammenligne innholdet
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagePost)) {
            return false;
        }
        MessagePost other = (MessagePost) obj;
        return this.message.equals(other.message);

    }

    /**
     * Overriding, Endre hashCode-metoden for å gi oss samme integer, dersom 
     * to objekter er like.
     */
    public int hashCode() {
        int result = 17;
        result = 37 * result + message.hashCode();
        return result;
    }
}
