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
public class NguyenNgocHoang_59130800_BaiTapJava_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nhanVien nV1 = new nhanVien("Lê Kim Hùng",30,"2 Ngô Tất Tố Nha Trang",7000000,355);
        nhanVien nV2 = new nhanVien("Nguyễn Đức Anh",22,"15 Nguyễn Đình Chiểu Nha Trang",400000,450);
        System.out.println(nV1.getThongTin());
        System.out.println(nV2.getThongTin());
    }
    
}
