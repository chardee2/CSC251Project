public class Policy{
    
    
    //class fields
    private String policyNum;
    private String providerName;
    private PolicyHolder policyHolder;
    private static int numOfPolicies = 0;
    
   
    /**
     * This constructor initializes the policy number, insurance provider's name and 
     * @param pn policy number
     * @param providerN insuance provider name
     * @param policyHolder object of policy holder
     */
    public Policy(String pn, String providerN, PolicyHolder polHolder){
        
        policyNum = pn;
        providerName = providerN;
        policyHolder = new PolicyHolder(polHolder);
        numOfPolicies++;

    }
    //setter methods
    /**
     * method that sets the policy number
     * @param policyNumber policy number
     */
    public void setPolicyNumber(String policyNumber){
        policyNum = policyNumber;
    }

    /**
     * Method that sets the insurance provider's name
     * @param insuranceProviderName insurance provider name
     */
    public void setProviderName(String insuranceProviderName){
        providerName = insuranceProviderName;
    }

    //getter methods
    /**
     * Method that returns the policy number
     * @return customer's policy number
     */
    public String getPolicyNumber(){
        return policyNum;
    }

    /**
     * Method that returns the name of the insurance provider
     * @return name of insurance provider
     */
    public String getProviderName(){
        return providerName;
    }

    /**
     * Method that returns a copy of the policy holder object
     * @return a copy of the policy holder
     */
    public PolicyHolder getPolicyHolder(){
        
        return new PolicyHolder(policyHolder); //returns a deep copy of the policy holder for security
    }

    public int getNumOfPolicies(){
        return numOfPolicies;
    }

    //instance methods//
    /**
     * Method that calculate's BMI of customer and returns it as a double data type
     * @return BMI of customer as a double
     */
    public double calcBMI(){
        double bmi;
        bmi = (policyHolder.getWeight() * 703) / Math.pow(policyHolder.getHeight(),2);
        return bmi;
    }

    /**
     * Method that returns the price of the policy 
     * @return price of the policy 
     */
    public double calcPolicyPrice(){
        double price = 0;
        final int baseFee = 600;
        final int smokerFee = 100;
        double bmi = calcBMI();
        price += baseFee; //sets the base price to 600

        //adds smoker's fee
        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")){
            price += smokerFee;
        }   

        price += (bmi - 35) * 20; // additonal fee if BMI is over 35
            
        //adds fee for being over 50
        if (policyHolder.getAge() > 50){
            price += 50;
        }

        return price;
    }

    public String toString(){
        
        String str = "Policy Number: " + policyNum + "\nProvider Name: " + providerName + "\nPolicy Holder info:\n" + policyHolder + "\n";
        return str;
        
    }

}