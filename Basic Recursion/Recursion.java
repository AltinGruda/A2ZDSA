public class Recursion {
    static void func(int i, int n){
        
            // Base Condition.
            if(i>n) return;
            System.out.println("Altos");

            // Function call to print till i increments.
            func(i+1,n);

    }
    public static void main(String[] args) {

        // Here, let’s take the value of n to be 4.
        func(1,4);
    }
}
