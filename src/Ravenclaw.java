public class Ravenclaw extends Hogwarts {

    private int mind;
    private int wisdom;
    private int wit;
    private int creation;

    public Ravenclaw(String name, int witchcraft, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, witchcraft, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public void printInfo() {
        super.printInfo();
        String separator = "\n";
        String sb = "mind = " + mind + separator +
                "wisdom = " + wisdom + separator +
                "wit = " + wit + separator +
                "creation = " + creation + separator;
        System.out.println(sb);
    }

    public void studentСomparison(Ravenclaw student) {
        if (this.getScore() >= student.getScore()) {
            System.out.println(getBestStudent(this, student));
        } else {
            System.out.println(getBestStudent(student, this));
        }
    }

    public int getScore() {
        return getWitchcraft()
                + getTransgression()
                + mind
                + wisdom
                + wit
                + creation;
    }

    private String getBestStudent(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        return super.getBestStudent(ravenclaw1, ravenclaw2);
    }
}
