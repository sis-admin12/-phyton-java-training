package Colection;

public class MyColection {
    private String[] colectiv= new String[10];
    private int size=0;

    public void addname(String name){
        colectiv[size]=name;
        size++;
        if(size==colectiv.length){
            String[] Newcolectiv = new String[size*2];
            for (int i=0; i<colectiv.length; i++) {
                Newcolectiv[i] = colectiv[i];
            }
            colectiv=Newcolectiv;
        }

    }

    public void deletename(int index){
        if(index>=0 && index<size) {
            for (int i = index; i < size - 1; i++) {

                colectiv[i] = colectiv[i + 1];

            }
            size--;
        }
    }

    public void deletename(String name){
        int index=-1;
        for (int i=0; i<size; i++){
            if(name.equals(colectiv[i])){
                index=i;
                break;
            }
        }if(index != -1){
            deletename(index);
        }
    }


    public int getSize() {
        return size;
    }

    public String get(int index){
        if(index>=0 && index<size) {
            return colectiv[index];
        }else{
            return "Nu exista asa element";
        }
    }
}
