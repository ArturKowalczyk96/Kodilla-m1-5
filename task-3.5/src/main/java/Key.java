public class Key {
    Integer key;

    public Key(Integer key){
        this.key = key;
    }

    public Integer getKey(){
        return key;
    }
    public String toString(){
        return "Key: " + key;
    }

    //Override hashCode()
    @Override
    public int hashCode(){
        if (key >= 0 && key <= 39){
            return 0;
        }
        if (key >= 40 && key <= 79){
            return 1;
        }
        if (key >= 80 && key <= 119){
            return 2;
        }
        if (key >= 120 && key <= 159){
            return 3;
        }
        if (key >= 160 && key <= 199){
            return 4;
        }
        if (key >= 200 && key <= 239){
            return 5;
        }
        if (key >= 240 && key <= 279){
            return 6;
        }
        if (key >= 280 && key <= 319){
            return 7;
        }
        if (key >= 320 && key <= 359){
            return 8;
        }
        if (key >= 360 && key <= 399){
            return 9;
        }
        return key;
    }
}
