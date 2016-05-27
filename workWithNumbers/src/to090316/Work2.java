package to090316;

public class Work2 {
    private int[] vector;

    public Work2(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void method(){
        for (int i = 0; i < vector.length; i++)
            if (isPrime(vector[i])) vector[i] = 0;
    }

    private boolean isPrime(int num){
        boolean isPrime = true;
        if (num == 1){
            return false;
        }
        for (int i = 2; i < Math.sqrt(num) && isPrime; i++)
            if(num % i == 0) isPrime = false;
        return isPrime;
    }



}
