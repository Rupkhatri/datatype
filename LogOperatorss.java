package logical_operators;

public class LogOperatorss {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(a<20 & a<30);
        System.out.println(a<20 || a<30);
        System.out.println(!(a <20) & a<30);
    }
}
