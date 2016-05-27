
public class StartCar {
    public static void main(String[] args) {
        Door door=new Door("Синий",false);
        Motor motor=new Motor(6,2.4);
        Wheel wheel=new Wheel(true,16,"Michelin");
        AutoCar autoCar=new AutoCar(door,motor,wheel);
        autoCar.start();
        autoCar.signal();
        autoCar.boost();
        autoCar.braking();
        autoCar.finish();


        System.out.println("Цвет двери: " + autoCar.getDoor().getColor());
        if(autoCar.getDoor().isTonirovka())
            System.out.println("Затонирована");
        else System.out.println("Не затанирована");

    }
}
