class Board
{
	private int width;
	private int height;

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	Board(int Width, int Height)
	{
		width = Width;
		height = Height;
	}
}

class SpecialTileset
{
	private String name;
	private String description;

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}

	SpecialTileset(String Name, String Description)
	{
		name = Name;
		description = Description;
	}
}

class Dot
{
	private String color;
	private String status;

	public String getColor()
	{
		return color;
	}

	public String getStatus()
	{
		return status;
	}

	Dot(String Color, String Status)
	{
		color = Color;
		status = Status;
	}
}

public class Twodots 
{
	public static void main(String[] args)
	{
		Dot greendot = new Dot("Green", "Normal");
		Dot reddot = new Dot("Green", "Normal");
		System.out.println(greendot.getColor());
	}
}
