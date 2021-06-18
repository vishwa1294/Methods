class Oven{
 
 String brand;
 String type;
 String modelNo;
 
 Oven(String trade, String category, String num){
	 
	 System.out.println("invoked oven");
	 
	 brand = trade;
	 System.out.println("Brand : " + brand);
	 
	 type=category;
	 System.out.println("Type : " + category);
     
	 modelNo=num;
	 System.out.println("Modelno : " + modelNo);
 

 }
 
 
 
 
}