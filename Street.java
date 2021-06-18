class Street{
String areaName;
City city;
StreetType type;

enum StreetType{
MAIN,GALLI,NA,HIGHWAY
}
Street(City city){
System.out.println("invoked Street");
System.out.println(city);
this.city=city;

}
void updateAreaName(String areaName){
System.out.println("invoked updateAreaName");
System.out.println("areaName:"+areaName);
System.out.println("areaName:"+this.areaName);
this.areaName=areaName;	
}
void updateStreetType(){
System.out.println("invoked updateStreetType");
	
this.areaName=areaName;	
if(this.areaName.equals("Chikpet"))
{
	this.type=StreetType.GALLI;
System.out.println("areaName:"+areaName);
System.out.println("type:"+type);

} else if (this.areaName.equals("Mysore"))
{
	this.type=StreetType.HIGHWAY;
	System.out.println("areaName:"+areaName);
    System.out.println("type:"+type);

}	
else if (this.areaName.equals("MG Road"))
{
	this.type=StreetType.MAIN;
	System.out.println("areaName:"+areaName);
    System.out.println("type:"+type);
}
else{
		this.type=StreetType.NA;
}
}

void printAllInstanceVariables(){
System.out.println("invoked All variables");

System.out.println("areaName:"+this.areaName);
System.out.println("city:"+this.city);
System.out.println("type:"+this.type);
}
}
enum City{
BLR,MYS,MLR,BEL
}