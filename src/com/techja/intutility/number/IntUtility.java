package com.techja.intutility.number;

public class IntUtility {
    private int soN;

    public IntUtility(int soN) {
        this.soN = soN;
    }

    // tinh tong day so
    public void printSumFrom1ToN () {
        int tong = 0;

        for (int i = 1; i <= soN; i++) {
            tong += i;
        }

        System.out.println("Tong cac so tu 1 den " + soN + " la Sum = " + tong);
    }

    // kiem tra so nguyen to
    public void checkPrime() {
        if (soN < 2) {
            System.out.println("So " + soN + " khong phai la so nguyen to");

            return;
        }

        boolean isPrime = true;
        for (int so = 2; so <= soN / 2; so++) {
            if (soN % so == 0) {
                isPrime = false;

                break;
            }
        }

        String kq = soN + (isPrime ? " la so nguyen to" : " khong phai la so nguyen to");

        System.out.println(kq);
    }

    // in ra cac so chan
    public void printEvenNumber() {
        System.out.print("Cac so chan: ");

        for (int i = 1; i < soN; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    // in ra các số mà soN chia hết
    public void printDivider() {
        System.out.print("Cac so ma " + soN + " chia het: ");

        for (int i = 1; i < soN; i++) {
            if (soN % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public void checkSymmetry() {
        int soTmp = soN;
        int soMoi = 0;

        while (soTmp > 0) {
            int chuSo = soTmp % 10;

            soMoi = soMoi * 10 + chuSo;
            soTmp = soTmp / 10;
        }

        String kq = soN + (soMoi == soN ? " la so doi xung" : " khong phai la so doi xung");
        System.out.println(kq);
    }

    // in ra số có nhiều ước nhất
    public void findGCDivisor() {
        int soUocLN = 0;
        int soThoaMan = 0;
        String dsCacSo = "";

        for (int soI = 1; soI <= soN; soI++) {
            int slUoc = demSoUoc(soI);

            if (slUoc > soUocLN) {
                soThoaMan = soI;
                soUocLN = slUoc;
                dsCacSo = soThoaMan + "";
            } else if (slUoc == soUocLN) {
                dsCacSo += "," + soI;
            }
        }

        System.out.println("So co nhieu uoc nhat la: " + dsCacSo);
        System.out.println("So luong uoc: " + soUocLN);
    }

    private int demSoUoc(int soI) {
        if (soI == 1) {
            return 1;
        }

        int dem = 2;

        for (int i = 2; i <= soI / 2; i++) {
            if (soI % i == 0) {
                dem ++;
            }
        }

        return dem;
    }
}
