import java.io.FileReader;
import java.util.Scanner;
import java.util.Properties;

public class Practica {
	
	static String usuario = "";
	static String mail = "";
	static String contra =  "";
	static String proof = "";
	
	void start() {

		boolean passwor = false;	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the manage of Amabro.");
		System.out.println("To create an user is necessary to introduce an e-mail, an user name and a password.");
		System.out.println("");
		System.out.println("Introduce an email:");
		mail = sc.nextLine();
		Scanner sd = new Scanner(System.in);
		System.out.println("Introduce an user name:");
		usuario = sd.nextLine();
		Scanner se = new Scanner(System.in);
		
		while(!passwor) {
		
		System.out.println("Introduce a password: ");
		contra = se.nextLine();
		Scanner st = new Scanner(System.in);
		System.out.println("Introduce the password again: ");
		proof = st.nextLine();
		
		if(contra.equals(proof)) {
			passwor = true;
			User Usuario = new User(usuario, mail, contra);
			break;
		}
		
		}
		
	}
	
	void menu() {
		
		int number_menu = 0;
		while(number_menu != 7) {
			
			Scanner nm = new Scanner(System.in);
			System.out.println("1 .Account settings. ");
			System.out.println("2. Account info.");
			System.out.println("3.Open categories file.");
			System.out.println("Introduce the number 7 to go back . ");
			
			System.out.println("Introduce the number of the option. ");
			number_menu = nm.nextInt();
			
		switch(number_menu) {
		
		case 1:
		
		{
			
			int settings = 0;
			Scanner nj = new Scanner(System.in);
			User user1 = new User(usuario, mail, contra);
			
			System.out.println("Account settings ");
			System.out.println("1. Change user name.");
			System.out.println("2. Change email.");
			System.out.println("3. Change password.");
			System.out.println("Introduce any other key to go back. ");
			settings = nj.nextInt();
			
			switch(settings) {
			
			case 1 :
				
				Scanner sf = new Scanner(System.in);
				
				String n_user = "";
				System.out.println("Introcude the new user name: ");
				n_user = sf.nextLine();
				n_user = usuario;
				user1.setName(n_user);
				
				break;
				
			case 2 :
				
				Scanner sh = new Scanner(System.in);
				String ma_il = "";
				System.out.println("Introduce the new email");
				ma_il = sh.nextLine();
				ma_il = mail;
				user1.setEmail(ma_il);
				
				break;
				
			case 3 : 
			
				Scanner sj = new Scanner(System.in);
				String contri = "";
				System.out.println("Introduce the new password");
				contri = sj.nextLine();
				contri = contra;
				user1.setPassword(contri);
				
				
				break;
				
				
			default : 	
				
				System.out.println("Exit");
				
				break;
			}
		}
		
		break;
		
		case 2: 
			
		{
			
			 User user_2 = new User(usuario,mail,contra);
			
			
			System.out.println("Welcome to the Account info"); 
			System.out.println(""); 
			System.out.println("User name of the account. ");
			System.out.println("");
			System.out.println(user_2.getName());
			System.out.println("");
			System.out.println("Email of the account. ");
			System.out.println("");
			System.out.println(user_2.getEmail());
			System.out.println("");
			
		}
				
			break;
		
		case 3:
			
			
			break;
			
			
		default:
			
			System.out.println("Exit: ");
			
			break;
		
			}

		}
		
	}

	public static void main(String[] args) {
		
		try(FileReader reader =  new FileReader("config1//config")) {
	        Properties properties = new Properties();
	        properties.load(reader);
	       
	        String email = properties.getProperty("email");
	        String username = properties.getProperty("username");
	        String password = properties.getProperty("password");
	        
	        /*System.out.println(email);
	        System.out.println(username);
	        System.out.println(password);
	        */
	        
	       }catch (Exception e) {;
	       
	       e.printStackTrace();
	       
	       }
		
		
		Product producto = new Product(0, "Jony", null, null, null);
		System.out.println(producto.getNameProduct());
		
		producto.setNameProduct("Hola");
		System.out.println(producto.getNameProduct());
		
		Practica pract = new Practica();
		pract.start();
		System.out.println("");
		pract.menu();
		
		//System.out.println(producto.dolar(15));
		
		
	}

}
