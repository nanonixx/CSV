import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CSVNaixementParser parser = new CSVNaixementParser();
        Menu menu = new Menu();


        menu.start(parser.parse());

    }
}
