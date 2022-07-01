public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int witchcraft, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, witchcraft, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public void printInfo() {
        super.printInfo();
        String separator = "\n";
        String sb = "cunning = " + cunning + separator +
                "determination = " + determination + separator +
                "ambition = " + ambition + separator +
                "resourcefulness = " + resourcefulness + separator +
                "lustForPower = " + lustForPower + separator;
        System.out.println(sb);
    }

    public void studentСomparison(Slytherin student) {
        if (getScore() >= student.getScore()) {
            System.out.println(getBestStudent(this, student));
        } else {
            System.out.println(getBestStudent(student, this));
        }
    }

    public int getScore() {
        return getWitchcraft()
                + getTransgression()
                + cunning
                + determination
                + ambition
                + resourcefulness
                + lustForPower;
    }

    private String getBestStudent(Slytherin slytherin1, Slytherin slytherin2) {
        return super.getBestStudent(slytherin1, slytherin2);
    }
}
