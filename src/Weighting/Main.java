package Weighting;

public class Main {
    public static void main(String args[]){
    Item soap = new Item("soap", 2);
    Item toothbrush = new Item("toothpaste", 1);
    Item socks = new Item("socks", 1);
    Item shirt = new Item("shirt", 2);
    Item pants = new Item("pants", 4);
    Item underwear = new Item("underwear", 1);
    Item sleepClothes = new Item("sleep clothes", 2);
    Item makeupKit = new Item("makeup kit", 10);
    Item dress = new Item("dress", 3);
    Item suit = new Item("suit", 8);
    Item laptop = new Item("laptop", 6);


    Suitcase smallSuitcase = new Suitcase(50);
    Suitcase largeSuitcase = new Suitcase(70);

    smallSuitcase.addItem(socks);
    smallSuitcase.addItem(toothbrush);
    smallSuitcase.addItem(sleepClothes);
    smallSuitcase.addItem(soap);
    smallSuitcase.addItem(makeupKit);
    smallSuitcase.addItem(dress);

    largeSuitcase.addItem(shirt);
    largeSuitcase.addItem(suit);
    largeSuitcase.addItem(laptop);
    largeSuitcase.addItem(underwear);
    largeSuitcase.addItem(pants);

    Hold cargo = new Hold(70);

    cargo.addSuitcase(smallSuitcase);
    cargo.addSuitcase(largeSuitcase);

    System.out.println("Items in small suitcase:");
    smallSuitcase.printItems();
    System.out.println("-");
    System.out.println("Total weight: " + smallSuitcase.totalWeight() + " kg");
    System.out.println("-----");
    System.out.println("Items in large suitcase:");
    largeSuitcase.printItems();
    System.out.println("-");
    System.out.println("Total weigth: " + largeSuitcase.totalWeight() + " kg");
    System.out.println("-----");
    System.out.println("Items in both suitcases: ");
    cargo.printItems();
    System.out.println("-");
    System.out.println("Combined weight of both suitcases: " + cargo.totalWeight() + " kg");
    
    }

}
