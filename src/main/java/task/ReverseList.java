package task1;

import java.util.ArrayList;

public class ReverseList {
    public static void main (String[] args) {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Magdalena");
        name.add("Patrycja");
        name.add("Aleksandra");
        name.add("Katarzyna");

        System.out.println(name);

        ArrayList <String> name2 = new ArrayList<String>();

        for (int n=0; n<name.size(); n++){

            name2.add(name.get(name.size()-(n+1)));
        }
        System.out.println(name2);

    }

}
