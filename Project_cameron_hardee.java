import java.util.Scanner;
public class Project_cameron_hardee {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Policy policy1 = new Policy();

        //get policy number for object
        System.out.print("Please enter the policy number: ");
        policy1.setPolicyNumber(input.nextInt());

        input.nextLine(); //clear keyboard buffer

        //get provider name for object
        System.out.print("\nPlease enter the Provider Name: ");
        policy1.setProviderName(input.nextLine());

        //get first name of customer for object
        System.out.print("\nPlease enter the Policyholder's First Name: ");
        policy1.setFirstName(input.nextLine());

        //get last name of customer for object
        System.out.print("\nPlease enter the Policyholder's First Name: ");
        policy1.setLastName(input.nextLine());


        //get age of policy holder for object
        System.out.print("\nPlease enter the Policyholder's age: ");
        policy1.setAge(input.nextInt());

        input.nextLine(); //clear keyboard input

        //get smoking status for object
        System.out.print("\nPlease enter the Policyholder's smoking status (smoker/non-smoker): "); //validate input if time permits
        policy1.setSmokingStatus(input.nextLine());

        System.out.print("\nPlease enter the policyholder's height (in inches): ");
        policy1.setHeight(input.nextDouble());

        System.out.print("\nPlease enter the policyholder's weight (in pounds): ");
        policy1.setWeight(input.nextDouble());

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
    }   

}
