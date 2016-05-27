package to090316;

public class Work1 {
    private int maxLength;
    private int firstIndex;
    private double[] mas;

    public int getFirstIndex() {
        return firstIndex;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public Work1(double[] mas) {
        maxLength = 0;
        firstIndex = 0;
        this.mas = mas;
    }

    public void method(){
        boolean in = false;
        int count  = 0;
        int index = 0;

        for (int i = 0; i < mas.length; i++){
            if (mas[i] == 0){
                if (in == false){
                    count = 0;
                    index = i;
                    in = true;
                }
                count++;
            }
            else
                if (in == true){
                    if (count > maxLength ){
                        maxLength = count;
                        firstIndex = index;
                    }
                    in = false;
                }
        }

        if (count > maxLength){
            maxLength = count;
            firstIndex = index;
        }
    }

}
