public class Multadd {

    public static void main(String[] args) {
        //1.0 * 2.0 + 3.0 = 5.0
        System.out.println("Test 1 (1, 2, 3): " + multadd(1.0, 2.0, 3.0));

        // a = 0.5, b = cos(pi/4), c = sin(pi/4)
        double trigResult = multadd(Math.cos(Math.PI / 4), 0.5, Math.sin(Math.PI / 4));
        System.out.println("Trig sum: " + trigResult);

        // log(10) + log(20)
        // a = 1.0, b = log(10), c = log(20)
        double logResult = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("Log sum: " + logResult);
        
        // test
        System.out.println("expSum(1.0): " + expSum(1.0));
    }

     //a * b + c

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }
// math.exp is e^x, so e^-x is math.exp(-x)
    public static double expSum(double x) {
        double a = x; 
        double b = Math.exp(-x);
        double c = Math.sqrt(1 - b); // b is e^-x
        
        return multadd(a, b, c);
    }
}

///Jan 26 2026 monday
/// Jan 30 2026 friday