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
	
	
	public static String generateCodeLeonardo (String code,List<Properties> prop,Language lang)
	{
		    for (int i=0;i<prop.size();i++)
		    {
		    	String replaceValue = prop.get(i).getValue();
		    	//replace the value if the replace value is <!--keyboard-->
		    	if (prop.get(i).getReplaceValue().contains("keyboard"))
		    	{
		    		
		    		//for leonardo the ascci 
		    		if (lang==Language.SPANISH)
		    		{
		    		replaceValue =	replaceValue.replace(":", "\");"+(char)13+"Keyboard.write(62);"+(char)13+"Keyboard.print(\"");
		    		replaceValue =	replaceValue.replace("/", "\");"+(char)13+"Keyboard.write(38);"+(char)13+"Keyboard.print(\"");
		    		replaceValue =	replaceValue.replace("+", "\");"+(char)13+"Keyboard.write(93);"+(char)13+"Keyboard.print(\"");
		    		replaceValue = "Keyboard.print(\""+ replaceValue;
		    		replaceValue = replaceValue+"\");"+(char)13+"Keyboard.println(\"\");";;
		    		}
		    		else
		    		if (lang==Language.ENGLISH)
		    		{
		    			//write in the same ascci 
		    			replaceValue = "Keyboard.println(\""+ replaceValue;
			    		replaceValue = replaceValue+"\");";
		    		}
		    		
		    	}
			code = code.replace(prop.get(i).getReplaceValue(), replaceValue);
		    }
			return code;
	}
}
