public class Main 
{
    public static void main(String[] args)
    {
        //Create our first test case
        int testNum = 1;
        //Here we define 4 strings
        String operation = "Creating new";
        String test = "firstName: Robert Age: -1";
        String sName = "Robert";
        /*
         * scenario formats a string line which takes the strings listed above via %d, %s, and %s
         */
        String scenario = String.format("Scenario %d test of Person class\n =========================\n%s Person object with name = %s \nMethod call returned.\nPerson object contains the following:",testNum, operation, sName);
        // Test Scenario #1
        //Here we grab our person class and pass through a name "Robert"
        Person myObj = new Person("Robert");
        System.out.println(scenario);
        System.out.println(myObj);
        System.out.println("Expected values: " + test);
        /*
         * Above we print various lines like the scenario above as well as the name we gave to our person class
         * This then checks to make sure the test created is equal to the output created by the toString function in our person class.
         * if this check passes then we know the results our matched, if not then we know the results did not
         */
        if(test.equals(myObj.toString()))
        {
            System.out.println("Actual and expected results matched. Test successful.");
        }
        else
        {
            System.out.println("Actual and expected results did not match. Test failed.");
        }

        //We then take the logic above and incement the test by one
        // increment test by one
        test = "firstName: Robert Age: 40";
        testNum += 1;
        operation = "Using setAge() method on";
        scenario = String.format("\nScenario %d test of Person class\n =========================\n%s Person object with name = %s \nMethod call returned.\nPerson object contains the following:",testNum, operation, sName);
        System.out.println(scenario);
        // Test Scenario #2
        myObj.setAge(40);
        System.out.println(myObj);
        System.out.println("Expected values: " + test);
        if(test.equals(myObj.toString()))
        {
            System.out.println("Actual and expected results matched. Test successful.");
        }
        else
        {
            System.out.println("Actual and expected results did not match. Test failed.");
        }

        // Test Scenario #3
        test = "firstName: Robert Age: 41";
        testNum += 1;
        operation = "Using bumpAge() method on";
        scenario = String.format("\nScenario %d test of Person class\n =========================\n%s Person object with name = %s \nMethod call returned.\nPerson object contains the following:",testNum, operation, sName);
        System.out.println(scenario);
        myObj.bumpAge();
        System.out.println(myObj);
        System.out.println("Expected values: " + test);
        if(test.equals(myObj.toString()))
        {
            System.out.println("Actual and expected results matched. Test successful.");
        }
        else
        {
            System.out.println("Actual and expected results did not match. Test failed.");
        }

        // Test Scenario #4
        test = "firstName: Robert Age: -1";
        testNum += 1;
        operation = "Attempting to set age instance variable on";
        scenario = String.format("\nScenario %d test of Person class\n =========================\n%s Person object with name = %s \nMethod call returned.\nPerson object contains the following:",testNum, operation, sName);
        System.out.println(scenario);
        myObj.setAge(750);
        System.out.println(myObj);
        System.out.println("Expected values: " + test);
        if(test.equals(myObj.toString()))
        {
            System.out.println("Actual and expected results matched. Test successful.");
        }
        else{
            System.out.println("Actual and expected results did not match. Test failed.");
        }

        //test scenario #5
        test = "firstName: Robert Age: -1";
        testNum += 1;
        operation = "Attempting to bump age with invalid instance variable on";
        scenario = String.format("\nScenario %d test of Person class\n =========================\n%s Person object with name = %s \nMethod call returned.\nPerson object contains the following:",testNum, operation, sName);
        System.out.println(scenario);
        myObj.bumpAge();
        System.out.println(myObj);
        System.out.println("Expected values: " + test);
        if(test.equals(myObj.toString()))
        {
            System.out.println("Actual and expected results matched. Test successful.");
        }
        else
        {
            System.out.println("Actual and expected results did not match. Test failed.");
        }

        //test scenario #6
        test = "firstName: null Age: -1";
        testNum += 1;
        sName = "R2-D2";
        operation = "Attempting to create a new Person object with invalid name";
        scenario = String.format("\nScenario %d test of Person class\n =========================\n%s Person object with name = %s \nMethod call returned.\nPerson object contains the following:",testNum, operation, sName);
        System.out.println(scenario);
        Person myObj2 = new Person("R2-D2");
        System.out.println(myObj2);
        System.out.println("Expected values: \n" + test);
        if(test.equals(myObj2.toString())){
            System.out.println("Actual and expected results matched. Test successful.");
        }
        else{
            System.out.println("Actual and expected results did not match. Test failed.");
        }

        //test scenario #7
        test = "firstName: null Age: -1";
        testNum += 1;
        operation = "Attempting to increment the age value in a person object contains null first name on";
        scenario = String.format("\nScenario %d test of Person class\n =========================\n%s Person object with name = %s \nMethod call returned.\nPerson object contains the following:",testNum, operation, sName);
        System.out.println(scenario);
        myObj2.bumpAge();
        System.out.println(myObj2);
        System.out.println("Expected values: " + test);
        if(test.equals(myObj2.toString()))
        {
            System.out.println("Actual and expected results matched. Test successful.");
        }
        else
        {
            System.out.println("Actual and expected results did not match. Test failed.");
        }

    }

}