public class Math {
    long factorials(int n){
        if(n == 1){
            return 1;
        }
        return n * factorials(n-1);
    }

    // factorials(5) -> 5 * factorials(4) -> 5 * 4 * factorials(3) -> 5 * 4 * 3 * factorials(2) -> 5 * 4 * 3 * 2 * factorials(1) -> 5 * 4 * 3 * 2 * 1
}
