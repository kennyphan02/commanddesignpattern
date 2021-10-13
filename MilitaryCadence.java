/**
 * The MilitaryCadence class contains contents of 3 military cadences, Idontknow, everywhere, and inarmy.
 */
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MilitaryCadence {
    /**
    * Default constructor contains nothing as we do not need to put anything in it.
    */
    public MilitaryCadence(){}

    /**
     * Reads the file for Idontknow and prints out the contents of the text file. A line is printed then cleared after one second and moves on to 
     * the next line in the file.
     */
    public void singIDontKnow(){
        final String FILE_NAME = "/home/kenny/commanddesignpattern/idontknow.txt";
        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            scanner.close();
          } catch (FileNotFoundException e) {
            System.out.println("Sorry, we could not properly read the cadence file");
            e.printStackTrace();
          } catch(Exception e){
            e.printStackTrace();
          }
    }

    /**
     * Reads the file for everywherewego and prints out the contents of the text file. A line is printed then cleared after one second and moves on to 
     * the next line in the file.
     */
    public void singEverywhereWeGo(){
        final String FILE_NAME = "/home/kenny/commanddesignpattern/everywhere.txt";
        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            scanner.close();
          } catch (FileNotFoundException e) {
            System.out.println("Sorry, we could not properly read the cadence file");
            e.printStackTrace();
          } catch(Exception e){
            e.printStackTrace();
          }

    }
    /**
     * Reads the file for inarmy and prints out the contents of the text file. A line is printed then cleared after one second and moves on to 
     * the next line in the file.
     */
    public void singInArmy(){
        final String FILE_NAME = "/home/kenny/commanddesignpattern/inarmy.txt";
        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
            scanner.close();
          } catch (FileNotFoundException e) {
            System.out.println("Sorry, we could not properly read the cadence file");
            e.printStackTrace();
          } catch(Exception e){
            e.printStackTrace();
          }

    }
    
}
