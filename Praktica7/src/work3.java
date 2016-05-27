import java.util.Map;
import java.util.TreeMap;

public class work3 {
    public static void main(String[] args) {
        String sentence = "У лукоморья дуб зеленый";
        sentence = sentence.toLowerCase();

        Map<Character, Integer> tree = new TreeMap();
        for(char i = 'а'; i <= 'я'; i++){
            tree.put(i,0);
        }

        sentence = sentence.replace(" ","");

        for(char i = 0; i < sentence.length(); i++){
            char s = sentence.charAt(i);
            int k = tree.get(s);
            tree.put(s,k+1);
        }

        for(Map.Entry e : tree.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }


    }


}
