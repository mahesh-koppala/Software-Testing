package Homework3;

public class Problem3Class {

	public boolean approvePurchase (boolean member, int creditRating, double cart) {
		   boolean approved=false;

		   if (member) {
			   if (creditRating >= 650)
				   if (cart <= 5_000.0)
					   if (cart > 2_500.0)
						   approved = true; }
		   else {
			   if (creditRating >= 700)
				   approved = true;
			   else
				   if (cart <= 3_500.0)
					   if (cart > 1_500.0)
						   approved = true; }
		   return approved;
		}
}