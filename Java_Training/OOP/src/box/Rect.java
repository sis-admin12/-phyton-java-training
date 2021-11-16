package box;

public class Rect {
    int L;
    int l;

    public void rect(int L, int l)
    {
        this.L=L;
        this.l=l;

    }

    public int perimetru()
    {
        return 2*L+2*l;
    }
    public int aria(){
        return L*l;
    }

}
