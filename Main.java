
public class Main
{
	public static void main(String[] args) {
		
		Gamble Gambling = new Gamble();
		Coin Coin = new Coin();

		Gambling.addCoin(Coin.addCoin(25));
		Gambling.options();
	}
}
