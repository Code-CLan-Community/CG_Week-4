package intermediatelevel.AccessandModifyStaticFields;
// Creating class Configuration
public class Configuration
{
    private static String API_KEY = "OriginalAPIKey";

    public static String getApiKey() {
        return API_KEY;
    }
}
