class NameType{
public static void main(String args[]){
	String str="vaibhavi kumari";
	String substr="";
	for(int i=0;i<str.length();i++)
	{
		char ch=str.charAt(i);
		if(ch!=' ')
		{
			substr=substr+ch;
		}
		else{
			System.out.print(Character.toUpperCase(substr.charAt(0))+".");
			substr="";
		}
	}
	String str2="";
	for(int j=0;j<substr.length();j++)
	{
		if(j==0){
		
			str2=str2+Character.toUpperCase(substr.charAt(0));
		}
		
		else {
			str2=str2+Character.toLowerCase(substr.charAt(j));
		}
	}
	System.out.print(str2);
	
	}
}
