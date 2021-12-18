package com.pb.bondarenko.hw11;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.LocalDate;
import java.util.List;

public class PhoneBook {
    private String fio;
    private String bth;
    private List<String> phones;
    private String address;
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dlm = LocalDate.now();;

    @Override
    public String toString() {
        return "PhoneBook{" +
                "fio='" + fio + '\'' +
                ", bth='" + bth + '\'' +
                ", phones=" + phones +
                ", address='" + address + '\'' +
                '}';
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBth() {
        return bth;
    }

    public List<String> getPhones() {
        return phones;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDlm() {
        return dlm;
    }

    public PhoneBook(String fio, String bth, List<String> phones, String address) {
        this.fio = fio;
        this.bth = bth;
        this.phones = phones;
        this.address = address;
    }

    public void setDlm(LocalDate dlm) {

        this.dlm = dlm;
    }

        public void setBth(String bth) {
        this.bth = this.bth;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}