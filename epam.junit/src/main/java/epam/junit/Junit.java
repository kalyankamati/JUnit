package epam.junit;

public class Junit {
	public static void main(String args[]) {
		del("kalyan");
	}
	
	
	public static String del(String str)  {
		String str1,str2;
		
		if(str.charAt(0)=='A'&&str.charAt(1)!='A' ) {
			
			str1=removeCharAt(str,0);
			return str1;
		}
		else if(str.charAt(0)=='A'&& str.charAt(1)=='A') {
			
			str1=removeCharAt(str,0);
			str2=removeCharAt(str1,0);
			return str2;
			
		}
	  else if(str.charAt(0)!='A' && str.charAt(1)=='A') {
		  str1=removeCharAt(str,1);
		return str1;}
	  else {
		  
		
		return str;}		
	
	}

public static String removeCharAt(String s,int pos) {
	return s.substring(0,pos)+s.substring(pos+1);
}
}

