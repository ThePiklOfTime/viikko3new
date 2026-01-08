package viikko3;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        


        while (!exit) {
            System.out.println("1) Näytä auton tila, \n2) Muokkaa auton merkkiä ja mallia, \n3) Kiihdytä autoa, \n4)Hidasta autoa \n0) Lopeta ohjelma");
            
            
            if(scanner.hasNext()){
                int i = Integer.parseInt(scanner.nextLine());
            
            switch (i) {
                case 1:
                    System.out.println("Mitä siili sanoo:");
                    String sanominen = scanner.nextLine();
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