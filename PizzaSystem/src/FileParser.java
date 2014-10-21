/**
 * Created by ydubale on 10/20/14.
 */
import java.io.*;
import java.util.ArrayList;


public class FileParser {
    private UserFactory uF;

    public FileParser(){
        uF = new UserFactory();
    }

    public String getFileName(RecordType type){
        return type.name();
    }

    // UserFiles that can be parsed include:
    // Customers, Managers, Chefs file
    //TODO: Include semaphore checking before reading file
    //TODO: If file DNE, create it
    public ArrayList<User> readUserFile(RecordType type){
        ArrayList<User> users = new ArrayList<User>();
        String fName = getFileName(type);
        try{
            File inF = new File(fName);
            BufferedReader bF = new BufferedReader(new FileReader(inF));
            int lineCount = 0;
            try{
                String line;
                while((line = bF.readLine()) != null){
                    users.add(uF.getUserLine(type, LineParser.parseUserLine(type, line)));
                }
            }
            catch(IOException ioFault){
                System.out.printf("Error reading line %d in file\n", lineCount);
                //TODO: Proper error message
            }
        }
        catch(FileNotFoundException fDNE){
            System.out.printf("File %s DNE\n", fName);
            //TODO: Proper error
            //fDNE.printStackTrace();
            // Should return error to gui that can be displayed
            // Similar to 'Could not load users, please try again'
        }

        return users;
    }
    //TODO: REMOVE MAIN BEFORE SUBMITTING
    public static void main(String[] args){
        FileParser fp = new FileParser();
        //System.out.println(fp.getFileName(RecordType.CUSTOMER));

        ArrayList<User>  customers = fp.readUserFile(RecordType.CUSTOMER);
        for(User u : customers){
            Customer c = (Customer) u;
            System.out.println(c.toString());
        }
        System.out.println("---------------");
        ArrayList<User> managers = fp.readUserFile(RecordType.MANAGER);
        for(User u : managers){
            Manager m = (Manager) u;
            System.out.println(m.toString());
        }
        System.out.println("---------------");
        ArrayList<User> chefs = fp.readUserFile(RecordType.CHEF);
        for(User u : chefs){
            Chef ch = (Chef) u;
            System.out.println(ch.toString());
        }

    }
}
