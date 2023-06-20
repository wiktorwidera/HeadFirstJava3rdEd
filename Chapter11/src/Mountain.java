public class Mountain {
    public String name;
    public int height;

    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }
    public String toString() {
        return name + " " + height;
    }
}
