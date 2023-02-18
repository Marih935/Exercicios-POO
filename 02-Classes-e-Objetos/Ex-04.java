//Exercise: reconstruct the code snippets to make a working Java program that produces the output listed below.
//Output: bang bang ba-bang
//        ding ding da-ding

class DrumKit{

    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
}

class DrimKitTestDrive{
    public static void main (String [] args){
        
        DrumKit d = new DrumKit();
        if(d.snare == true){
            d.playSnare();
        }
        d.snare = false;
        d.playTopHat();
    }
}