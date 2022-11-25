package hust.soict.dsai.aims.disc;


//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
//        DigitalVideoDisc CinderellaDVD = new DigitalVideoDisc("Cinderella");
//
//        swap(jungleDVD, CinderellaDVD);
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//        System.out.println("Cinderella dvd title: " + CinderellaDVD.getTitle());
//
//        changeTitle(jungleDVD, CinderellaDVD.getTitle());
//        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//    }
//
//
////    private static void swap(DigitalVideoDisc jungleDVD, DigitalVideoDisc cinderellaDVD) {
////        // TODO Auto-generated method stub
////
////    }
////    public static void swap(Object o1, Object o2) {
////        Object tmp = o1;
////        o1 = o2;
////        o2 = tmp;
//
//    }
//    public static void changeTitle(DigitalVideoDisc dvd, String title) {
//        String oldTitle = dvd.getTitle();
//        dvd.setTitle(title);
//        dvd = new DigitalVideoDisc(oldTitle);
//    }
//
//}
class ObjectWrapper {
    DigitalVideoDisc object;
    ObjectWrapper(DigitalVideoDisc object) {

        this.object = object;
    }
}

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        ObjectWrapper objectWrapper1 = new ObjectWrapper(jungleDVD);
        ObjectWrapper objectWrapper2 = new ObjectWrapper(cinderellaDVD);

        swap(objectWrapper1, objectWrapper2);
        System.out.println("Jungle dvd title: " + objectWrapper1.object.getTitle());
        System.out.println("Cinderella dvd title: " + objectWrapper2.object.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(ObjectWrapper o1, ObjectWrapper o2) {
        DigitalVideoDisc tmp = o1.object;
        o1.object = o2.object;
        o2.object = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {

        dvd.setTitle(title);

    }
}


