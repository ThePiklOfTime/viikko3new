package viikko3;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);



        while (!exit) {
            System.out.println("1) Aseta PIN-koodi \n2) Lisää tietoja kansioon \n3) Listaa Tiedot kansiosta, \n0) Lopeta ohjelma");
            
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
            
            switch (i) {
                case 1:
                    
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