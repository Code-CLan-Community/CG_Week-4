package advanceJUnitProblems.dateformatter;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFormatter {

    public String formatDate(String inputDate) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
            // Output date format
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");
            return outputFormat.format(inputFormat.parse(inputDate));
        } catch (ParseException e) {
            // If the input date format is incorrect, return null or throw an exception
            return null;
        }
    }
}
