import com.sun.deploy.panel.ITreeNode;

import java.util.*;

public class work1 {

    public static boolean isTreeSetConsistHashSet(TreeSet<Double> tree, HashSet<Double> hash){
        Iterator<Double> itr1 = hash.iterator();
        boolean result = true;

        while(itr1.hasNext() && result){
            result = hash.contains((double)itr1.next());
        }
        return result;
    }

    public static TreeSet<Double> deleteFromTreeSetLinkSet(TreeSet<Double> tree, LinkedHashSet<Double> link){

        TreeSet<Double> treeSet = new TreeSet();
        treeSet = (TreeSet<Double>) tree.clone();

        Iterator<Double> itr1 = link.iterator();

        while(itr1.hasNext()){
            if(treeSet.contains((double)itr1.next())){
                treeSet.remove((double)itr1.next());
            }
        }
        return treeSet;
    }

    public static void main(String[] args) {

        int min = 0;
        int max = 50;

        HashSet<Double> hashSet = new HashSet();
        TreeSet<Double> treeSet = new TreeSet();
        LinkedHashSet<Double> linkedHashSet = new LinkedHashSet();

        for (int i = 0; i < 55; i++){
            hashSet.add(min + Math.random()*(max - min));
            treeSet.add(min + Math.random()*(max-min));
            linkedHashSet.add(min + Math.random()*(max-min));
          }

        System.out.println("HashSet:");

        Iterator<Double> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            }

        System.out.println("TreeSet:");

        itr = treeSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
         }
        System.out.println("LinkedHashSet:");

        itr = linkedHashSet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            }

        HashSet<Double> hash = new HashSet();
        double[] d =new double[10];
        d[0] = 3;
        d[1] = 13.1;
        d[2] = 33;
        d[3] = 12;
        d[4] = 11.124;
        d[5] = 4;
        d[6] = 11.4;
        d[7] = 1.32;
        d[8] = 3.12;
        d[9] = 3.14;
        for (int i = 0; i < d.length; i++){
            hash.add(d[i]);
            }

        TreeSet<Double> tree1 = deleteFromTreeSetLinkSet(treeSet,linkedHashSet);
        System.out.println("Consist?");
        System.out.println(isTreeSetConsistHashSet(treeSet,hashSet));
        itr = tree1.iterator();
        System.out.println("Result of deleting:");
        while(itr.hasNext()){
            System.out.println(itr.next());

        }


        }
    }
