package pharmacy;

public class Component implements Comparable<Component>{

    private String name;
    private String weight;
    private int power;

    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Component o) {
//        if(this.power > o.power) return 1;
//        else if(this.power < o.power) return -1;
//        else return 0;
//        return Integer.compare(this.power, o.power);

//        if(this.name.compareTo(o.name) > 0) return 1;
//        else if(this.name.compareTo(o.name) < 0) return -1;
//        else return 0;
        return Integer.compare(this.name.compareTo(o.name), 0);
    }
}
