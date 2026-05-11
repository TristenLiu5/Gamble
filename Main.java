
public class Main
{
	public static int coins;
	public static void main(String[] args) {
		
		Gamble Gambling = new Gamble();

		coins = Gambling.addCoin(10);
		Gambling.options();
	}
}
