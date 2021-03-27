public class InteiroSet {
    private boolean[]   conjunto;

    public InteiroSet(boolean [] conjunto){
        this.conjunto = conjunto;
    }

    public InteiroSet(){
        conjunto = new boolean[101];
    }
    public InteiroSet union(InteiroSet conjunto2){
        boolean[] conjuntoRet = new boolean[101];
        for (int i = 0; i < 101;i++){
           conjuntoRet[i] = conjunto2.getConjunto()[i] || this.conjunto[i] ;

        }
        return new InteiroSet(conjuntoRet);
    }

    public InteiroSet interseccion(InteiroSet conjunto2){
        boolean[] conjuntoRet = new boolean[101];
        for (int i = 0; i < 101;i++){
            conjuntoRet[i] = conjunto2.getConjunto()[i] && this.conjunto[i] ;

        }
        return new InteiroSet(conjuntoRet);
    }

    public boolean ehIgualTo(InteiroSet conjunto2)
    {
        for (int i = 0; i < 101;i++){
            if (this.conjunto[i] != conjunto2.conjunto[i]){
                return false;
            }
        }
        return true;
    }

    public String toSetString(){
        StringBuffer    ret = new StringBuffer();
        for (int i = 0; i < 101;i++){
            if (this.conjunto[i]){
                ret = ret.append(i).append(" ");
            }
        }
        if (ret.length() == 0){
            ret = ret.append("-");
        }
        return ret.toString();
    }

    public void insertElement(int element){
        if (element < 101){
            conjunto[element] = true;
        }
    }

    public void deleteElement(int element){
        if (element < 101){
            conjunto[element] = false;
        }
    }

    public boolean[] getConjunto() {
        return conjunto;
    }

    public void setConjunto(boolean[] conjunto) {
        this.conjunto = conjunto;
    }
}
