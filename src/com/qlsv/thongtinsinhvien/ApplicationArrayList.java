package com.qlsv.thongtinsinhvien;
import com.qlsv.thongtinsinhvien.SinhVien;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList sinhviens = new ArrayList();
        int choice =0;
        int count =0;

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
            switch(choice){
                case 1: {
                    System.out.printf("nhap rhong tin sinh vien thu %d", count+1);
                    SinhVien sv = new SinhVien();
                    sv.input();
                    sinhviens.add(sv);
                    break;
                }
                case 2: {
                    System.out.println("danh sach sinh vien");
//                    for(int i = 0; i < sinhviens.size(); i++) {
//                        //Object o = sinhviens.get(i);
//                        //SinhVien _sv = (SinhVien)o;
//                        SinhVien _sv = (SinhVien)sinhviens.get(i);
//                        _sv.output();
//                        k++;
//                    }
                    for(Object ojb : sinhviens){
                        SinhVien _sv = (SinhVien)ojb;
                        _sv.output();
                    }
                    break;
                }
                case 3: {
                    int k=0;
                    for(Object ojb : sinhviens){
                        SinhVien _sv = (SinhVien)ojb;
                        if(_sv.getBirth_years()>1993){
                            _sv.outputNameAndByears();
                            k++;
                        }
                    }


                    if(k==0){
                        System.out.println(" khong co sinh vien nao sinh sau nam 1993");
                    }
                   break;

                }
                case 4: {
                    int k=0;
                    System.out.println(" nhap ten sinh vien can tim");
                    scanner.nextLine();
                    String name = scanner.nextLine();
//                    for(int i = 0; i < sinhviens.size(); i++) {
//                        //Object o = sinhviens.get(i);
//                        //SinhVien _sv = (SinhVien)o;
//                        SinhVien _sv = (SinhVien)sinhviens.get(i);
//                        if(_sv.getFullName().equals(name)){
//                            _sv.output();
//                            k++;
//                        }
//
//                    }
                    for (Object ojb : sinhviens){
                        SinhVien _sv = (SinhVien)ojb;
                        if(_sv.getFullName().equals(name)){
                            _sv.output();
                            k++;
                        }
                    }
                    if(k==0) {
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

        }while(choice !=5);
    }
}
