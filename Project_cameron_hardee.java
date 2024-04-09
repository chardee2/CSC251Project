import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Project_cameron_hardee {
    
    public static void main(String[] args) throws IOException {
        //variables & arrays
        int policyNum;
        String providerName;
        String firstName;
        String lastName; 
        int age; //customer's age
        String smokingStatus; //customer's smoking status (smoking/non-smoking)
        int height; //customer's height in inches
        int weight; //customer's weight in inches
        int totalSmokers = 0;
        int totalNonSmokers = 0;

        
        //objects
        Scanner input = new Scanner(System.in);
        File policyInfoFile = new File("PolicyInformation.txt");  //creates file object for our policy information file
        Scanner inputFile = new Scanner(policyInfoFile); //create an object from scanner than can read the policy information file
        var policies = new ArrayList<Policy>(); //create an array list container for Policy objects
 
        //validate if the file specified exists
        if (!policyInfoFile.exists())
        {
            System.out.println("FILE ERROR: PolicyInformation.txt doesn't exist.");
            System.exit(0);
        }

        //While loop to read the text file lines and set local variables equal to them. While loop then creates an object and stores it in the ArrayList container for each object
        while(inputFile.hasNext())
        {
            policyNum = inputFile.nextInt(); 
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextInt();
            weight = inputFile.nextInt();
            
            //nested if statement is used in conjunction with an incrementer to count the amount of smokers and non smokers
            if (smokingStatus.equalsIgnoreCase("smoker"))
            {
                totalSmokers += 1;
            }
            else
                totalNonSmokers += 1;

            policies.add(new Policy(policyNum, providerName, age, firstName, lastName, height, weight, smokingStatus)); //adds an object to the arraylist container
            
            if (inputFile.hasNext())
                inputFile.nextLine(); //clear new line
            if (inputFile.hasNext())
                inputFile.nextLine(); //skip blank line

        }

       
        /*
        //display info
        System.out.print("\nPolicy number: " + policy1.getPolicyNumber());
        System.out.print("\nProvider Name: " + policy1.getProviderName());
        System.out.print("\nPolicyholder's First Name: " + policy1.getFirstName());
        System.out.print("\nPolicyholder's Last Name: " + policy1.getLastName());
        System.out.print("\nPolicyholder's age: " + policy1.getAge());
        System.out.print("\nPolicyholder's smoking status: " + policy1.getSmokingStatus());
        System.out.printf("\nPolicyholder's height: %.1f", policy1.getHeight());
        System.out.printf("\nPolicyholder's weight: %.1f", policy1.getWeight());
        System.out.printf("\nPolicyholder's BMI: %.2f", policy1.calcBMI());
        System.out.printf("\nPolicy Price: $%.2f", policy1.calcPolicyPrice());
        */
    }   

}
