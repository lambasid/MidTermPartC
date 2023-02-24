/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestUserprofile {
    
    public static void main(String[] args){
        
        UserProfile newProfile = UserProfile();
        Scanner input = new Scanner(System.in);
       
        
        String Id = getInputs("Enter UserId: ",input );
        newProfile.setUserID(Id);
        
        System.out.println("Available genres are: Comedy, Drama, "
                + "Action, Mystery");
        String userGenre = getInputs("Enter your favourite genre: ",input);
        newProfile.setGenre(userGenre);
        
        System.out.println("Your User Profile has been created successfully.");
        
      
    }//end of main
    
    public static String getInputs(String prompt, Scanner sc){
        System.out.println(prompt);
        return sc.nextLine();
    }
    
}
