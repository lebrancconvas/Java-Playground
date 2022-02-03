import java.util.*;
import java.io.*;



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

	private String[] skillset = {"Cure", "Revive", "Buff", "Dia", "Debuff"};

	public void useSkill(String skill)
	{
		if(Arrays.asList(skillset).contains(skill))
		{
			if(mp > 0)
			{
				System.out.printf("%s uses %s\n", name, skill);
				mp--;
			}
			else
			{
				System.out.printf("%s doesn't have enough MP.\n", name);
			}
		}
		else
		{
			System.out.printf("%s doesn't have the capability to use %s.\n", name, skill);
		}
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

	private String[] skillset = {};

	public BlueMage(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}

	public void absorbMagic(String enemyMagic)
	{
		
	}

	public void useSkill(String skill)
	{
		if(Arrays.asList(skillset).contains(skill))
		{
			if(mp > 0)
			{
				System.out.printf("%s uses %s\n", name, skill);
			}
			else
			{
				System.out.printf("%s doesn't have enough MP.\n", name);
			}
		}
		else
		{
			System.out.printf("%s doesn't have the capability to use %s\n", name, skill);
		}
	}
	
}

class Summoner extends Mage
{

	private String[] beastlist = {"Ramuh", "Shiva", "Omega Weapon", "Knight of Round", "Bahamut", "Yojimbo"};

	public Summoner(String Name, int Level, int HP, int ATK, int DEF, int MP, int EXP) 
	{
		super(Name, Level, HP, ATK, DEF, MP, EXP);
	}

	public void beastSummon(String beast)
	{
		if(Arrays.asList(beastlist).contains(beast))
		{
			if(mp > 0)
			{
				System.out.printf("%s summons %s\n", name, beast);
				mp -= 2;
			}
			else
			{
				System.out.printf("%s doesn't have enough MP.\n", name);
			}
		}
		else
		{
			System.out.printf("%s doesn't have the capability to summon %s\n", name, beast);
		}
	}
	
}

public class FFMage 
{
	public static void main(String[] args)
	{
		WhiteMage prisma = new WhiteMage("Prisma", 5, 100, 100, 200, 2, 200);
		prisma.useSkill("Cure");
		prisma.useSkill("Curaga");
		prisma.useSkill("Dia");
		prisma.useSkill("Buff");
		prisma.useSkill("Thunder");

		Summoner yuna = new Summoner("Yuna", 10, 300, 300, 200, 10, 200);
		yuna.beastSummon("Ramuh");
		yuna.beastSummon("Ifrit");

		BlueMage sith = new BlueMage("Sith", 10, 500, 250, 450, 20, 300);
		
	}
}
