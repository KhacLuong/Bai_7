package com.qlsv.thongtinsinhvien;

import java.util.Scanner;

public class SinhVien {
        private String fullName;
        private int age;
        private String address;
        private int birth_years;
        private String gender;
        private String tel;
        private String fb_link;

        Scanner  scanner = new Scanner(System.in);

        public void input(){
            System.out.println("enter Fullname: ");
            fullName = scanner.nextLine();
            System.out.println("enter Age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter address: ");
            address = scanner.nextLine();
            System.out.println("enter Birth_years: ");
            birth_years = scanner.nextInt();
            scanner.nextLine();
            System.out.println("enter Gender: ");
            gender = scanner.nextLine();
            System.out.println("enter telephone: ");
            tel = scanner.nextLine();
            System.out.println("enter fb_link: ");
            fb_link = scanner.nextLine();
        }
        public void output(){
            System.out.printf("Fullname: %s\n Age: %d\n Address: %s\n Birth_years: %d\n " +
                    "Gender: %s\n Telephone: %s\n Fb_link: %s", fullName,age,address,birth_years,gender,tel,fb_link);
        }
         public void outputNameAndByears(){
        System.out.printf("Fullname: %s\n  Birth_years: %d", fullName,birth_years);

        }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getB_link() {
        return fb_link;
    }

    public void setB_link(String b_link) {
        this.fb_link = b_link;
    }

    public int getBirth_years() {
        return birth_years;
    }

    public void setBirth_years(int birth_years) {
        this.birth_years = birth_years;
    }
}
