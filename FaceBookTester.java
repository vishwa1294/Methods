class FaceBookTester{
public static void main(String[]args){

FaceBook temp=new FaceBook(320.0d);
System.out.println("version:"+temp.version);

FaceBook temp1=new FaceBook("Mark Zuckerberg");
System.out.println("Developer:"+temp1.leadDeveloper);

FaceBook temp2=new FaceBook(2004);
System.out.println("ReleaseDate"+temp2.releaseDate);

FaceBook temp3=new FaceBook(320.0d,"Mark Zuckerberg");
System.out.println("version:"+temp3.version);
System.out.println("Developer:"+temp3.leadDeveloper);

FaceBook temp4=new FaceBook(320.0d,"Mark Zuckerberg", 2004);
System.out.println("version:"+temp4.version);
System.out.println("Developer:"+temp4.leadDeveloper);
System.out.println("ReleaseDate"+temp4.releaseDate);

FaceBook temp5=new FaceBook(320.0d,2004);
System.out.println("version:"+temp5.version);
System.out.println("ReleaseDate"+temp5.releaseDate);

FaceBook temp6=new FaceBook("Mark Zuckerberg", 2004);
System.out.println("Developer:"+temp6.leadDeveloper);
System.out.println("ReleaseDate"+temp6.releaseDate);


}

}