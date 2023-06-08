package BooleanOperators;

public class Main {
    public static void main(String[] args) {
        /*Try to solve on paper the following boolean algebra operations:

[A]: 2 <= 2 && !true is false
[B]: !false && 3 > 2 is true
[C]: considering that t=false and f=true: !(!t || f) is false
[D]: 6 > 6 ^ !(true && true) is false */
        boolean t = false;
        boolean f = true;
        boolean a = 2 <= 2 && !true;
        boolean b = !false && 3 > 2;
        boolean c = !(!t || f);
        boolean d = 6 > 6 ^ !(true && true);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
