package Day_0;

public class Operators {
    public static void main(String[] args) {

        int x=-12, y=15;

        if (x > y){
            System.out.println("X is greater than Y");
        }else if (x == y){
            System.out.println("X is equal to Y");
        }else if(x < y){
            System.out.println("X is less than Y");
        }

        if (x!=y){
            System.out.println("X is not equal to Y");
        }

        char var_a = 'A', var_b = 'c';
        if (var_a <= var_b){
            System.out.println(var_a + " is less than or equal to " + var_b);
        }

        /*
        ======================================================
        Relational Operators
        ======================================================
        <, > , ==, <=, >= ,!=
        */

        /*
        ======================================================
        Conditional Operators
        ======================================================
        Operation	Meaning	Note
        a && b	logical AND	short-circuiting
        a || b	logical OR	short-circuiting
        ! logical NOT
                */

        /*
        ======================================================
        Numerical Operators
        ======================================================
        +, -, *, %, /, ++, --
        */

        /*
        ======================================================
        Bitwise Operators
        ======================================================
        Assume if a = 60 and b = 13; now in binary format they will be as follows −

        a = 0011 1100
        b = 0000 1101
        -----------------
        a&b = 0000 1100
        a|b = 0011 1101
        a^b = 0011 0001
        ~a  = 1100 0011

        & (bitwise and)
                |Binary AND Operator copies a bit to the result if it exists in both operands.
                |(A & B) will give 12 which is 0000 1100
        | (bitwise or)
                |Binary OR Operator copies a bit if it exists in either operand.
                |(A | B) will give 61 which is 0011 1101
        ^ (bitwise XOR)
                |Binary XOR Operator copies the bit if it is set in one operand but not both.
                |(A ^ B) will give 49 which is 0011 0001
        ~ (bitwise compliment)
                |Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
                |(~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.
        << (left shift)
                |Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.
                |A << 2 will give 240 which is 1111 0000
        >> (right shift)
                |Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
                |A >> 2 will give 15 which is 1111
        >>> (zero fill right shift)
                |Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
                |A >>>2 will give 15 which is 0000 1111


         */

        /*
        ======================================================
        Assignment Operators
        ======================================================
        = Simple assignment operator. Assigns values from right side operands to left side operand.
        += Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.
        -= Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.
        *= Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.
        /= Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.
        %= Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.
        <<= Left shift AND assignment operator.
        >>= Right shift AND assignment operator
        &= Bitwise AND assignment operator.
        ^= bitwise exclusive OR and assignment operator.
        |= bitwise inclusive OR and assignment operator.

         */

        /*
        ======================================================
        Conditional Operator ( ? : )
        ======================================================

        variable x = (expression) ? value if true : value if false

        */

        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

    }
}
