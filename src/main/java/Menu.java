import Model.Naixement;
import com.opencsv.bean.CsvToBean;

import java.util.Scanner;

public class Menu {

    Scanner input = new Scanner(System.in);

    void start(CsvToBean<Naixement> naixementCsvToBean) {

        String menu = "";

        while (!(menu.equals("0"))){
        System.out.println("\n1.  Naixements al barri del Poblenou");
        System.out.println("2.  Número de naixements de mares nascudes al Marroc ");
        System.out.println("3.  Naixements als districtes amb la paraula \"Sant\" al seu nom");
        System.out.println("4.  Naixements de mares nascudes a països que comencen per 'A'");
        System.out.println("5.  Comprovar si van haver naixements al 2019 a un barri concret de Barcelona");
        System.out.println("\n0. Sortir");

        menu = input.nextLine();
        CsvToBean<Naixement> llista = naixementCsvToBean;

        switch(menu){
            case "1":
                llista.stream()
                        .filter(naixement -> naixement.getNom_Barri().equals("el Poblenou"))
                        .forEach(System.out::println);
                break;

            case "2":
                System.out.println(llista.stream()
                        .filter(naixement -> naixement.getLloc_de_naixement().contains("Marroc, el"))
                        .count());
                break;

            case "3":
                llista.stream()
                        .filter(naixement -> naixement.getNom_Districte().contains("Sant"))
                        .forEach(System.out::println);
                break;

            case "4":
                llista.stream()
                        .filter(naixement -> naixement.getLloc_de_naixement().contains("A"))
                        .forEach(System.out::println);
                break;

            case "5":
                System.out.print("Nom del barri: ");
                String barri = input.nextLine();
                System.out.println(llista.stream()
                        .anyMatch(naixement -> naixement.getNom_Barri().equals(barri)));

                break;

        }
    } }
}
