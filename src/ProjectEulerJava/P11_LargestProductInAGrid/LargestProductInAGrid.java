package ProjectEulerJava.P11_LargestProductInAGrid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestProductInAGrid {

    public static void main(String[] args) throws IOException {

        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String file = console.readLine();
        file = "./ProjectEulerJava/P11_LargestProductInAGrid/theGrid.txt";


        ArrayList<List<String>> gridRows = convertRowsToList(file);

        for(List l: gridRows) {
            System.out.println(l);
        }

    }

    public static ArrayList<List<String>> convertRowsToList(String file) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(file));
        ArrayList<List<String>> gridRows = new ArrayList<>();
        while (fileReader.ready()) {
            String[] rowArray = fileReader.readLine().split(" ");
            List<String> rowAsList = Arrays.asList(rowArray);
            gridRows.add(rowAsList);
        }
        fileReader.close();
        return gridRows;
    }



}
