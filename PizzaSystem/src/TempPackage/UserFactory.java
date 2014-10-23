package TempPackage;

/**
 * Created by ydubale on 10/20/14.
 */
public class UserFactory {
    /*
    public User getUser(RecordType fType, String name, int id){
        if(fType == RecordType.CHEF){
            return new Chef(name, id);
        }
        else if(fType == RecordType.MANAGER){
            return new Manager(name, id);
        }
        return null;
    }
    //TODO: Does params need error checking?
    public User getUserLine(RecordType type, String params[]){
        String name ="";
        int id = 0;
        if(params.length >= 2){
            name = params[0];
            id = Integer.parseInt(params[1]);
        } else return null;

        if(type == RecordType.CUSTOMER){
            if(params.length == 4){
                String phone = params[2];
                String addr = params[3];
                return new Customer(name, id, phone, addr);
            }
            else{
                return getUser(type, name, id);
            }
        }
        else if(type == RecordType.MANAGER || type == RecordType.CHEF ){
            return getUser(type, name, id);
        }
        else return null;
    }
    */

}
