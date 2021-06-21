class StringMethods{

public static void main(String[]args){

String temp="mobile";
String value=temp.concat("Redmi");//concat method
System.out.println("concat value:"+value);

String string="ABC";
boolean equals=string.equalsIgnoreCase("abc");
System.out.println("equalsIgnoreCase:"+equals);

//System.out.println("ABC".equalsIgnoreCase("abc"));//equalsIgnoreCase

String str="";
boolean strEmpty=str.isEmpty();//isEmpty

if(strEmpty){
	System.out.println("str is empty");
}else{
		System.out.println("str is not empty");

}
String name="Vaishnavi";
int index=name.indexOf("i");//indexOf
System.out.println("indexOf:"+index);

String p1="hello";
char[] ch=p1.toCharArray();//toCharArray
int len=ch.length;//int length
System.out.println("length:"+len);
 for(int i=0;i<len;i++){
	 System.out.println(ch[i]);
 }

char s1=name.charAt(3);//charAt
System.out.println("charAt:"+s1);


String scientistName="A P J Kalam";
System.out.println(scientistName.length());
scientistName=scientistName.substring(3,7);//substring bigin index and end index
System.out.println("substring:"+scientistName);
//System.out.println(scientistName.substring(3));//substring bigin index

String t1="hello  hello ";
System.out.println(t1+"developers");
System.out.println("trim:"+t1.trim()+"developers");//trim

 
 String animal="Lion";
 String animalUpperCase=animal.toUpperCase();//toUpperCase
System.out.println("uppercase:"+animalUpperCase);
System.out.println("lowercase:"+animalUpperCase.toLowerCase());//toLowerCase

String str1="Java string contains if else example";//contains
if(str1.contains("example")){
	System.out.println("the word found in given string");
}else{
		System.out.println("the word  not found in given string");

}
System.out.println(str1.endsWith("ple"));//endswith

String word="java is platform independent";
String replaceString=word.replace('e','k');//replace
System.out.println(replaceString);


String c1=new String("Icecream");//instace memory
String c2=c1.intern();//cp
System.out.println(c1==c2);// false
System.out.println(c1.equals(c2));// true
String c3="Icecream";//cp
System.out.println(c2==c3);// true

}
}