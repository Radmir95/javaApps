import java.util.HashMap;

public class work2 {

    public static void main(String[] args) {

        int min = 0;
        int max = 50;

        HashMap<Integer,Integer> data = new HashMap<Integer, Integer>();
        for(int i = 0; i < max; i++)
            data.put(i,0);

        for(int i = 0; i < 100000; i++){
            int num = min + (int)(Math.random()*(max-min));
            data.put(num,data.get(num)+1);
        }

        for(int i =0; i < data.size(); i++){
            System.out.println(data.get(i));
        }
    }
}
