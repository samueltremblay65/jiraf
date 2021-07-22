public class Jiraf
{
	int height;
	int weight;
	
	public Jiraf(int height, int weight)
	{
		this.height = height;
		this.weight = weight;
	}
	
	public void moo()
	{
		System.out.println("MOOOOOOOOOOOO");
	}
	
	public void print()
	{
		System.out.println("Jiraf with weight " + weight + " and height of " + height);
	}
}