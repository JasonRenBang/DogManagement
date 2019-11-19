/**
 * 
 * @author Zhichen Ren
 * 
 * the subclass which extends Dog class
 *
 */
public class Husky extends Dog{

	final private double THE_CEILING_OF_WEIGHT_OF_Husky=30.0;
	
	/**
	 * the constructor of husky
	 * @param name
	 * @param weight
	 */
	public Husky(String name, double weight) {
		super(name, weight);

	}
	/**
	 * to get the description of husky
	 */
	public void description() {
		super.description();

		
		
	}
	/**
	 * to check if the dog is overweight
	 * @return check
	 */
	public boolean checkOverweight() {
		boolean check=false;
		if(getWeight()>THE_CEILING_OF_WEIGHT_OF_Husky) {
			check= true;
		}
		return check;
	}

}
