import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class DogTest {
/**
 * Toypoodl, Labrador and Husky extends Dog
 * DogManage aggregate Toypoodl, Labrador and Husky
 * DogManage dependents on address
 * 
 * 
 * while(!quitSystem = Q)
 * 		if (choose = A  )
 * 				print menu
 * 				while (!quit= Q)
 * 					you can set toypoodl labrador husky and address
 * 					if (dogchoose= T)
 * 						set toypoodl
 * 					else if( dogchoose = L)
 * 						set Labrador
 * 					else if(dogchoose = H)
 * 						set husky
 * 					else if (dogchoose = A)
 * 						set address
 * 					else
 * 						print that you enter wrong letter
 * 					print menu 
 * 					ask user if quit
 * 		else if(choose = R)
 * 				print menu
 * 				while(!quit = Q)
 * 				you can change the name of your dog
 * 				if (dogchoose= T)
 * 						change toypoodl
 * 					else if( dogchoose = L)
 * 						change Labrador
 * 					else if(dogchoose = H)
 * 						change husky
 *
 * 					else
 * 						print that you enter wrong letter
 * 					print menu 
 * 					ask user if quit
 * 		else
 * 				print that you enter wrong letter
 * 		ask user if want to leave the system
 * done
 * print that thanks for using program
 * 
 * 
 * 
 * @param args
 * @throws FileNotFoundException 
 */
	public static void main(String[] args) throws FileNotFoundException {
			PrintWriter out  = new PrintWriter("DoySystem.txt");
			
			Scanner in= new Scanner (System.in);
			
			String name;
			double weight;
			
			String choose;
			String quit;
			String dogChoice;
			String quitSystem;
			
			int index;
			
			String street;
			String postcode;
			String region;
			String district;
			
			
			DogManage am = new DogManage();
			
			System.out.println("Welcome to my dog feed system£¡£¡£¡");
			quitSystem = "C";
			while(!quitSystem.equals("Q")) {
					System.out.print("A)dministrator,  R)egular user :  ");
					out.println("Administrator: ");
					choose = in.next();
					
					if(choose.equals("A")) {
						System.out.println("The menu is :");
						am.printMenu();
						
						System.out.println("You can set the information,and you need enter \"C\" to continue or enter \'Q\' to leave.");
						System.out.print("Your choice: ");
						quit = in.next();
						while (!quit.equals("Q")) {
							System.out.println("Set T)oypoodl, H)usky, L)abrador, A)ddress your choice: ");
							dogChoice = in.next();
							if(dogChoice.equals("T")) {
								System.out.println("You can add Toypoodl. Please enter its name and weight.");
								System.out.print("Name: ");
								name = in.next();
								System.out.print("Weight: ");
								weight = in.nextDouble();
								am.addToypoodl(name, weight);
								if(am.getToypoodl().get(am.getToypoodl().size()-1).checkOverweight()) {
									System.out.println("Sorry we can not feed your "+ name+" because it is overweight.");
									am.getToypoodl().remove(am.getToypoodl().size()-1);
								}else {
									System.out.println("Success, we will take care of your dog.");
								}
								System.out.println("Now we have : ");
								am.printToypoodl();
										
							}else if (dogChoice.equals("H")) {
								System.out.println("You can add Husky. Please enter its name and weight.");
								System.out.print("Name: ");
								name = in.next();
								System.out.print("Weight: ");
								weight = in.nextDouble();
								am.addHusky(name, weight);
								if(am.getHusky().get(am.getHusky().size()-1).checkOverweight()) {
									System.out.println("Sorry we can not feed your "+ name+" because it is overweight.");
									am.getHusky().remove(am.getHusky().size()-1);
								}else {
									System.out.println("Success, we will take care of your dog.");
								}
								System.out.println("Now we have : ");
								am.printHusky();
							}else if(dogChoice.equals("L")) {
								System.out.println("You can add Labrador. Please enter its name and weight.");
								System.out.print("Name: ");
								name = in.next();
								System.out.print("Weight: ");
								weight = in.nextDouble();
								am.addLabrador(name, weight);
								if(am.getLabrador().get(am.getLabrador().size()-1).checkOverweight()) {
									System.out.println("Sorry we can not feed your "+ name+" because it is overweight.");
									am.getLabrador().remove(am.getLabrador().size()-1);
								}else {
									System.out.println("Success, we will take care of your dog.");
								}
								System.out.println("Now we have : ");
								am.printLabrador();
							}
							else if(dogChoice.equals("A")) {
								System.out.println("Please enter your new address.");
								System.out.print("street: ");
								street = in.next();
								am.getAddress().setStreet(street);
								System.out.print("region: ");
								region = in.next();
								am.getAddress().setRegion(region);
								System.out.print("district: ");
								district = in.next();
								am.getAddress().setDistrict(district);
								System.out.print("postcode: ");
								postcode = in.next();
								am.getAddress().setPostcode(postcode);
								System.out.println("Your new address is: ");
								am.getAddress().printAddress();
								
							}
							else {
								System.out.println("your did not enter a correct letter!");
							}
							System.out.println("You can set the information,and you need enter \"C\" to continue or enter \'Q\' to leave.");
							System.out.print("Your choice: ");
							quit = in.next();
							
						}
		
					}
					else if(choose.equals("R")) {
						 System.out.println("The menu is :");
						 am.printMenu();
						 System.out.println("Your can change the name and your dog");
						 System.out.println("You can change the information,and you need enter \"C\" to continue or enter \'Q\' to leave.");
						 System.out.print("Your choice: ");
						 quit = in.next();
						 while(!quit.equals("Q")) {
							 System.out.print("please choose T)oypoodl, H)usky, L)abrador");
							 dogChoice = in.next();
							 if(dogChoice.equals("T")) {
								 System.out.println("Please choose your dog,(enter the index)");
								 index =in.nextInt();
								 System.out.print("Please enter the name that you have changed: ");
								 name =in.next();
								 am.getToypoodl().get(index-1).setName(name);
								 am.printToypoodl();
								 
							 }
							 else if (dogChoice.equals("H")) {
								 System.out.println("Please choose your dog,(enter the index)");
								 index =in.nextInt();
								 System.out.print("Please enter the name that you have changed: ");
								 name =in.next();
								 am.getHusky().get(index-1).setName(name);
								 am.printHusky();
							 }
							 else if (dogChoice.equals("L")) {
								 System.out.println("Please choose your dog,(enter the index)");
								 index =in.nextInt();
								 System.out.print("Please enter the name that you have changed: ");
								 name =in.next();
								 am.getLabrador().get(index-1).setName(name);
								 am.printLabrador();
							 }
							 else {
								 System.out.println("your did not enter a correct letter!");
							 }
							 System.out.println("You can set the information,and you need enter \"C\" to continue or enter \'Q\' to leave.");
							 System.out.print("Your choice: ");
							 quit = in.next();
						 }
						 System.out.println("Now we have: ");
							am.printMenu();
					}
					
					else {
						System.out.println("You did not enter a correct letter!");
					}
					System.out.println("If you want to leave our system please enter \"Q\", or enter \"C\"");
					quitSystem =in.next();
			}
			out.println("The toypoodl menu: ");
			for(int i = 0;i<am.getToypoodl().size();i++) {
				out.print((i+1)+" The name: "+am.getToypoodl().get(i).getName());
				out.print("		The weight: "+am.getToypoodl().get(i).getWeight());
				out.println();
			}
			out.println("The husky menu: ");
			for(int i = 0;i<am.getHusky().size();i++) {
				out.print((i+1)+" The name: "+am.getHusky().get(i).getName());
				out.print("		The weight: "+am.getHusky().get(i).getWeight());
				out.println();
			}
			out.println("The labrador menu: ");
			for(int i = 0;i<am.getLabrador().size();i++) {
				out.print((i+1)+" The name: "+am.getLabrador().get(i).getName());
				out.print("		The weight: "+am.getLabrador().get(i).getWeight());
				out.println();
			}
			out.close();
			System.out.println("You will see a list with all dogs in a txt file.");
			System.out.println("Thanks for using my program");
	}

}
