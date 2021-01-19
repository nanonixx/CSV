package Model;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class Naixement {

    @CsvBindByName
    String Codi_Districte;
    @CsvBindByName
    String Nom_Districte;
    @CsvBindByName
    String Codi_Barri;
    @CsvBindByName
    String Nom_Barri;
    @CsvBindByName
    String Lloc_de_naixement;
    @CsvBindByName
    String nombre;

    @Override
    public String toString() {
        return "Naixement{" +
                "Codi_Districte='" + Codi_Districte + '\'' +
                ", Nom_Districte='" + Nom_Districte + '\'' +
                ", Codi_Barri='" + Codi_Barri + '\'' +
                ", Nom_Barri='" + Nom_Barri + '\'' +
                ", Lloc_de_naixement='" + Lloc_de_naixement + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }





}
