package pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Comparable<Pharmacy> {
    private int index;
    private int totalPower;
    private final List<Component> components;

    public Pharmacy(){
        this.totalPower = 0;
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("No arguments");
        else {
            Collections.addAll(this.components, components);
            totalPower = getTotalPower();
        }
    }
    private int getTotalPower(){
        int result = 0;
        while (hasNext()){
            result += next().getPower();
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }

    @Override
    public int compareTo(Pharmacy o) {
        return Integer.compare(this.totalPower, o.totalPower);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "totalPower=" + totalPower +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List<Component> thisTemp = components;
        List<Component> oTemp = ((Pharmacy)o).components;
        Collections.sort(thisTemp);
        Collections.sort(oTemp);;
        return Objects.equals(thisTemp, oTemp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components.size() * 69 + totalPower);
    }
}

