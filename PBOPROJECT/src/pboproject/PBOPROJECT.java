/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboproject;

import db.BarangModel;
import db.DBHelper;
import db.MakananModel;
import db.PenjualanModel;

/**
 *
 * @author Praktikan
 */
public class PBOPROJECT {
    private static Object DBHelper;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBHelper.getConnection();
        BarangModel bm = new BarangModel();
        //nambahin kodingan
//        brg.updBarang(brg);
//        bm.addBarang(bm);
        //hapus barang
//        bm.deleteBarang(brg);
//                
//namnah makananan
//        MakananModel mm = new MakananModel();
//       Makanan mkn = new Makanan("2", "nama makanan",1000,1,0,3);
//        //nambahin makanana
//        mkn.updMakanan(mkn);
//        mkn.addMakanan(mkn);
//        //hapus makanan
//        mm.deleteMakanan(mkn);

//nambah penjualan
//        PenjualanModel pjln = new PenjualanModel();
//        Penjualan pjl = new Penjualan(2,1,10 nama makanan);
//        //nambahin penjualan
//        pjl.updPenjualan(pjl);
//        pjl.addPenjualan(pjl);
//        //hapus penjualan
//        pjln.deletePenjualan(pjln);         


    }
//
//    private static class barang {
//
//        public barang(String string, int i, String nama_barang, int i0, int i1, int i2) {
//        }
//    }

}