package com.example.ktncbaitest.buoi9;

public class Bai1Service {

    public float avg(float diemToan, float diemVan, float diemAnh) {
        if (diemAnh > 10 || diemAnh < 0 || diemToan < 0 || diemVan < 0 || diemToan > 10 || diemVan > 10) {
            throw new IllegalArgumentException("Điểm không hợp lệ");
        }
        return (diemAnh + diemToan * 2 + diemVan * 2) / 5;
    }

    public int tongChan(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Số n không hợp lệ");
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (i == 6) {
                continue;
            }
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Bai1Service service = new Bai1Service();
        System.out.println(service.avg(0, 0, 0));
        System.out.println(service.avg(10, 10, 10));

        System.out.println();
    }

}
