package things;
public class Hat extends RoomObject implements Attackable, Eatable, Sitable, ThrowableItem{
	public Hat(){
		super("HAT");
	}
	public void attack(Item itm){
		if(itm==null){
			System.out.println("You flatten the hat with a strike. Oh no! You ruined it");
		} else if(itm instanceof Weaponizable){
			System.out.println("You damage the hat with a "+itm);
			((Weaponizable)itm).weaponUse();
		} else {
			System.out.println(itm+" just bounces off the hat");
		}
	}
	public void eat(Item itm){
		if(itm==null){
			System.out.println("You can barely swallow it");
		} else if(itm instanceof Utensil){
			System.out.println("The "+itm+" doesn't make it taste any better");
			((Utensil)itm).utensilUse();
		} else {
			System.out.println(itm+" doesn't help you eat it");
		}
	}
	public void sit(Item itm){
		if(itm==null){
			System.out.println("The hat doesn't provide much cushion from the ground");
		} else if(itm instanceof SitType){
			System.out.println("You sit on the "+itm+" with the hat on your lap");
			((SitType)itm).forSitting();
		} else {
			System.out.println(itm+" is not helpful for sitting");
		}
	}
	public void throwItem(Item itm){
		if(itm==null){
			System.out.println("You throw it on the ground! You're the boss");
		} else if(itm instanceof ThrowType){
			System.out.println("You fling the hat with a "+itm);
			((ThrowType)itm).forThrowing();
		} else {
			System.out.println(itm+" flops the hat onto the ground");
		}
	}
}//end class


