package dom.code;

import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.AutoComplete;
import org.apache.isis.applib.annotation.ObjectType;
import org.apache.isis.applib.filter.Filter;

import com.google.common.base.Objects;
@PersistenceCapable
@ObjectType("BackDoor")
@AutoComplete(repository=BackDoor.class, action="autoComplete")
public class BackDoor {
    private String Description;
    private String filename;
    private Platform plat;
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public Platform getPlat() {
		return plat;
	}
	public void setPlat(Platform plat) {
		this.plat = plat;
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

	public static Filter<BackDoor> thoseOwnedBy(final String currentUser) {
       return new Filter<BackDoor>() {
           @Override
           public boolean accept(final BackDoor exploit) {
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
