
public class MapOfWork {
    public class Data{
        Type.A a;
        int q;
        String direction;

        Data(Type.A a, int q, String direction){
            this.a = a;
            this.q = q;
            this.direction = direction;
        }
    }

    public Data data[][]; // массив для хранения программы

    public void create(){
        data = new Data[3][5];
        data[0][0] = new Data(Type.A.Phi, 5, "right");
        data[0][1] = new Data(Type.A.Phi, 4, "nothing");
        data[0][2] = new Data(Type.A.Ksi, 5, "nothing");
        data[0][3] = new Data(Type.A.Ksi, 1, "right");
        data[0][4] = new Data(Type.A.L, 1, "left");

        data[1][0] = new Data(Type.A.Ksi, 2, "stop");
        data[1][1] = new Data(Type.A.Phi, 2, "right");
        data[1][2] = new Data(Type.A.Phi, 3, "right");
        data[1][3] = new Data(Type.A.Ksi, 4, "left");
        data[1][4] = new Data(Type.A.Phi, 0, "nothing");

        data[2][0] = new Data(Type.A.Ksi, 3, "nothing");
        data[2][1] = new Data(Type.A.Ksi, 2, "right");
        data[2][2] = new Data(Type.A.Ksi, 3, "right");
        data[2][3] = new Data(Type.A.Phi, 4, "left");
        data[2][4] = new Data(Type.A.Phi, 2, "nothing");

    }


}
