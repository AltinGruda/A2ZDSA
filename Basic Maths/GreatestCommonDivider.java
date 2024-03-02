public class GreatestCommonDivider {
    public static void main(String[] args) {
        calcGCD(6, 4);
    }

    // brute force approach, time complexity: O(N)
    public static int calcGCD(int n, int m){
        int gcd = 0;
        for(int i = 1; i <= Math.min(n, m); i++){
            if(n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    // optimal approach 
    // recursively call gcd(b, a%b) till the base condition is hit
    // b==0 is the base condition.When base condition is hit return a,as gcd(a,0) is equal to a.
    // time complexity O(logɸmin(a,b))
    public static int gcd(int n, int m) {
        if(m == 0) {
            return n;
        }

        return gcd(m, n % m);
    }

}
