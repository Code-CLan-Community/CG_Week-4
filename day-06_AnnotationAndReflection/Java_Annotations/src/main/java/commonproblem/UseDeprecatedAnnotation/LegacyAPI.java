package commonproblem.UseDeprecatedAnnotation;
// Creating class LegacyAPI to use @Deprecated annotation
public class LegacyAPI
{
    @Deprecated
    public void oldFeature()
    {
        System.out.println("This is the old feature.");
    }

    public void newFeature()
    {
        System.out.println("This is the new feature.");
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating object of the class
        LegacyAPI api = new LegacyAPI();
        // Calling methods of the class
        api.oldFeature();
        api.newFeature();
    }
}

