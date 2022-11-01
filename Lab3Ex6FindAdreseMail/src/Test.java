import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test {

    public static void main( String args[] ) {
        // String to be scanned to find the pattern.
        String line = "This ceva2@gmail.com order was placed ceva@gmail.com for QT3000! OK?";
        String pattern = "[a-z0-9]+@gmail.com";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );


        }else {
            System.out.println("NO MATCH");
        }







        //File path = new File("D:\\Anul4\\An4Sem1 IngineriaProgramarii\\WorkJava\\Lab3Ex6FindAdreseMail");

        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);

                Pattern p  = Pattern.compile(pattern);
                Matcher my_match = p.matcher(data);

                //verif daca am gasit ceva, fara acest schelet nu merge, neam
                if (my_match.find( )) {
                    System.out.println("Found value: " + my_match.group(0) );


                }else {
                    System.out.println("NO MATCH");
                }

            }
            myReader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println();


    }
}
