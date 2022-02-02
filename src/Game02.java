// Final Boss Simulation by Singleton Design Pattern. 

class Garland
{
	private static Garland instance;
	private Garland()
	{
		instance = new Garland();
	}

	public static Garland getInstance()
	{
		return instance;
	}
}

public class Game02 
{
	public static void main(String[] args)
	{
		Garland boss01 = Garland.getInstance();
		Garland boss02 = Garland.getInstance();
		// Garland boss03 = new Garland();
		// Garland boss05 = new Garland();

		System.out.println(boss01 == boss02);
	}
}
