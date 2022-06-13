

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> new1 = new ArrayList<>();
        new1.add("Thato");
        new1.add("Radha");
        new1.add("Rambuda");
        new1.add("Mark");
        new1.add("Keletso");
        new1.add("Tata");
        new1.add("Nkosi");

        for (int i=0; i<new1.size();i++){
            System.out.println(new1.get(i));
        }
        System.out.println("*********************************Remove Mark and print***************************************************");

        new1.remove("Mark");
        for (int i=0; i<new1.size();i++){
            System.out.println((new1.get(i)));
        }
        System.out.println("******************************Add Jacob to second position***********************************************");
        new1.add(1, "Jacobs");

        for (int i=0; i<new1.size();i++){
            System.out.println(new1.get(i));
        }
        System.out.println("******************************Remove an element********************************");

        new1.remove(4);
        for(int i=0; i<new1.size();i++){
            System.out.println(new1.get(i));
        }


    }

    }
