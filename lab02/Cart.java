package lab02;

//import main1.DigitalVideoDisc;

public class Cart {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_ORDERED = 20;
	
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == MAX_NUMBER_ORDERED) {
			System.out.println("The cart full");
		}
		else {
			itemsOrdered[qtyOrdered++] = disc;
			System.out.println("The cart unfull");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		DigitalVideoDisc newItemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
        for (int i = 0, k = 0; i < qtyOrdered; i++){
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

}
