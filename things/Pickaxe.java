package things;
public class Pickaxe extends Item implements Utensil, Weaponizable, SitType, ThrowType{
	public Pickaxe(){
		super("PICKAXE");
	}
	
	public void weaponUse(){
		System.out.println("You pick at it with the pickaxe. You don't gain any blocks");
	}
	public void forSitting(){
		System.out.println("You sit on the pickaxe. It feels like it might give from under you");
	}
	public void utensilUse(){
		System.out.println("This might make things easier. Maybe?");
	}
	public void forThrowing(){
		System.out.println("It won't launch 90kg more than 300 meters, but it'll help");
	}

}//end class