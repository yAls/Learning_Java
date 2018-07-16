package Day_0;

public class Loops {
    public static void main(String[] args){


        // While loop
        int x = -10;
        while (x <= 0){
            System.out.println(x + " is a negative number");
            x++;
        }

        //for loop
        for(x=10; x>0; x--){
            System.out.println("Value of X: " + x);
        }

        //enhanced for loop
        String vowels[]={"a","e","i","o","u"};

        for (String x_string : vowels)
        {
            System.out.println(x_string);
        }

        //Do-While loop
        x = -10;
        do {
            System.out.println("X is a positive integer. " + x);
            x++;
        }
        while (x>0);

    }
}
