package exceptionhandling;
//sometimes we might want to create our own exceptions. Creating own exceptions is called custom exceptions or user-defined exceptions.
class AgeNotEligible extends RuntimeException{//It is always better to extend unchecked exceptions. Because we want our application
                                                      //--to throw an exception when something goes wrong and if we extend checked exception
                                                     //--here the compiler error rises which we do not want.
    AgeNotEligible(String errorMessage){
        super(errorMessage);//we use super keyword to pass the message to it's parent class which is Exception. Exception pass the message
                            //by default to it's parent class and Throwable from where the default exception handler take the message
                            //and print the message in the console.
    }

}
public class CustomException11{
    static int eligibleForMarriage=14;
    public static void main(String[] args) {
        if(eligibleForMarriage<18){
            throw new AgeNotEligible("you are not eligible as you are too young");
        }
        else if(eligibleForMarriage>69){
            throw new AgeNotEligible("you are not eligible as you are too old");
        }
        else{
            System.out.println("you are eligible for marriage");
        }
    }
}

