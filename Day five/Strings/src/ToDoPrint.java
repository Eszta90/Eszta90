import java.util.ArrayList;

public class ToDoPrint {

    public static void main(String... args) {
        String todoText = " - Buy milk\n";

        ArrayList<String> list = new ArrayList<>();
        list.add("My todo\n");
        list.add(todoText);
        list.add(" - Download games\n");
        list.add("    - Diablo\n");

for(Object current:list) {
    System.out.println(current);
}
        //System.out.println(list);


        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));

    }
}




        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
