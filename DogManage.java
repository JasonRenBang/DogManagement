import java.util.LinkedList;
/**
 * 
 * 
 * @author Zhichen Ren
 * 
 * DogManage aggregate Toypoodl, Labrador and Husky
 * DogManage dependents on address
 *
 */
public class DogManage {
				private LinkedList<Toypoodl> tl= new LinkedList<Toypoodl>();
				private LinkedList<Husky> hy= new LinkedList<Husky>();
				private LinkedList<Labrador> lr=new LinkedList<Labrador>();
				private Address ad;
				
				
				public DogManage() {
					tl.addLast(new Toypoodl("aa", 3.26));
					hy.addLast(new Husky("bb", 15.8 ));
					lr.addLast(new Labrador("cc",26.5));
					ad = new Address("107 Founders Drive", "Conway", "SC","29526");
				}
				
				public void printMenu() {
					System.out.println("This is Toypoodl list: ");
					for (int i = 0;i<tl.size();i++) {
						System.out.print((i+1)+". ");
						tl.get(i).description();
					}
					
					System.out.println();
					
					System.out.println("This is Husky list: ");
					for (int i = 0;i<hy.size();i++) {
						System.out.print((i+1)+". ");
						hy.get(i).description();
					}
					System.out.println();
					System.out.println("This is Labrador list: ");
					for (int i = 0;i<lr.size();i++) {
						System.out.print((i+1)+". ");
						lr.get(i).description();
					}
					System.out.println();
					ad.printAddress();
				}
				
				public void addToypoodl(String name, double weight) {
					tl.add(new Toypoodl(name, weight));
				}
				public void addHusky(String name, double weight) {
					hy.add(new Husky(name, weight));
				}
				public void addLabrador(String name, double weight) {
					lr.add(new Labrador(name, weight));
				}
				
				
				
				
				public LinkedList<Toypoodl> getToypoodl(){
					return tl;
					
				}
				public void printToypoodl() {
					for (int i = 0;i<tl.size();i++) {
						tl.get(i).description();
					}
				}
				public LinkedList<Husky> getHusky(){
					return hy;
					
				}
				public void printHusky() {
					for (int i = 0;i<hy.size();i++) {
						hy.get(i).description();
					}
				}
				
				public LinkedList<Labrador> getLabrador(){
					return lr;
					
				}
				public void printLabrador() {
					for (int i = 0;i<lr.size();i++) {
						lr.get(i).description();
					}
				}
				
				public Address getAddress() {
					return ad;
				}
				
				
				
				
				
				
				
				
				
}
