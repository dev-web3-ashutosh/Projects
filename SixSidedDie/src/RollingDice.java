import java.util.Random;

public class RollingDice {
	
	Random rand = new Random();
	
	public int rollDice() {
		return rand.nextInt(6) + 1;
	}

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int x = rand.nextInt(6) + 1;
		
		System.out.println("You rolled a " + x);

	}

}
