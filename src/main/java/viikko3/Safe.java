package viikko3;

import java.util.ArrayList;

public class Safe {
    private ArrayList<String> safeFolder = new ArrayList<String>();
    private String pinCode;

    public Safe(String pinCode) {
        this.pinCode = pinCode;
    }
    public void changePin(String NewPin) {
        this.pinCode = NewPin;
    }
    public void addItem(String item) {
            safeFolder.add(item);   
    }
    public ArrayList<String> listItems(String pin) {
        if (pin.equals(this.pinCode)) {
            return safeFolder;
        } else {
            System.out.println("Väärä PIN-koodi!");
            return new ArrayList<>();
        }
    }
}