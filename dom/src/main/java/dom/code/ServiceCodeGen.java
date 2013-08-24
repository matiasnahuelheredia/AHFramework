package dom.code;

import java.util.List;




public class ServiceCodeGen {

	public static String generateCode (String code,List<Properties> prop)
	{
		    for (int i=0;i<prop.size();i++)
		    {
			code = code.replace(prop.get(i).getReplaceValue(), prop.get(i).getValue());
		    }
			return code;
	}
	
	
	public static String generateCodeLeonardo (String code,List<Properties> prop)
	{
		    for (int i=0;i<prop.size();i++)
		    {
		    	String replaceValue = prop.get(i).getValue();
		    	System.out.println("holichus leonardo");
		    	if (prop.get(i).getReplaceValue().contains("keyboard"))
		    	{
		    		System.out.println("leonardo contiene keyboard");
		    		
		    		replaceValue =	replaceValue.replace(":", "\");"+(char)13+"Keyboard.write(62);"+(char)13+"Keyboard.print(\"");
		    		replaceValue =	replaceValue.replace("/", "\");"+(char)13+"Keyboard.write(38);"+(char)13+"Keyboard.print(\"");
		    		replaceValue =	replaceValue.replace("+", "\");"+(char)13+"Keyboard.write(93);"+(char)13+"Keyboard.print(\"");
		    		replaceValue = "Keyboard.print(\""+ replaceValue;
		    		replaceValue = replaceValue+"\");"+(char)13+"Keyboard.println(\"\");";;
		    	}
			code = code.replace(prop.get(i).getReplaceValue(), replaceValue);
		    }
			return code;
	}
}
