public class Hogwarts {

    private String name;
    private int witchcraft;
    private int transgression;

    public Hogwarts(String name, int witchcraft, int transgression) {
        this.name = name;
        this.witchcraft = witchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWitchcraft() {
        return witchcraft;
    }

    public void setWitchcraft(int witchcraft) {
        this.witchcraft = witchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void printInfo() {
        String separator = "\n";
        String sb = name + ":" + separator +
                "witchcraft = " + witchcraft + separator +
                "transgression = " + transgression;
        System.out.println(sb);
    }

    public String getBestStudent(Hogwarts student1, Hogwarts student2) {
        return student1.getName() +
                " better "
                + student1.getClass().getName()
                + " than "
                + student2.getName();
    }
}
