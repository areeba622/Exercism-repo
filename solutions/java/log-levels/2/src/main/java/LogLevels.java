import java.util.* ;

// trim() to remove "/r /n " and whitespaces

// split() method will turn string in array . [1] will access the second index

public class LogLevels {
    
    public static String message(String logLine) {
       return logLine.split(":")[1].trim();
        
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split("]:",2); // 2 ensures you only split at the first colon
        String first = parts[0].replace("[","").trim().toLowerCase();
        return first ;
        
    }

    public static String reformat(String logLine) {
       String[] parts = logLine.split("]:",2);
        String secondPart = message( logLine);
       // String secondPart = parts[1].trim(); // from message() method
        String firstPart = logLevel( logLine);
       // String firstPart = parts[0].replace("[","").trim().toLowerCase(); // from loglevel() method

        return secondPart + " (" + firstPart + ")" ;
        
// remarks implemented
 /* The reformat method should reuse the logic implemented in message. Reusing existing methods can help make code easier to maintain.

Recommended
The reformat method should reuse the logic implemented in logLevel. Reusing existing methods can help make code easier to maintain.*/
    }
}
