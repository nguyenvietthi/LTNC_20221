package bai1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        if (!file.exists()) {
            System.out.println("data.txt File Not Found");
            System.exit(0);
        }

        try (
            Scanner input = new Scanner(file);
        ){
            List <String> listString = new ArrayList<>();
            while(input.hasNext()){
                String string = input.next();
                listString.add(string);
            }
            Collections.sort(listString);
            System.out.println(listString);
            Collections.sort(listString, Collections.reverseOrder());
            System.out.println(listString);
        }
    }
    
}