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
}
