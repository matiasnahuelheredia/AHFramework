package dom.code;



import java.util.List;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.annotation.ActionSemantics;
import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.ActionSemantics.Of;
import org.apache.isis.applib.annotation.Named;


@Named("Code Generator")
public class RepoCode extends AbstractFactoryAndRepository {


	 protected String currentUserName() {
	        return getContainer().getUser().getName();
	    }
	@ActionSemantics(Of.SAFE)
    @MemberOrder(sequence = "1")
	@Named ("List of exploits tools and payloads")
    public List<Exploit> exploitsList() {
	 
        final String currentUser = currentUserName();
        final List<Exploit> items = allMatches(Exploit.class, Exploit.thoseOwnedBy(currentUser));
        
        return items;
    }

	@Named("Search exploits tools and payloads")
	public List<Exploit> searchExploits(String description){
		final String currentUser = currentUserName();
        final List<Exploit> items = allMatches(Exploit.class, Exploit.thoseDescription(currentUser, description));
        
        return items;
		
	}
}
