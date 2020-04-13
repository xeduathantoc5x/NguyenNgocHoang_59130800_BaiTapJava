/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenngochoang_59130800_baitapjava_bt1;

/**
 *
 * @author ngoc
 */
public class nhanVien {
    String ten;
    int tuoi;
    String diaChi;
    double tienLuong;
    int tongSoGioLam;

    public nhanVien() {}

    public nhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    

    public String getThongTin() {
        return "nhanVien{" + "ten = " + ten + ", tuoi = " + tuoi + ", diaChi = " + diaChi + ", tienLuong = " + tienLuong + ", tongSoGioLam = " + tongSoGioLam + '}';
    }
    
    public double tinhThuong(){
        double tienThuong;
        if(tongSoGioLam>=200)
            tienThuong = tienLuong*20/100;
        else if(tongSoGioLam<200 && tongSoGioLam>=100)
            tienThuong = tienLuong*10/100;
        else 
            tienThuong = 0;
        return tienThuong;
    }
    
}

