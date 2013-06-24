package dom.code;

import javax.jdo.annotations.IdentityType;

import org.apache.isis.applib.annotation.Hidden;
import org.apache.isis.applib.annotation.MultiLine;
import org.apache.isis.applib.annotation.ObjectType;

@javax.jdo.annotations.PersistenceCapable(identityType=IdentityType.DATASTORE)
@ObjectType("Description")

public class Description {
	private String languaje;
	private String description;
	@Hidden
	public String getLanguaje() {
		return languaje;
	}
	public void setLanguaje(String languaje) {
		this.languaje = languaje;
	}
	@MultiLine
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
	}
	public String title()
	{
		return this.languaje;
	}
}
