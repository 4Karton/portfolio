public class ReversibleString implements Reversible {

    public String wpisanieString;

    public ReversibleString(String wpisanieString) {

        this.wpisanieString = wpisanieString;

    }


    @Override
    public void reverse() {



        char[] chars = wpisanieString.toCharArray();
        for (int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (Character.isUpperCase(c)){
                chars[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)){
                chars[i] = Character.toUpperCase(c);
            }
        }
        wpisanieString = new String(chars);
    }
    public String toString(){
        return wpisanieString;
    }

}
