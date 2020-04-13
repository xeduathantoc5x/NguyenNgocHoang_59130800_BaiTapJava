/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenngochoang_59130800_baitapjava_bt2;

import java.util.ArrayList;

/**
 *
 * @author ngoc
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<nhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList();
    }

    @Override
    public void them(nhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for(int i = 0; i < dsNhanVien.size(); i++){
            System.out.println(' ' + dsNhanVien.get(i).getThongTin());
        }
    }
    
}
