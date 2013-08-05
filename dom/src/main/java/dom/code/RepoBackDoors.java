package dom.code;

import org.apache.isis.applib.AbstractDomainObject;
import org.apache.isis.applib.annotation.Named;
@Named("BackDoors")
public class RepoBackDoors extends AbstractDomainObject {
    @Named("List of BackDoors")
	public String ListbackDoors(){
    	return "not available at this time wait next version";
		
	}
    
    @Named("Search BackDoor")
	public String BackDoorSearch()
	{
		return "not available at this time wait next version";
		
	}
}
