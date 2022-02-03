class Mage
{
	String name;
	int level,hp, atk, def, mp, exp;

	public Mage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP)
	{
		name = Name;
		level = Level;
		hp = HP;
		atk = ATK;
		def = DEF;
		mp = MP;
		exp = EXP;
	}
}

class BlackMage extends Mage
{
	public BlackMage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}
	
}

class WhiteMage extends Mage
{

	public WhiteMage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}
	
}

class RedMage extends Mage
{

	public RedMage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}
	
}

class BlueMage extends Mage
{

	public BlueMage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}
	
}

class Summoner extends Mage
{

	public Summoner(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}
	
}

public class FFMage 
{
	public static void main(String[] args)
	{
		Mage vivi = new Mage("Vivi", 5, 300, 200, 100, 35, 12);
		System.out.println(vivi.level);
	}
}
