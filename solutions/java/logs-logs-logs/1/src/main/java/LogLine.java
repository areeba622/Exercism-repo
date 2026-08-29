import java.util.*;
public class LogLine {

     String Line;

    public LogLine(String Line) {
        this.Line = Line;
        
    }

    public LogLevel getLogLevel() {
       String s =  Line.substring(1,4); //return shortform as substring

        switch (s){
            case "ERR" :
                return LogLevel.ERROR;
                
            case "TRC" :
                return LogLevel.TRACE;
                
            case "DBG" :
                return LogLevel.DEBUG;
                
            case "INF" :
                return LogLevel.INFO;
                
            case "WRN" :
                return LogLevel.WARNING;
                
            case "FTL" :
                return LogLevel.FATAL;
                
            default :
                 return LogLevel.UNKNOWN; 
                //to map with enums LogLevel
        
    }}

    public String getOutputForShortLog() {
        
        LogLevel Log = getLogLevel();
        String s2 = Line.substring(7);

        switch (Log){
            case ERROR :
                return "6:"+ s2;
                
            case TRACE  :
                return "1:"+ s2;
                
            case DEBUG  :
                return "2:"+ s2;
                
            case INFO  :
                return "4:"+ s2;
                 
            case WARNING  :
                return "5:"+s2;
                
            case FATAL  :
                return "42:"+ s2;
                
            default :
                 return "0:"+ s2; 
        }
        
    }
}
