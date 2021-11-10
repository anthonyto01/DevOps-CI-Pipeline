import java.util.Scanner;

class Dec2Hex
{

    public static int Arg1;

    public static void main(String args[])
    {
        Arg1 = Integer.parseInt(args[0]);
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }

    public static Scanner checkInput () {
        Scanner input = new Scanner (System.in);

        if(input.hasNextInt()){
            return input;
        } else{
            //Returns error message if input is a non integer
            System.out.println("Please input Integers only!");
        }
        
        try{
            if (input.equals ("")){
                //Returns error message if the input is empty    
                System.out.println("Please enter an Integer!");
            }
        }catch (InputMismatchException e){
    }      
        return input;
    }      
}

