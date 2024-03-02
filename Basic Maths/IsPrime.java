public class IsPrime {
    public static void main(String[] args) {
        int testCase = 2;
        boolean answer = isPrime(testCase);

        if(answer && testCase != 1) {
            System.out.println(testCase + " is a prime number");
        } else {
            System.out.println(testCase + " is not a prime number");
        }
    }   
    // the reason we are iterating until the square root of n, is because if a number N is not a prime, then it must have a divisor smaller or equal to its square root 
    public static boolean isPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
