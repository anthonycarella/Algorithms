package carellaprojects.algorithms.datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet);
        hashSet.add(45);
        hashSet.add(46);
        hashSet.add(Integer.parseInt("47"));
        System.out.println(hashSet);

        Set<Integer> treeSet = new TreeSet<>();
    }

}
