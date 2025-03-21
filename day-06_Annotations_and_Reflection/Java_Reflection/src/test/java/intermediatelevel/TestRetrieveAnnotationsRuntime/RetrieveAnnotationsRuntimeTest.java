package intermediatelevel.TestRetrieveAnnotationsRuntime;
import intermediatelevel.RetrieveAnnotationsRuntime.Author;
import org.junit.jupiter.api.Test;
import intermediatelevel.RetrieveAnnotationsRuntime.Book;
import static org.junit.jupiter.api.Assertions.*;
// Creating class RetrieveAnnotationsRuntimeTest to test our RetrieveAnnotationsRuntime program
public class RetrieveAnnotationsRuntimeTest
{
    @Test
    void testRetrieveAuthorAnnotation()
    {
        try {
            // Get the annotation from the Book class
            Author author = Book.class.getAnnotation(Author.class);

            // Check that the annotation is present and has the correct value
            assertNotNull(author, "Author annotation should be present");
            assertEquals("Author Name", author.name());
        }
        catch (Exception e)
        {
            System.out.println("Exception should not have been thrown: " + e.getMessage());
        }
    }
}
