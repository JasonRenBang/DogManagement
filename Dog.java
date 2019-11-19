/**
 * 
 * @author Zhichen Ren
 * Date: 10/6/2018
 * 
 *  To record the name, length, height, name of the dogs and to check if the dog 
 *  is overweight. This class allows users to better understand their dogs.
 *  
 *	the superclass
 */
public class Dog {
		private double weight;
		private String name;

		
		/**
		 * the constructor of Dog
		 * @param name	the dog's name
		 * @param weight the dog's weight
		 */
		public Dog(String name, double weight ) {
			this.name = name;
			this.weight = weight;
		}
		/**
		 * to get the description of the dog
		 */
		public void description() {
			System.out.println("the name is: "+ name);
			System.out.println("the weight is: "+weight);
		}

		/**
		 * to get the dog's name
		 * @return name    the dog name
		 */
		public String getName() {
			return name;
		}
		/**
		 * the get the dog's weight
		 * @return weight  the dog's weight 
		 */
		public double getWeight() {
			return weight;
		}
		
		/**
		 * to set the dog's name
		 * @param name that user wants to name his dog
		 */
		public void setName(String name) {
			this.name= name;
		}
		/**
		 * to set the dog's weight
		 * @param weight the dog's weight which you want to set
		 */
		public void setWeight(double weight)
		{
			this.weight  = weight;
		}
}
