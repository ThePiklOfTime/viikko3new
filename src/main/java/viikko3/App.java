package viikko3;

import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        Safe safe = new Safe("0000");


        while (!exit) {
            System.out.println("1) Aseta PIN-koodi \n2) Lisää tietoja kansioon \n3) Listaa tiedot kansiosta \n0) Lopeta ohjelma");
            
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Anna uusi PIN-koodi:");
                    String newPin = scanner.nextLine();
                    safe.changePin(newPin);
                    break;
                case 2:
                    System.out.println("Anna kansioon lisättävä tieto:");
                    String item = scanner.nextLine();
                    safe.addItem(item);
                    break;
                case 3:
                    System.out.println("Anna PIN-koodi:");
                    String pin = scanner.nextLine();
                    ArrayList<String> safeItems = safe.listItems(pin);

                    for (String safeItem : safeItems) {
                        System.out.println(safeItem);
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                
                default:
                    System.out.println("Syöte oli väärä");
                    break;
            
            
                }
        }
    }
    System.out.println("Kiitos ohjelman käytöstä.");
    scanner.close();
    }
}