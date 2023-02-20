public class Person 
{
    //fields
    protected String firstName;
    protected int age;
    static final int MIN_AGE = 1;  //Minimum valid age for a person
    static final int MAX_AGE = 110; // Maximum valid age for a person
    static final int NO_AGE_VALUE = -1; // Indicates the Person object contains no age value.

    /*
    * Here we are creating a public function called Person which takes in 1 parameter
    * We pass through a string defined as f and then run an if check to see if the string is void or not
    * if the string is void then we acces our setAge function and pass through the int NO_AGE_VALUE
    * if the string is not void and the string length is greater than 1 the string passes the verifyName function check 
    * then we use the setName function and pass through our f string as the name.
    */
    public Person(String f) 
    {
        if (f != null && f.length() > 1 && verifyName(f) == true) 
        {
            setName(f);
        }
        setAge(NO_AGE_VALUE);
    }

    //getter
    // Here we create a simple function that just returns firstName which is of type String.
    public String getFirstName() 
    {
        return firstName;
    }

    //Similar to our getFirstName function, this just returns our age int
    public int getAge() 
    {
        return age;
    }

    //setters
    /* 
     * Here we have created a function that is designed to set the name. We pass through our first name string
     * We use the "this" command to reference the current object (aka firstName) and assign it to the firstName string.
     * This is done to ensure that the string passed through is truly equal to the proper and correct firstName string. Essentially setting the name. 
     */
    public void setName(String firstName) 
    {
        this.firstName = firstName;

    }

    /*
     * The setAge funtion is similar in nature to the setAge function, but needs to run an additional check to make sure the age passed through the parameter
     * is within the confines of our min and max age. It also checks to make sure that the first name is not null to ensure that an age always goes with a name.
     * if these checks return true, it assigns the the age passed through to the correct age value.
     * If the check fails then it sets the age int to equal the NO_AGE_VALUE int or -1. 
     */
    public void setAge(int age) 
    {

        // checks to see if valid value between MIN_AGE and MAX_AGE inclusive.
        if (age >= MIN_AGE && age <= MAX_AGE && this.firstName != null) 
        {
            this.age = age;

        } 
        
        else 
        {
            this.age = NO_AGE_VALUE;
        }
    }

    /*
     * This function runs a quick check to make sure age is not of a value outside our min and max value
     * and if age is within those confines, it makes age equal the current age and bumps it up by one (or age++)
     */
    public void bumpAge() 
    {
        if(age > MIN_AGE && age < MAX_AGE)
        {
            this.age = age + 1;
        }

    }

    /*
     * Here we are returning a type Bool and passing through a string. 
     * We run a quick for loop to determine the length of the string.
     * Then it passes through a check to determine whether the name is true or false.
     * It makes sure that if i runs into something which is not a letter (aka a number or blank space) then this cannot be a name
     * As long as i is hitting a letter then the name is true. 
     */
    public boolean verifyName(String s) 
    {
        for (int i = 0; i < s.length(); i++) 
        {
            if ((Character.isLetter(s.charAt(i)) == false)) 
            {
                return false;
            }
        }
        return true;
    }

    //utility method
    /*
     * This is the final piece of the puzzle and returns the name and age all in a string. 
     * Should look something like "firstName: John Age: 28" 
     */
    public String toString() 
    {
        return ("firstName: " + firstName + " Age: " + age);
    }
}