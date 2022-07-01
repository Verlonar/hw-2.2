public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Harry Potter",72,14,2,92,2);
        Gryffindor hermioneGranger = new Gryffindor("Hermione Granger",52,9,23,35,31);
        Gryffindor ronWeasley = new Gryffindor("Ron Weasley",15,32,10,83,39);

        Slytherin dracoMalfoy = new Slytherin("Draco Malfoy",62,87,23,23,7,44, 24);
        Slytherin grahamMontagu = new Slytherin("Graham Montagu",50,37,44,44,45,21, 20);
        Slytherin gregoryGoyle = new Slytherin("Gregory Goyle",94,43,86,68,84,18, 53);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias Smith",2,16,43,2,34);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric Diggory",32,65,37,39,33);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley",57,61,66,15,6);

        Ravenclaw zhouChang = new Ravenclaw("Zhou Chang",31,83,54,20,24,35);
        Ravenclaw padmaPatil = new Ravenclaw("Padma Patil",9,38,78,79,25,87);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus Belby",74,98,18,54,34,34);

        harryPotter.printInfo();
        hermioneGranger.printInfo();
        ronWeasley.printInfo();
        dracoMalfoy.printInfo();
        grahamMontagu.printInfo();
        gregoryGoyle.printInfo();
        zachariasSmith.printInfo();
        cedricDiggory.printInfo();
        justinFinchFletchley.printInfo();
        zhouChang.printInfo();
        padmaPatil.printInfo();
        marcusBelby.printInfo();

        harryPotter.studentСomparison(hermioneGranger);
        harryPotter.studentСomparison(ronWeasley);

        dracoMalfoy.studentСomparison(grahamMontagu);
        dracoMalfoy.studentСomparison(gregoryGoyle);

        zachariasSmith.studentСomparison(cedricDiggory);
        zachariasSmith.studentСomparison(justinFinchFletchley);

        zhouChang.studentСomparison(padmaPatil);
        zhouChang.studentСomparison(marcusBelby);

    }
}