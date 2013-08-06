package dom.code;

import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.AutoComplete;
import org.apache.isis.applib.annotation.ObjectType;
import org.apache.isis.applib.filter.Filter;

import com.google.common.base.Objects;

@PersistenceCapable
@ObjectType("Document")
@AutoComplete(repository=Document.class, action="autoComplete")
public class Document {
     private String Description;
     private String filename;
     private Language lang;
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public Language getLang() {
		return lang;
	}
	public void setLang(Language lang) {
		this.lang = lang;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public DomainObjectContainer getContainer() {
		return container;
	}

	public void setContainer(DomainObjectContainer container) {
		this.container = container;
	}

	public static Filter<Document> thoseOwnedBy(final String currentUser) {
        return new Filter<Document>() {
            @Override
            public boolean accept(final Document exploit) {
                return Objects.equal("arduino", currentUser);
            }

        };
    }

    private DomainObjectContainer container;

    public void setDomainObjectContainer(final DomainObjectContainer container) {
        this.container = container;
    }

    public String title()
    {
    	return this.filename;
    }
    
    
     
}
