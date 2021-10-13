import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MilitaryCadence {
    public MilitaryCadence(){}
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
