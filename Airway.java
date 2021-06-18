class Airway{
	String arrival;
	String departure;
	int flightNo;
	
	Airway(String reached){
		System.out.println("invoked constructor: ");
		arrival=reached;
		System.out.println("Arrival :" +arrival);
	}
	
		Airway(String leaving,int no ){
			System.out.println("invoked constructor");
			departure=leaving;
			flightNo=no;
			System.out.println("Departure : " + departure);
			System.out.println("FlightNo: "+ flightNo);
			} 
			
		Airway(){
			System.out.println("invoked default constructor");
			System.out.println("Arrival :" +arrival);
			System.out.println("Departure : " + departure);
			System.out.println("FlightNo: "+ flightNo);
		}
	
}