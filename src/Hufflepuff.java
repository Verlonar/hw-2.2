public class Hufflepuff extends Hogwarts {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int witchcraft, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, witchcraft, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void printInfo() {
        super.printInfo();
        String separator = "\n";
        String sb = "industriousness = " + industriousness + separator +
                "loyalty = " + loyalty + separator +
                "honesty = " + honesty + separator;
        System.out.println(sb);
    }

    public void studentСomparison(Hufflepuff student) {
        if (this.getScore() >= student.getScore()) {
            System.out.println(getBestStudent(this, student));
        } else {
            System.out.println(getBestStudent(student, this));
        }
    }

    public int getScore() {
        return getWitchcraft()
                + getTransgression()
                + industriousness
                + loyalty
                + honesty;
    }

    private String getBestStudent(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        return super.getBestStudent(hufflepuff1, hufflepuff2);
    }
}
