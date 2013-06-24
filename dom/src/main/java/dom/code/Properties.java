package dom.code;

import javax.jdo.annotations.IdentityType;

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
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getReplaceValue() {
		return replaceValue;
	}
	public void setReplaceValue(String replaceValue) {
		this.replaceValue = replaceValue;
	}
}
