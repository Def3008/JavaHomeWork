package com.pb.bondarenko.hw5;

public class Reader {
    private String fio;
    private int numReadTicket;
    private String department;
    private int birthDate;
    private int phone;

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
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    void takeBook(int... book){
        int countTbook=0;
     for (int i=0; i<book.length; i++){
         countTbook += book[i];
     }
        System.out.println(" взял "+ countTbook + " книг(и)");
 }


//        void returnBook(String... book){
 //       int countRbook=0;
   //     for (int i=0; i<book.length; i++){
     //       countRbook += book[i];
       // }
       // System.out.println(" вернул "+ countRbook + " книг(и)");
  //  }

}
