import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Files {

    public static int[] konsola() {
        Scanner scanner = new Scanner(System.in);
        int[] new_tab = new int[10];
        int tmp;
        for (int i = 0; i < new_tab.length; i++) {
            if(scanner.hasNextInt()){
                break;
            }
            tmp = scanner.nextInt();
            new_tab[i] = tmp;
        }
        return new_tab;
    }

    public static void doPliku(int[] tab) {
        try{
            File file = new File("text.txt");
            FileWriter filewrite = new FileWriter(file, true);
            for (int k = 0; k < 10; k++) {
                filewrite.write(tab[k] + "\n");
            }
            filewrite.close();
        } catch (IOException e){
                System.out.println(e);
            }
    }

    public static void main(String[] args) {
        try {
            doPliku(konsola());
        } catch (InputMismatchException e){
            System.out.println(e);
        }
    }
}
