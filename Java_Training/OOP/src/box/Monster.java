package box;

public class Monster {
    int ochi;
    int maini;
    public int picioare;

    public Monster() {
        ochi = 2;
        maini = 2;
        picioare = 2;
    }

    public Monster(int ochi) {
        this.ochi = ochi;
        maini=2;
        picioare=2;
    }

    public Monster(int ochi, int maini) {
        this.ochi = ochi;
        this.maini = maini;
        picioare=2;
    }

    public Monster(int ochi, int maini, int picioare) {
        this.ochi = ochi;
        this.maini = maini;
        this.picioare = picioare;
    }

    public void voice(){
        System.out.println("Gaf");
    }
    public void voice(int i){
        for(int j=0; j<i; j++) {
            System.out.println("Gaf");
        }
    }

    public void voice(int i, String b){
        for(int j=0; j<i; j++) {
            System.out.println(b);
        }
    }
}
