package com.dnb.Devconnector;

import java.util.Scanner;
import java.util.UUID;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dnb.Devconnector.Service.ProfileService;
import com.dnb.Devconnector.Service.UserService;
import com.dnb.Devconnector.dto.RegisterUse;
import com.dnb.Devconnector.dto.UserProfile;

@SpringBootApplication
public class DevConnectorApplication {

	public static void main(String[] args) {
		//ApplicationContext applicationContext =
		 SpringApplication.run(DevConnectorApplication.class, args);
		//UserService userService = applicationContext.getBean(UserService.class);
		//ProfileService profileService = applicationContext.getBean(ProfileService.class);
//		
	//RegisterUse registerUse1=null;
	//UserProfile userProfile=null;
//		
	//registerUse1 = new RegisterUse("Sravya" , "sravya123@gmail.com" , "abcd");
	//userProfile = new UserProfile(UUID.randomUUID(),"fulltime" , "dnb","www.dnb.com" , "hyderabad" , "java,css,html" , "sravya_nadipalli" , "graduate" , true , "sravyatwitter" , "sravyafacebook" , "sravyayoutube" ," sravya_linkedin" ,"sravya_instagram");
//		
//	userService.createUser(registerUse1);
//	profileService.createProfile(userProfile);
		
		/*Scanner sc = new Scanner(System.in);
		while(true) {

			System.out.println("Enter any option from below..\n1.create\n2.getUser\n3.deleteUser\n4.getAllUsers\n5.Exit\n");

			int condition = sc.nextInt();
			switch (condition) {
			case 1:
				userService.createUser(registerUse);
				break;
			case 2:
				userService.getUserByEmail("akhla@gmail.com");
				break;
			case 3:
				userService.deleteUser("akhla@gmail.com");
				break;
			case 4:
				userService.getAllUsers();
				break;
			case 5:
				System.out.println("Thanks, you got exit...");
				System.exit(0);
			default:
				throw new IllegalArgumentException("Unexpected value: " + condition);

			}
*/
		
           //  userService.getAllUsers();
 



	}

	}
