import characters.Character;


import java.io.BufferedWriter;
import java.io.FileWriter;


public class FileSystem {

    //metoda save
    public static void save(Character character)throws Exception{

        BufferedWriter bw = new BufferedWriter(new FileWriter("Character.csv",true));
        bw.write(Character.toCSV(character));
        bw.close();
    }


    //metoda import

    //toCsv





    //fromCsv

}
