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


    public static int checkInput () {
        Scanner input = new Scanner (System.in);
        int  input = input.nextLine();
        boolean intinput = input.chars().allMatch(Character::isInteger);

        //Returns error message if the input is empty
        try {
            if input.isEmpty() || input.equals ("")){
                System.out.println("Invalid Input");
                return;
            }
        }
    
        //Allows integer inputs to be converted
        if (intinput) {
            inputline = Integer.parseInteger(input);
        } else {
            System.out.println("Please input Integer inputs only!");
            return;
        }

        //Returns message if input is a negative integer
        if (intinput < 0){
            System.out.println("Please input a positive Integer!");
            return;
        }
    }
}

