public class Policy{
    private int policyNum;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String smokingStatus;

    //no-arg constructor
    public Policy(){
        policyNum = 0001;
        providerName = "Government Healthcare";
        firstName = "John";
        lastName = "Doe";
        age = 18;
        height = 70;
        weight = 150;
    }
    //arg constructor
    public Policy(int policyNumber, String insuranceProviderName, int customerAge, int customerFirstName, int customerLastName, double customerHeight, double customerWeight, String customerSmokingStatus){
        
    }

    //setter methods
    public void setAge(int customerAge){
        age = customerAge;
    }
    public void setPolicyNumber(int policyNumber){
        policyNum = policyNumber;
    }
    public void setFirstName(String customerFirstName){
        firstName = customerFirstName;
    }
    public void setLastName(String customerLastName){
        lastName = customerLastName;
    }
    public void setProviderName(String insuranceProviderName){
        providerName = insuranceProviderName;
    }
    public void setSmokingStatus(String customerSmokingStatus){
        smokingStatus = customerSmokingStatus;
    }
    public void setHeight(double customerHeight){
        height = customerHeight;
    }
    public void setWeight(double customerWeight){
        weight = customerWeight;
    }

    //getter methods
    public int getAge(){
        return age;
    }
    public int getPolicyNumber(){
        return policyNum;
    }
    public String getFirstName(){
       return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getProviderName(){
        return providerName;
    }
    public String getSmokingStatus(){
        return smokingStatus;
    }
    public double getHeight(){
        return height;
    }
    public double getWeight(){
        return weight;
    }

    //instance methods
    public int calcBMI(){
        int bmi;
        bmi = (weight * 703) / Math.pow(height,2);
        return Math.ceil(bmi);
    }
    public double calcPolicyPrice(){
        double price = 0;
        final int baseFee = 600;
        final int smokerFee = 100;
        int bmi = calcBMI();
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