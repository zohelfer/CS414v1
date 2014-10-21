/**
 * Created by ydubale on 10/20/14.
 */
public class UserFactory {

    public User getUser(RecordType fType, String name, int id){
        if(fType == RecordType.CHEF){
            return new Chef(name, id);
        }
        else if(fType == RecordType.CUSTOMER){
            return new Customer(name, id);
        }
        else if(fType == RecordType.MANAGER){
            return new Manager(name, id);
        }
        return null;
    }

}
