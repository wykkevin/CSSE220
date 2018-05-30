
public class HighBet implements Betable {

	private boolean isHighbet;
	private double amount;
	
	public HighBet(int highOrLow, double betAmount){
		this.isHighbet=(highOrLow==5||highOrLow==6);
		this.amount=betAmount;
	}
	
	@Override
	public boolean isWinResult(int rollResult) {
		boolean result=(rollResult==5||rollResult==6);
		if (result&&isHighbet){
			return true;
		}
		if (!result&&!isHighbet){
			return true;
		}
		return false;
	}

	@Override
	public double winAmount() {
		return this.amount*3;
	}

}
