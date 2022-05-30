/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.assignment;

import java.util.Scanner;

/**
 *
 * @author ST10218375_MATHALISE_VUSANI 
 */
public class Assignment {

    public static void main(String[] args) 
    {
       Scanner Input = new Scanner (System.in);
        String FirstName;
        String Surname;       
        String UserName;        
        String Password;
        
         Login ll = new Login();
         System.out.print(ll.RegisterUser());
         
        boolean LoginStatus = false;
        boolean UsernameCorrect;
        UsernameCorrect = false;
        boolean PasswordCorrect;
        PasswordCorrect = false;

        System.out.println("Enter Username : "); 
        UserName =Input.next();
        System.out.println("Enter Password : "); 
        Password  =Input.next();
        
        LoginStatus = ll.LoginUser();
        UsernameCorrect = ll.checkUsername(UserName);
        PasswordCorrect = ll.checkpasswordcomplexity(Password);
        
        if(PasswordCorrect ==true && UsernameCorrect ==true)
        System.out.print(ll.ReturnLoginStatus());
       
        int numberOfTasks;
        
        System.out.println("welcome to EasyKanban");
        System.out.println("/n/nHow many tasks do you wish to enter : ");
        numberOfTasks = Input.nextInt();
        if(numberOfTasks > 0)
        {
            Task task1 = new Task(numberOfTasks);
            
            System.out.println("/n/nThank you , you may now start capuring the tasks, /n should you wish to Quit just press 3..");
            for(int a = 0; a < numberOfTasks; a++)
            {
                System.out.println("/n/n1).Add tasks");
                System.out.println("/n2).Show report");
                System.out.println("/n3).Quit/n/nPick and option : ");
                
                int option = Input.nextInt();
                if(option == 1)
                {
                   task1.number_of_Task = a;
                    System.out.print("Enter this task's name : ");
                    task1.name_of_Task[a] = Input.next();
                    System.out.print("Enter this task's description : ");
                    task1.description_of_Task[a] = Input.next();
                    while(!task1.checkTaskDescription(task1.description_of_Task[a]))
                    {
                        System.out.print("Description shouldn't be more than 50 characters, Please try again : ");
                        task1.description_of_Task[a] = Input.next();                    
                    }                 
                    
                    System.out.print("Enter this task's developer details : ");
                    task1.developer_Details[a] = Input.next();
                    System.out.print("Enter this task's duration (in hours) : ");
                    task1.duration_of_Task[a] = Input.nextInt();
                    System.out.print("Enter this task status, Choose one from the below \n");
                    System.out.print("\n1. To Do");
                    System.out.print("\n2. Done");
                    System.out.print("\n3. Doing");
                    System.out.print("\nenter number before the option of your choice : ");
                    int choice = Input.nextInt();
                    while(choice < 1 || choice > 3)
                    {
                        System.out.print("\nRange is between 1 and 3, please try again : ");
                        choice = Input.nextInt();                    
                    }
                    if(choice == 1)
                        task1.task_Status[a] = "To Do";
                    if(choice == 2)
                        task1.task_Status[a] = "Done";
                    if(choice == 3)
                        task1.task_Status[a] = "Doing";
                    
                    task1.createTaskID(a);                        
                }
                if(option == 2)
                {
                    task1.printTaskDetails(a);
                    a--;
                }
                if(option == 3)
                {
                    a = numberOfTasks;
                }              
                    
            }    
        }    
    }  
}
  
    
