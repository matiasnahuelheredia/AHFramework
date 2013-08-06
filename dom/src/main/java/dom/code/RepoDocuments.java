package dom.code;

import java.util.*;

import javax.jdo.annotations.Column;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.annotation.Disabled;
import org.apache.isis.applib.annotation.Named;
import org.apache.isis.applib.annotation.Optional;


@Named("documents")
public class RepoDocuments extends AbstractFactoryAndRepository{
	
	protected String currentUserName() {
        return getContainer().getUser().getName();
    }
    @Named("List of Documents")
	public List<Document> ListOfDocuments()
	{
    	final String currentUser = currentUserName();
        final List<Document> items = allMatches(Document.class, Document.thoseOwnedBy(currentUser));
        
        return items;
		
	}
    @Named("Search Document")
    /**
     * TODO document search
     */
	public List<Document> DocumentsSearch(@Optional@Named("Document name")String name,@Optional@Named("Language") Language lang)
	{
    	final String currentUser = currentUserName();
        final List<Document> items = allMatches(Document.class, Document.thoseOwnedBy(currentUser));
        
        return items;
		
		
	}
    public String iconName() {
        return "ToDoItem";
    }
}
