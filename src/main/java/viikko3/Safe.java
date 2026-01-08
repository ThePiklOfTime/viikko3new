package viikko3;

import java.util.ArrayList;

public class Safe {
    private ArrayList<String> safeFolder;
    private String pinCode;

    public Safe(String pinCode) {
        this.pinCode = pinCode;
    }
    public void changePin(String NewPin) {
        this.pinCode = NewPin;
    }
    
}
