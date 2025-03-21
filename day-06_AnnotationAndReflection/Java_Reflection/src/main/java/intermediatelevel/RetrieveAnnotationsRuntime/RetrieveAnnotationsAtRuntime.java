package intermediatelevel.RetrieveAnnotationsRuntime;
// Creating class RetrieveAnnotationsAtRuntime
public class RetrieveAnnotationsAtRuntime
{
    // Main method
    public static void main(String[] args)
    {
        try
        {
            // Get the annotation from the Book class
            Author author = Book.class.getAnnotation(Author.class);

            if (author != null)
            {
                System.out.println("Author: " + author.name());
            }
            else
            {
                System.out.println("No Author annotation found.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}






