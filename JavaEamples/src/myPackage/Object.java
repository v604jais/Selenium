package myPackage;

public class Object {

	int height;
	int weight;
	int physique;
	
	public void run ()
	{
		System.out.println("inside run");
	}
	public void play()
	{
		System.out.println("inside play");
	}
	
	public static void main(String[] args) 
	{
		
	 Object  boy=new Object();
	 boy.height=5;
	 boy.weight=62;
	 boy.physique=boy.height+boy.weight;
	 System.out.println("boy.height"+boy.height);
	 System.out.println("boy.weight"+boy.weight);
	 System.out.println(boy.physique);
	 boy.play();
	 boy.run();

	}

}
