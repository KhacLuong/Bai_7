package com.qlsv.app;

import com.qlsv.thongtinsinhvien.SinhVien;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so luong sinh vien");
        int n =scanner.nextInt();
        SinhVien[] sinhViens = new SinhVien[n];
        int count =0;
        int choice =0;
        do {
            System.out.println("lua chon theo huong dan duoi day");
            System.out.println("chon 1: them sinh vien");
            System.out.println("chon 2: hien thi ten va sdt cua sinh vien");
            System.out.println("chon 3: hien thi sinh co nam sinh >1993");
            System.out.println("chon 4: tim theo ten sinh vien");
            System.out.println("chon 5: thoat ra");
            System.out.println("---------------");
            System.out.println("nhap lua chon cua ban");
            System.out.println("Nhap lua cho ? ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:{
                    if(count<n-1){
                        System.out.printf("nhap rhong tin sinh vien thu %d", count+1);
                        SinhVien sv = new SinhVien();
                        sv.input();
                        sinhViens[count++] =sv;
                    }
                    else{
                        System.out.println("Da du so luong sinh vien");
                    }
                    break;
                }

                case 2:{
                    System.out.println("danh sach sinh vien");
                    for (SinhVien _sv:sinhViens) {
                        _sv.output();
                        System.out.println();
                    }
                    break;
                }

                case 3:{
                    int k=0;
                    for (SinhVien _sv :sinhViens) {
                        if(_sv.getBirth_years()>1993){
                            _sv.outputNameAndByears();
                            k++;
                        }
                    }
                        if(k==0){
                            System.out.println("khong co sinh vien nao co nam sinh >1993");
                        }
                    break;
                }

                case 4: {
                    System.out.println("nhap ten sinh vien");
                    String name = scanner.nextLine();
                    int k=0;
                    for(SinhVien _sv: sinhViens){
                        if(_sv.getFullName().equals(name)){
                            _sv.output();
                            k++;
                        }
                    }
                    if(k==0){
                        System.out.printf("khong co sinh vien nao ten %s", name);
                    }
                    break;
                }
                case 5: {
                    System.out.println(" ban da thoat ra");
                    break;
                }
                default:{
                    System.out.println(" vui long chon tu 1-5, moi ban chon lai");
                }


            }
        }while (choice !=5);

        }
}
