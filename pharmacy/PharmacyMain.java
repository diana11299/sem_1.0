package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component penicilin = new Component("Penicilin", "10mg", 100);
        Component salt = new Component("Salt", "5mg", 20);
        Component sugar = new Component("Sugar", "30mg", 60);
        Pharmacy pharmacy1 = new Pharmacy();
        IterablePharmacy pharmacy2 = new IterablePharmacy();

        pharmacy1.addComponents(penicilin, salt);
        pharmacy2.addComponents(penicilin, sugar);

        for (Component c:pharmacy2){
            System.out.println(c);
        }

        List<Component> list = new ArrayList<>();
        list.add(penicilin);
        list.add(salt);
        list.add(sugar);
        Collections.sort(list);
        System.out.println(list);

        Pharmacy p1 = new Pharmacy();
        Pharmacy p2 = new Pharmacy();
        Pharmacy p3 = new Pharmacy();
        Pharmacy p4 = new Pharmacy();
        Pharmacy p5 = new Pharmacy();
        Pharmacy p6 = new Pharmacy();
        p1.addComponents(penicilin, salt);
        p2.addComponents(penicilin, sugar);
        p3.addComponents(salt, sugar);
        p4.addComponents(penicilin, sugar);
        p5.addComponents(sugar);
        p6.addComponents(sugar, salt);
        List<Pharmacy> phList = new ArrayList<>();
        phList.add(p1);
        phList.add(p2);
        phList.add(p3);
        phList.add(p4);
        phList.add(p5);
        phList.add(p6);

        System.out.println(phList);
        Collections.sort(phList);
        System.out.println(phList);

        Set<Pharmacy> result = new HashSet<>();
        result.add(p1);
        result.add(p2);
        result.add(p3);
        result.add(p4);
        result.add(p5);
        result.add(p6);
        System.out.println(result.size());
    }
}