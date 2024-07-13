public class Fibonacci {
    public static void main(String[] args) throws Exception {
        System.out.println(fibo(6));
    }

    static int fibo(int m){
        //base condition

        if(m<2){
            return m;
        }

        return fibo(m-1) + fibo(m-2);
    }
}
