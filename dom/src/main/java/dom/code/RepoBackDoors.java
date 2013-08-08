package dom.code;

import java.util.List;

import org.apache.isis.applib.AbstractDomainObject;
import org.apache.isis.applib.annotation.Named;
import org.apache.isis.applib.annotation.Optional;
@Named("BackDoors")
public class RepoBackDoors extends AbstractDomainObject {
    
	
    
  

    @Named("List of BackDoors")
	public List<BackDoor> ListOfBackDoors()
	{
    	final String currentUser = currentUserName();
        final List<BackDoor> items = allMatches(BackDoor.class, BackDoor.thoseOwnedBy(currentUser));
        
        return items;
		
	}
    @Named("Search Document")
    /**
     * TODO document search
     */
	public List<BackDoor> backDoorSearch(@Optional@Named("Document name")String name,@Optional@Named("Platform") Platform plat)
	{
    	final String currentUser = currentUserName();
        final List<BackDoor> items = allMatches(BackDoor.class, BackDoor.thoseOwnedBy(currentUser));
        
        return items;
		
		
	}
    
    protected String currentUserName() {
        return getContainer().getUser().getName();
    }
}
