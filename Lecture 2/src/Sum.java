public class Sum {

    int doSum(int a, int b) {
        return a + b;
    }

    int doSum(int a, int b, int c) {
        return a + b + c;
    }

    /*
    // This is not possible as return type is only different, Java compiler will directly throw an error

    // on the basis of return type, overloading can't be done., at compile time it does not check return type but only arguments.

    float doSum(int a, int b, int c) {
        return a + b + c;
    }
    */
}
