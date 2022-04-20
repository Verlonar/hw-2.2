public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int witchcraft, int transgression, int nobility, int honour, int bravery) {
        super(name, witchcraft, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        String separator = "\n";
        String sb = "nobility = " + nobility + separator +
                "honour = " + honour + separator +
                "bravery = " + bravery + separator;
        System.out.println(sb);
    }

    public void studentСomparison(Gryffindor student) {
        if (this.getScore() >= student.getScore()) {
                System.out.println(getBestStudent(this, student));
        } else {
            System.out.println(getBestStudent(student, this));
        }
    }

    public int getScore() {
        return getWitchcraft()
                + getTransgression()
                + nobility
                + honour
                + bravery;
    }

    private String getBestStudent(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        return super.getBestStudent(gryffindor1, gryffindor2);
    }
}
