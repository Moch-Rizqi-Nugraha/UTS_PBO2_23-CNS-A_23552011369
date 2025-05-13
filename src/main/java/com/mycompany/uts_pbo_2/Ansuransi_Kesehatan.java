
package com.mycompany.uts_pbo_2;

public class Ansuransi_Kesehatan extends Ansuransi {
    public Ansuransi_Kesehatan(int id, int umur) {
        super(id, umur);
    }

    @Override
    public double hitungPremi() {
        return umur * 2.5;
    }
}




    

