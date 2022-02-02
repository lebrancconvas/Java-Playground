import java.util.*;
// import java.io.*;

class Spellcaster
{
	public int id;
	public String name;
	public String[] skillset = {};
	public int mp;
	public String skill;

	public void useSkill(String skill){};

	public boolean hasSkill = Arrays.asList(skillset).contains(skill);
	
}

class Trident extends Spellcaster
{
	// @override
	public String[] skillset = {"Fire", "Ice", "Thunder"};

	// @Override
	public void useSkill(String skill)
	{
		if(hasSkill)
		{
			System.out.printf("%s use %s\n", name, skill);
			mp--;
		}
		else
		{
			System.out.printf("%s doesn't have capability to use %s\n", name, skill);
		}
	}
}

class Healer extends Spellcaster
{
	public String[] skillset = {"Heal", "Revive", "Buff"};

	public void useSkill(String skill)
	{
		if(hasSkill)
		{
			System.out.printf("%s use %s.", name, skill);
			mp--;
		}
		else
		{
			System.out.printf("%s doesn't have capability to use %s", name, skill);
		}
	}
}

public class Game01
{
	public static void main(String[] args)
	{
		Trident caster = new Trident();
		caster.id = 2;
		caster.name = "Horu";
		caster.mp = 20;

		caster.useSkill("Fire");
	}
}