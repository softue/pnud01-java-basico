public class ArrayEx1 {

    public static void main(String args[]) {
        

        int[] array = { 0, 100, 50, -20, 19, 1, 5, -1, 27, 19, 5 };
        int min = array[0];
        for (int i : array) {
            if (i<min) min = i;
        }
        System.out.println(min);
        
        int[] score = new int[9];
        byte[] values = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};


        int[] primeNum = new int[20];
        int[] even = new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

    }

}
