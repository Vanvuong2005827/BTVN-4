package core;

public class Book {
    private int maSach;
    private String tenSach;
    private String tenTacGia;
    private int namSanXuat;
    private String tomTatNoiDung;
    private Double giaTien;

    public Book() {}

    public Book(String tenSach, int maSach, String tenTacGia, int namSanXuat, String tomTatNoiDung, Double giaTien) {
        this.tenSach = tenSach;
        this.maSach = maSach;
        this.tenTacGia = tenTacGia;
        this.namSanXuat = namSanXuat;
        this.tomTatNoiDung = tomTatNoiDung;
        this.giaTien = giaTien;
    }

    public int getMaSach() {
        return maSach;
    }

    public Double getGiaTien() {
        return giaTien;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    public void setGiaTien(Double giaTien) {
        this.giaTien = giaTien;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    @Override
    public String toString() {
        return "Book{" +
                "maSach=" + maSach +
                ", tenSach='" + tenSach + '\'' +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", namSanXuat=" + namSanXuat +
                ", tomTatNoiDung='" + tomTatNoiDung + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }

    public void Display(){
        System.out.println(toString());
    }
}
