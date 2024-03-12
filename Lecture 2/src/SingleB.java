public class SingleB extends SingleA {
    private String name;
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    void getInfo() {
        System.out.println(this.getId() + " " + this.getName());
    }
}
