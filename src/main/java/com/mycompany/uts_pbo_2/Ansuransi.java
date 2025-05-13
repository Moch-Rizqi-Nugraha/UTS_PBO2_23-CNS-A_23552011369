
package com.mycompany.uts_pbo_2;

public class Ansuransi extends Layanan_ansuransi {



    protected int id;
    protected int umur;
    
public interface IAnsuransi {
    double hitungPremi();
    String getJenis();
}

    public Ansuransi(int id, int umur) {
        this.id = id;
        this.umur = umur;
    }

    public int getId() {
        return id;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double hitungPremi() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}


    

