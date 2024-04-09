import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Project_cameron_hardee {
    
    public static void main(String[] args) throws IOException {
        //variables & arrays
        int policyNum; //insurance policy number
        String providerName; //name of insurance provider
        String firstName; //customer's first name
        String lastName; //customer's last name
        int age; //customer's age
        String smokingStatus; //customer's smoking status (smoking/non-smoking)
        int height; //customer's height in inches
        int weight; //customer's weight in inches
        int totalSmokers = 0;
        int totalNonSmokers = 0;

        
        //objects
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
            inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            
            smokingStatus = inputFile.nextLine();
            inputFile.nextLine();
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

        inputFile.close(); //close file
        
       for (int i = 0; i < policies.size(); i++ ) {
        System.out.print("\nPolicy number: " + policies.get(i).getPolicyNumber());
        System.out.print("\nProvider Name: " + policies.get(i).getProviderName());
        System.out.print("\nPolicyholder's First Name: " + policies.get(i).getFirstName());
        System.out.print("\nPolicyholder's Last Name: " + policies.get(i).getLastName());
        System.out.print("\nPolicyholder's age: " + policies.get(i).getAge());
        System.out.print("\nPolicyholder's smoking status: " + policies.get(i).getSmokingStatus());
        System.out.printf("\nPolicyholder's height: %.1f", policies.get(i).getHeight());
        System.out.printf("\nPolicyholder's weight: %.1f", policies.get(i).getWeight());
        System.out.printf("\nPolicyholder's BMI: %.2f", policies.get(i).calcBMI());
        System.out.printf("\nPolicy Price: $%.2f\n", policies.get(i).calcPolicyPrice());
       
       }
     
       System.out.println("\nThe number of policies with a smoker is: " + totalSmokers);
       System.out.println("\nThe number of policies with a non-smoker is: " + totalNonSmokers);
    }   

}
