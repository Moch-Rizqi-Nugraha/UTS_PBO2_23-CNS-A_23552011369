
package com.mycompany.uts_pbo_2;

public class Ansuransi_jiwa extends Ansuransi {
       public Ansuransi_jiwa(int id, int umur) {
        super(id, umur);
    }

    @Override
    public double hitungPremi() {
        return umur * 3.0;
    }
}



    

