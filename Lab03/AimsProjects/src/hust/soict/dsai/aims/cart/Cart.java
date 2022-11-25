package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered =
            new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;
    public static final int MAX_LIMIT_ORDERED = 5;

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered == MAX_NUMBER_ORDERED){
            System.out.println("The cart is almost full");
        }else{
            itemsOrdered[qtyOrdered++] = disc;
            System.out.println(DigitalVideoDisc.getNbDigitalVideoDisc());
            System.out.println("The disc has been added");
        }
    }
//    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
//        for (int i = 0; i < dvdList.length; i++){
//            if (qtyOrdered < MAX_NUMBER_ORDERED){
//                itemsOrdered[qtyOrdered++] = dvdList[i];
//            }else {
//                System.out.println("The cart is almost full");
//                break;
//            }
//        }
//
//    }
    public void addDigitalVideoDisc(DigitalVideoDisc ...dvdList){
        for (int i = 0; i < dvdList.length; i++){
            if (qtyOrdered < MAX_NUMBER_ORDERED){
                itemsOrdered[qtyOrdered++] = dvdList[i];
            }else {
                System.out.println("The cart is almost full");
                break;
            }
        }

    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
        if (MAX_NUMBER_ORDERED - qtyOrdered >= 2) {
            itemsOrdered[qtyOrdered++] = dvd1;
            itemsOrdered[qtyOrdered++] = dvd2;
        }
        else if(MAX_NUMBER_ORDERED - qtyOrdered == 1){
            itemsOrdered[qtyOrdered++] = dvd1;
            System.out.println("Cannot add dvd2");
        } else {
            System.out.println("The cart is almost full");

        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        DigitalVideoDisc newItemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
        for (int i = 0, k = 0;i < qtyOrdered; i++){
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())){
                continue;
            }
            newItemsOrdered[k++] = itemsOrdered[i];

        }
        qtyOrdered--;
        itemsOrdered = newItemsOrdered;
    }

    public float totalCost () {
        float cost = 0;
        for (int i = 0;i < qtyOrdered; i++){
            cost += itemsOrdered[i].getCost();
        }
        return cost;
    }
    public void printCart(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0 ; i < qtyOrdered; i++){
            System.out.println(itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    public void searchDVDbyID(int id){
        for (int i = 0 ; i < qtyOrdered; i++){
            if(itemsOrdered[i].getId() == id){
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("no match is found.");
    }
    public void searchDVDbytitle(String title){
        for (int i = 0 ; i < qtyOrdered; i++){
            if(itemsOrdered[i].isMatch(title)){
                System.out.println(itemsOrdered[i].toString());
                return;
            }
        }
        System.out.println("no match is found.");
    }
}
