package basic;
import java.util.Scanner;
public class car extends cardetails{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		cardetails cd = new cardetails();
		
		System.out.print("Select car model: ");
		cd.setModel(sc.nextLine());
		System.out.print("Do you need insurence: ");
        cd.setInsurence(sc.nextLine());
		System.out.print("Do you need Additional Accessories: ");
		cd.setAccessories(sc.nextLine());
		System.out.print("Dealer discount: ");
		cd.setDiscount(sc.nextLine());
	    String cmodel=cd.getModel();
		switch (cmodel)	{
		case "PoloTredline":
			cd.setCost(870000);
			long cost =cd.getCost();
//			System.out.println("showroom price of selected car: "+cost);
			break;
			
		
		case "PoloHighline":
			cd.setCost(1009000);
			cost =cd.getCost();
//			System.out.println("showroom price of selected car: "+cost);			
			break;
			
		
		case "VitusTredline":
			cd.setCost(1105000);
			cost =cd.getCost();
//			System.out.println("showroom price of selected car: "+cost);
			break;
		
		case "VitusHighline":
			cd.setCost(1308000);
			cost =cd.getCost();
//			System.out.println("showroom price of selected car: "+cost);
			break;
		
		case "TaigunTredline":
			cd.setCost(1489000);
			cost =cd.getCost();
//			System.out.println("showroom price of selected car: "+cost);
			break;
		
		case "TaigunHighline":
			cd.setCost(1542000);
			cost =cd.getCost();
//			System.out.println("showroom price of selected car: "+cost);
			break;
		
		case "TaigunTopline":
			cd.setCost(1771000);
			cost =cd.getCost();
//			System.out.println("showroom price of selected car: "+cost);
			break;
		
		
		
		}
		long cost = cd.getCost();
		cd.totalcost(cmodel,cost);
        
	}
	
}
