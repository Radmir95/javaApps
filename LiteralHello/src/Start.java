import java.util.LinkedList;

public class Start {



    public static void main(String[] args) {
        LinkedList<String> before = new LinkedList<String>();
        LinkedList<String> after = new LinkedList<String>();
        before.add(0,"Это");
        before.add(1,"новый");
        before.add(2, "дивный");
        before.add(3, "мир");
        before.add(4, "созданный");
        before.add(5, "классиком");
        before.add(6, "зарубежья");

        int k = 0;

        for (int i = 0; i < before.size(); i++){
            if (k == 3){
                k = 0;
                i--;
                after.push("привет");
            }
            else{
                k++;
                after.push(before.get(i));
            }
        }


        for (int i = after.size()-1; i >= 0; i--){
            System.out.println(after.get(i));

        }

    }


}
