/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyenngochoang_59130800_baitapjava_bt2;

/**
 *
 * @author ngoc
 */
public class NguyenNgocHoang_59130800_BaiTapJava_BT2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        
        nhanVien nV1 = new nhanVien("Lê Kim Hùng",30,"2 Ngô Tất Tố Nha Trang",7000000,355);
        nhanVien nV2 = new nhanVien("Nguyễn Đức Anh",22,"15 Nguyễn Đình Chiểu Nha Trang",400000,450);
        nhanVien nV3 = new nhanVien("Đình Thắng", 25, "15 Nguyễn Huệ Tuy Hòa", 3230000, 270);
        nhanVien nV4 = new nhanVien("Nguyễn Thị Mỹ Duyên", 23, "65 Trần Phú Nha Trang", 5500000, 180);
        nhanVien nV5 = new nhanVien("Văn Sảng", 30, "5 Yersin Nha Trang", 1250000, 400);
        
        System.out.println(nV1.getThongTin());
        System.out.println(nV2.getThongTin());
        
        qlnv.them(nV3);
        qlnv.them(nV4);
        qlnv.them(nV5);
        
        qlnv.inDS();
    }
    
}
