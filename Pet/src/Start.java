import java.util.LinkedList;

public class Start {

    public static void main(String[] args) {
        //1

        LinkedList<Pet> pet = new LinkedList<Pet>();
        Pet p1 = new Pet("Барсик",3);
        Pet p2 = new Pet("Вася",4);
        Pet p3 = new Pet("Мурзик",1);
        Pet p4 = new Pet("Пушистик",2);
        Pet p5 = new Pet("Мося",2);
        pet.add(p1);
        pet.add(p2);
        pet.add(p3);
        pet.add(p4);
        pet.add(p5);

        //2
        for (int i = 0; i < pet.size(); i++){
            Pet t = pet.get(i);
            System.out.println(t.getName() + " " + t.getAge());
        }

        //3
        Pet head = pet.getFirst();
        Pet tail = pet.getLast();
        System.out.println(head.getName() + " " + head.getAge());
        System.out.println(tail.getName() + " " + tail.getAge());

        System.out.println("Deleting tail:");

        //4
        Pet removed = pet.removeLast();
        System.out.println(removed.getName() + " " + removed.getAge());

        //5
        System.out.println("After deleting:");
        for (int i = 0; i < pet.size(); i++){
            Pet t = pet.get(i);
            System.out.println(t.getName() + " " + t.getAge());
        }

        //6
        System.out.println("Deleting head:");
        head = pet.poll();
        System.out.println(head.getName() + " " + head.getAge());

        //7
        for (int i = 0; i < pet.size(); i++){
            Pet t = pet.get(i);
            System.out.println(t.getName() + " " + t.getAge());
        }

        //8
        pet.poll();

        //9
        pet.add(new Pet("Василий",5));

        //10
        for (int i = 0; i < pet.size(); i++){
            Pet t = pet.get(i);
            System.out.println(t.getName() + " " + t.getAge());
        }

        //11
        pet.offer(new Pet("Женек", 8));

        //12
        for (int i = 0; i < pet.size(); i++){
            Pet t = pet.get(i);
            System.out.println(t.getName() + " " + t.getAge());
        }

        //13
        pet.offer(new Pet("Альбатрос", 7));

        //14
        for (int i = 0; i < pet.size(); i++){
            Pet t = pet.get(i);
            System.out.println(t.getName() + " " + t.getAge());
        }

    }

}
