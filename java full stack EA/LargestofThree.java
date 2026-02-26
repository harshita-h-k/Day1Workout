class LargestOfThree {
    public static void main(String[] args) {

        int num1 = 25;
        int num2 = 40;
        int num3 = 30;

        int largest;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } 
        else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } 
        else {
            largest = num3;
        }

        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("Third Number: " + num3);
        System.out.println("LargestofThree is: " + largest);
    }
}

