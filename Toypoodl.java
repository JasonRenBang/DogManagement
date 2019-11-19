/**
 * 
 * @author Zhichen Ren
 *
 *the subclass which extends Dog class
 */
public class Toypoodl extends Dog{
			
			final private double THE_CEILING_OF_WEIGHT_OF_TOYPOODL=10.0;
			/**
			 * the constructor of toypoodl
			 * @param name
			 * @param weight
			 */
			public Toypoodl(String name, double weight) {
				super(name, weight);
				
			}
			/**
			 * to get the description of toypoodl
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
				if(getWeight()>THE_CEILING_OF_WEIGHT_OF_TOYPOODL) {
					check= true;
				}
				return check;
			}
}
