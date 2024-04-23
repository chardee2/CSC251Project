public class PolicyHolder {
    
    //member fields
    
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private double weight;
    private String smokingStatus;

    //constructors

    /**
     * Default constructor 
     */
     public PolicyHolder(){
        firstName = "";
        lastName = "";
        age = 0;
        height = 0;
        weight = 0;
        smokingStatus = "";
    }



    /**
     * Constructor to set all member fields
     * @param f first name
     * @param l last name
     * @param a age
     * @param h height
     * @param w weight
     * @param smokS smoking status: "Smoker/non-smoker"
     */
    public PolicyHolder (String f, String l, int a, double h, double w, String smokS){
        firstName = f;
        lastName = l;
        age = a;
        height = h;
        weight = w;
        smokingStatus = smokS;
    }



    /**
     * Copy constructor for Policy holder
     * @param object2 copies this object's info into a new object
     */
    public PolicyHolder(PolicyHolder object2){
        
        firstName = object2.firstName;
        lastName = object2.lastName;
        age = object2.age;
        height = object2.height;
        weight = object2.weight;
        smokingStatus = object2.smokingStatus;

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
     * Method that sets the smoking status for the customer
     * @param s smoking status (smoking/non-smoking)
     */
    public void setSmokingStatus(String s){
        smokingStatus = s;
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

    //instance methods

    public String toString(){
        
        String str = "First Name: " + firstName + "\nLast name: " + lastName + "\nAge: " + age
        + "\nHeight: " + height + "\nWeight: " + weight + "\nSmoking Status: " + smokingStatus;

        return str;
    }

}
