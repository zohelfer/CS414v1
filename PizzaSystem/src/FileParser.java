/**
 * Created by ydubale on 10/20/14.
 */
import java.io.*;
import java.util.ArrayList;


public class FileParser {
    private UserFactory uF;

    public FileParser(){

    }

    public String getFileName(RecordType type){
        return type.name();
    }

    public User parseCustomerLine(String line){
        String params[] = line.split("\\*");
        System.out.println(params.toString());

        return uF.getUser(RecordType.CUSTOMER, "Bob", 12);

    }

    public User parseUserLine(RecordType type, String line){
        if(type == RecordType.CUSTOMER){
            return parseCustomerLine(line);
        }
        return null;
    }

    // UserFiles include:
    // Customers, Managers, Chefs file
    public ArrayList<User> readUserFile(RecordType type){
        ArrayList<User> users = new ArrayList<User>();
        try{
            String fName = getFileName(type);
            System.out.println(fName);
            File inF = new File(fName);
            System.out.println("YAY");
            BufferedReader bF = new BufferedReader(new FileReader(inF));
            int lineCount = 0;
            try{
                String line;
                while((line = bF.readLine()) != null){
                    users.add(parseUserLine(type, line));
                }
            }
            catch(IOException ioFault){
                System.out.printf("Error reading line %d in file\n", lineCount);
            }
        }
        catch(FileNotFoundException fDNE){
            System.out.println("File DNE");
            fDNE.printStackTrace();
            // Should return error to gui that can be displayed
            // Similar to 'Could not load users, please try again'
        }

        return users;
    }

    public static void main(String[] args){
        FileParser fp = new FileParser();
        //System.out.println(fp.getFileName(RecordType.CUSTOMER));

        fp.readUserFile(RecordType.CUSTOMER);

    }
}
