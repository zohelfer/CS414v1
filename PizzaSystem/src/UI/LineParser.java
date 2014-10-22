package UI;

/**
 * Created by ydubale on 10/20/14.
 */

// Safely parses line in files
public class LineParser {

    private static final int CUSTOMER_FIELDS = 4;
    // Assuming all employees have same fields (at least name, id)
    // Probably bad design
    private static final int EMPLOYEE_FIELDS = 2;

    private static String[] getParams(int fields, String lineRead[]){
        String params[] = new String[fields];
        int index =0;
        for(String param : lineRead){
            params[index] = param; // Copy all read fields
            index++;
        }
        if(lineRead.length != fields){
            for(int i=index; i < params.length; i++){
                params[i] = ""; // Setting the rest of the fields to null
            }
        }
        return params;
    }
    // think of way of eliminating the record type
    // Really shouldn't have do this check if we are the ones writing to the file
    // As long as file is written correctly.
    public static String[] parseUserLine(RecordType type, String line){

        if(type == RecordType.CUSTOMER){
            return getParams(CUSTOMER_FIELDS, line.split("\\*"));
        }
        else if(type == RecordType.MANAGER || type == RecordType.CHEF){
            return getParams(EMPLOYEE_FIELDS, line.split("\\*"));
        }
        else return null;

    }
}
