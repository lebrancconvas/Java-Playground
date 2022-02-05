import java.util.*;
import java.io.*;
// import static org.junit.Assert.assertEquals;
// import org.junit.Test;



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

	protected static String[] skillset = {};

	// public void setSkillSet(String[] Skillset)
	// {
	// 	skillset = Skillset;
	// }

	// public String[] getSkillSet()
	// {
	// 	return skillset;
	// }

	public void useSkill(String skill)
	{
		if(Arrays.asList(skillset).contains(skill))
		{
			if(mp > 0)
			{
				System.out.printf("%s uses %s.\n", name, skill);
			}
			else
			{
				System.out.printf("%s doesn't have enough MP.\n");
			}
		}
		else
		{
			System.out.printf("%s doesn't have the capability to use %s.\n", name, skill);
		}
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

	protected String[] skillset = {"Cure", "Revive", "Buff", "Dia", "Debuff"};
	
}

class RedMage extends Mage
{

	public RedMage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}

	protected String[] skillset = {};
	
}

class BlueMage extends Mage
{

	
	public BlueMage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}
	
	protected String[] skillset = {};

	public void absorbMagic(String enemyMagic)
	{
		
	}
	
}

class Summoner extends Mage
{
	public Summoner(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}
	
	protected String[] skillset = {"Ramuh", "Shiva", "Omega Weapon", "Knight of Round", "Bahamut", "Yojimbo"};
}

public class FFMage 
{
	public static void main(String[] args)
	{
		Mage prisma = new WhiteMage("Prisma", 5, 100, 100, 200, 2, 200);
		prisma.useSkill("Cure"); 
		prisma.useSkill("Curaga");
		prisma.useSkill("Dia");
		prisma.useSkill("Buff");
		prisma.useSkill("Thunder");

		Mage yuna = new Summoner("Yuna", 10, 300, 300, 200, 10, 200);
		yuna.useSkill("Ramuh");
		yuna.useSkill("Ifrit");

		Mage sith = new BlueMage("Sith", 10, 500, 250, 450, 20, 300);
		
	}

	// @Test
	// public void FFMageTest()
	// {

	// }
}
