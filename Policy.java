public class Policy{
    private int policyNum;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String smokingStatus;


   /**
    * Default constructor
    */
    public Policy(){
        policyNum = 0000;
        providerName = "";
        firstName = "";
        lastName = "";
        age = 0;
        height = 0;
        weight = 0;
    }
    /**
     * 
     * @param pn policy number
     * @param providerN insuance provider name
     * @param a customer age
     * @param firstN customer first name
     * @param lastN customer's last name 
     * @param h customer height 
     * @param w customer weight
     * @param smokS customer smoking status (smoker/non-smoker)
     */
    public Policy(int pn, String providerN, int a, String firstN, String lastN, double h, double w, String smokS){
        
        policyNum = pn;
        providerName = providerN;
        age = a;
        firstName = firstN;
        lastName = lastN;
        height = h;
        weight = w;
        smokingStatus = smokS;

    }

    //setter methods
    /**
     * method that sets customer's age
     * @param customerAge customer age
     */
    public void setAge(int customerAge){
        age = customerAge;
    }

    /**
     * method that sets the policy number
     * @param policyNumber policy number
     */
    public void setPolicyNumber(int policyNumber){
        policyNum = policyNumber;
    }

    /**
     * Method that sets the customer's first name
     * @param customerFirstName
     */
    public void setFirstName(String customerFirstName){
        firstName = customerFirstName;
    }

    /**
     * Method that sets the customer's last name
     * @param customerLastName customer's last name
     */
    public void setLastName(String customerLastName){
        lastName = customerLastName;
    }

    /**
     * Method that sets the insurance provider's name
     * @param insuranceProviderName insurance provider name
     */
    public void setProviderName(String insuranceProviderName){
        providerName = insuranceProviderName;
    }

    /**
     * Method that sets the smoking status for the customer
     * @param customerSmokingStatus smoking status (smoking/non-smoking)
     */
    public void setSmokingStatus(String customerSmokingStatus){
        smokingStatus = customerSmokingStatus;
    }

    /**
     * Method that sets the customer's height
     * @param customerHeight customer's height
     */
    public void setHeight(double customerHeight){
        height = customerHeight;
    }

    /**
     * Method that sets the customer's weight
     * @param customerWeight customer's weight
     */
    public void setWeight(double customerWeight){
        weight = customerWeight;
    }

    //getter methods
    /**
     * Method that returns customer's age
     * @return customer's age
     */
    public int getAge(){
        return age;
    }

    /**
     * Method that returns the policy number
     * @return customer's policy number
     */
    public int getPolicyNumber(){
        return policyNum;
    }

    /**
     * Method that returns the first name of the customer
     * @return customer's first name
     */
    public String getFirstName(){
       return firstName;
    }

    /**
     * Method that returns the last name of the customer
     * @return return customer's last name
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * Method that returns the name of the insurance provider
     * @return name of insurance provider
     */
    public String getProviderName(){
        return providerName;
    }

    /**
     * Method that returns the smoking status of the customer
     * @return smoking status of customer (smoking/non-smoking)
     */
    public String getSmokingStatus(){
        return smokingStatus;
    }

    /**
     * Method that returns the height of the customer
     * @return height of customer
     */
    public double getHeight(){
        return height;
    }

    /**
     * Method that returns the weight of a customer 
     * @return weight of customer
     */
    public double getWeight(){
        return weight;
    }

    //instance methods//
    /**
     * Method that calculate's BMI of customer and returns it as a double data type
     * @return BMI of customer as a double
     */
    public double calcBMI(){
        double bmi;
        bmi = (weight * 703) / Math.pow(height,2);
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
        if (smokingStatus.equalsIgnoreCase("smoker")){
            price += smokerFee;
        }   

        price += (bmi - 35) * 20; // additonal fee if BMI is over 35
            
        //adds fee for being over 50
        if (age > 50){
            price += 50;
        }

        return price;
    }





}