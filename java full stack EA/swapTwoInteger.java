public class swapTwoInteger {
    public static void main(String[] args){
        System.out.println("Enter the first integer");
        int num1=5;
        System.out.println("Enter the second integer");
        int num2=10;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("The swapped integers are: " + num1 + " and " + num2);

        
    }
    
}   
