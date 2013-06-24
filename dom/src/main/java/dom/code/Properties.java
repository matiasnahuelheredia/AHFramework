package dom.code;

import javax.jdo.annotations.IdentityType;

import org.apache.isis.applib.annotation.Hidden;
import org.apache.isis.applib.annotation.ObjectType;

@javax.jdo.annotations.PersistenceCapable(identityType=IdentityType.DATASTORE)
@ObjectType("Properties")
public class Properties {

	private String name;
	private String value;
	private String replaceValue;
	public String getName() {
		return name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Hidden
	public String getReplaceValue() {
		return replaceValue;
	}
	public void setReplaceValue(String replaceValue) {
		this.replaceValue = replaceValue;
	}
	public String title()
	{
		return name;
	}
}
