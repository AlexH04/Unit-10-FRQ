public class NumberSystem

{

    /** Precondition: a and b are positive integers.

     * Returns the greatest common factor of a and b, as described in part (a).

     */

    public static int gcf(int a, int b)

    {
        if (a % b == 0) {
            return b;
        } else {
            return gcf(b, a % b);
        }
    }



    /** Precondition: numerator and denominator are positive integers.

     * Reduces the fraction numerator / denominator

     * and prints the result, as described in part (b).

     */

    public static void reduceFraction(int numerator, int denominator)

    {
        if (numerator % denominator == 0) {
            System.out.println(numerator + "/" + denominator + " reduces to " + numerator / denominator);
        } else {
            int GCF = gcf(numerator, denominator);
            System.out.println(numerator + "/" + denominator + " reduces to " + numerator / GCF + "/" + denominator / GCF);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcf(7, 3));
        reduceFraction(30, 3);
    }

}