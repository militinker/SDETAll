package reviews;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean loginButtonDisplayed=true;
        boolean loginButtonClickable=false;

        if(loginButtonDisplayed && loginButtonClickable){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }

        System.out.println("*******************");

        boolean dashboard=false;
        String message="Welcome admin";

        if(dashboard || message.equals("Welcome admin")){
            System.out.println("User is logged in");
        }else {
            System.out.println("User is not logged in");
        }

        System.out.println("********** LOGICAL NOT*********");

        boolean b=true;

        System.out.println("!true"); // false


        boolean agreeCheckBoxSelected=true;

        if(!agreeCheckBoxSelected){
            System.out.println("I am cliking on checkbox");
        }
        System.out.println("Im clicking on submit button");











    }
}
