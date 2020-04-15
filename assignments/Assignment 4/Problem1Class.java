package Homework3;

public class Problem1Class {
	
	private double balance;
	private boolean giftCard,honoredStatus;
	
	public void calculateBalance (double balance ) {
		int index;
		final double [] interest={	 0.0,   0.01,	0.011,	0.0125,	0.015,	0.02,	0.025};
		final double [] fee={		50.0,   0.0,    0.0,    0.0,    0.0,    0.0,    0.0};
		final boolean [] card = {  false, false,  false,  false,  false,  false,	true};
		if (balance <= 0.0) 
			index=0;
		else
			if (balance < 1_500.0)
				index=1;
			else
				if (balance <= 5_000.0)
					index=2;
				else
					if (balance < 10_000.0)
						index=3;
					else
						if (balance <= 25_000.0)
							index=4;
						else
							if (balance < 50_000.0)
								index = 5;
							else 
								index = 6;
		 setBalance(balance*(1+interest[index])-fee[index]);
		 setGiftCard(card[index]);
		 setHonoredStatus(isGiftCard());
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isGiftCard() {
		return giftCard;
	}

	public void setGiftCard(boolean giftCard) {
		this.giftCard = giftCard;
	}

	public boolean isHonoredStatus() {
		return honoredStatus;
	}

	public void setHonoredStatus(boolean honoredStatus) {
		this.honoredStatus = honoredStatus;
	}

}
