public class ReversibleInt implements Reversible {

    public int wpisanieInt;

    public ReversibleInt(int wpisanieInt) {

        this.wpisanieInt = wpisanieInt;

    }


    @Override
    public void reverse() {
        wpisanieInt *= -1;
    }
    public String toString(){
        return wpisanieInt + "";
    }

}






