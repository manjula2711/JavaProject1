package basic;

public class cardetails {
	private String carmodel;
	private String insurence;
	private String accessories;
	private String discount;
	private long carcost;
	private long RTO = 113990;
	private long Insurence;
	private long TCScharges = 11000;
	private long Accessories;
	private long tot_amount;
	private long dealerdiscount;
	
	public String getModel() {
		return carmodel;
	}
	public void setModel(String carmodel) {
	     this.carmodel=carmodel;
	}
	public long getCost() {
		return carcost;
	}
	public void setCost(long carcost) {
		this.carcost=carcost;
	}
	public String getInsurenece() {
		return insurence;
	}
	public void setInsurence(String insurence) {
	     this.insurence=insurence;
	}
	public String getAccessories() {
		return accessories;
	}
	public void setAccessories(String accessories) {
	     this.accessories=accessories;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
	     this.discount=discount;
	}


	public void totalcost(String carmodel,long cost) {
		 tot_amount= cost + RTO + TCScharges;
		 if(insurence.equalsIgnoreCase("yes")) {
			 Insurence=47300;
			 tot_amount+=Insurence;
		 }
		 if(accessories.equalsIgnoreCase("yes")) {
			Accessories=15000;
			tot_amount+=Accessories;
		 }
		 if(discount.endsWith("%")) {
			 discount=discount.replace("%","");
			 dealerdiscount=Integer.valueOf(discount)*cost/100;
			
		 }
		 else {
			 dealerdiscount=Integer.valueOf(discount);
		 }
		 if(dealerdiscount>30000)
		 {
			 System.out.println("maximum discount to be applied should not cross 30,000");
		 }
		 if(!insurence.equalsIgnoreCase("yes")&& !accessories.equalsIgnoreCase("yes")&& dealerdiscount>0)
		 { 
			 System.out.println("any one of the additional features have to be added");
			 dealerdiscount=0;
		 }
		 if(insurence.equalsIgnoreCase("yes")||accessories.equalsIgnoreCase("yes")&& dealerdiscount <= 30000)
		 {
			 tot_amount-=dealerdiscount;
		 }

	
		 System.out.println(" ");
		 System.out.println("Total cost "+tot_amount+"("+carmodel+" "+cost+"+"+RTO+"(RTO)+"+Insurence+"(Insurance)+"+TCScharges+"(TCS)+"+Accessories+"(Additional Accessories)-"+dealerdiscount+"(Dealer discount))");
		 
	}	
 
}
	
