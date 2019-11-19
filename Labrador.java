/**
 * 
 * @author Zhichen Ren
 *
 *the subclass which extends Dog class
 */
public class Labrador extends Dog{

	final private double THE_CEILING_OF_WEIGHT_OF_Labrador=40.0;
	/**
	 * the constructor of labrador
	 * @param name
	 * @param weight
	 */
	public Labrador(String name, double weight) {
		super(name, weight);
	
	}
	/**
	 * to get the description of labrador
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
		if(getWeight()>THE_CEILING_OF_WEIGHT_OF_Labrador) {
			check= true;
		}
		return check;
	}

}
