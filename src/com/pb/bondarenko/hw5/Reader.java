package com.pb.bondarenko.hw5;

import java.util.Arrays;

public class Reader {
    private String fio;
    private int numReadTicket;
    private String department;
    private int birthDate;
    private String phone;

    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public int getNumReadTicket() {
        return numReadTicket;
    }
    public void setNumReadTicket(int numReadTicket) {
        this.numReadTicket = numReadTicket;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

   void takeBook(int countBook){
       System.out.println(this.fio + " взял "+ countBook+" книг(и)");
   }

   void takeBook (String... listBook){
    StringBuilder mergeList = new StringBuilder();
         for (int i=0; i< listBook.length; i++){
             mergeList.append(listBook[i]);
            if (i< (listBook.length-1)) {
                mergeList.append(", ");
            }
    }
        System.out.println(this.fio+" взял книги: " +mergeList);

}
    void takeBook (Book... allBooks){
    StringBuilder mergeList = new StringBuilder();
    for (int i=0; i< allBooks.length; i++) {
        mergeList.append(allBooks[i].getTitle()+" ("+ allBooks[i].getAuthor()
                +" " + allBooks[i].getYear()+" г.) ");

    }
    System.out.println(this.fio+" взял книги: " +mergeList);
}
    void returnBook(int countBook){
        System.out.println(this.fio + " вернул "+ countBook+" книг(и)");
    }

    void returnBook (String... listBook){
        StringBuilder mergeList = new StringBuilder();
        for (int i=0; i< listBook.length; i++){
            mergeList.append(listBook[i]);
            if (i< (listBook.length-1)) {
                mergeList.append(", ");
            }
        }
        System.out.println(this.fio+" вернул книг(и): " +mergeList);
    }

    void returnBook (Book... allBooks){
        StringBuilder mergeList = new StringBuilder();
        for (int i=0; i< allBooks.length; i++) {
            mergeList.append(allBooks[i].getTitle()+" ("+ allBooks[i].getAuthor()
                    +" " + allBooks[i].getYear()+" г.) ");

        }
        System.out.println(this.fio+" вернул книг(у/и): " +mergeList);
    }



    }




