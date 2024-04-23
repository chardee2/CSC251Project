import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class Project_cameron_hardee {
    
    public static void main(String[] args) throws IOException {
        //variables & arrays
        String policyNum; //insurance policy number
        String providerName; //name of insurance provider
        String firstName; //customer's first name
        String lastName; //customer's last name
        int age; //customer's age
        String smokingStatus; //customer's smoking status (smoking/non-smoking)
        double height; //customer's height in inches
        double weight; //customer's weight in inches
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
            policyNum = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();

            
            //nested if statement is used in conjunction with an incrementer to count the amount of smokers and non smokers
            if (smokingStatus.equalsIgnoreCase("smoker"))
            {
                totalSmokers += 1;
            }
            else
                totalNonSmokers += 1;

            //create a policy holder object to use in policy parameter aggregation
            PolicyHolder policyHolder = new PolicyHolder(firstName, lastName, age, height, weight, smokingStatus);

            //create a policy object that is aggregated with out policy holder object
            Policy policy = new Policy(policyNum, providerName, policyHolder);
            
            policies.add(policy); //adds an object to the arraylist container
            
            if (inputFile.hasNext())
                inputFile.nextLine(); //clear new line
            if (inputFile.hasNext())
                inputFile.nextLine(); //skip blank line

        }

        inputFile.close(); //close file
        
       for (int i = 0; i < policies.size(); i++ ) {

        System.out.println(policies.get(i)); //implicitly call toString methods through arrayList


       }
     
       System.out.println("\nThe number of policies with a smoker is: " + totalSmokers);
       System.out.println("\nThe number of policies with a non-smoker is: " + totalNonSmokers);
    }   

}

