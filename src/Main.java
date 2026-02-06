public class Main{

    public static void main(String[] args)
    {
        //Declarations
        double winter = 9321.48;
        double spring = 1648.32;
        double summer = 9324.47;
        double autumn = 3782.16;
        double yearlyTotalCost;

        //Statements
        yearlyTotalCost = winter + spring + summer + autumn;
        System.out.println("The cost for Winter was: $" + winter + ", the cost for Spring was: $" + spring + ", the cost for Summer was: $" + summer + ", the cost for Autumn was: $" + autumn + ", leading to a yearly total of: $" + yearlyTotalCost);
    }
}
