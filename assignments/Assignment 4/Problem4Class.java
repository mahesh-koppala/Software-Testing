package Homework3;

public class Problem4Class {

	public boolean checkOut (double cart, int creditRating, int yearsMember, boolean goldStatus) {
		   boolean approved=false;

		   if (goldStatus) {
			   if (cart <= 3_000.00)
				   approved = true;
			   else 
				   	if (creditRating >= 700)
					   approved = true; 
				   	else
				   		if (yearsMember > 5)
				   			approved = true;}
		   else {
			   if (cart <= 2_000.00)
				   approved = true;
			   else 
				   if (creditRating >= 750)
					   approved = true;
				   	else
				   		if (yearsMember > 7)
				   			approved = true;}
		   return approved;
		}
}