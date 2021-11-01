package com.pb.bondarenko.hw5;

public class Library {

    public static void main(String[]args){

        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        b1.setTitle("Война миров");
        b2.setTitle("Создания света,Создания тьмы");
        b3.setTitle("Неукротимая планета");
        b1.setAuthor("Герберт Уэллс");
        b2.setAuthor("Роджер Желязны");
        b3.setAuthor("Гарри Гаррисон");
        b1.setYear(1897);
        b2.setYear(1969);
        b3.setYear(1960);
        Book [] books={b1,b2,b3};

        Reader r1 = new Reader();
        Reader r2 = new Reader();
        Reader r3 = new Reader();
        Reader[] readers={r1,r2,r3};
        r1.setFio("Иванов И.И");
        r2.setFio("Петров П.П");
        r3.setFio("Сидоров С.С");
        r1.setBirthDate(1980);
        r2.setBirthDate(1970);
        r3.setBirthDate(1990);
        r1.setDepartment("Природоведения");
        r2.setDepartment("Философии");
        r3.setDepartment("Мудозвонства");
        r1.setPhone("+7010101010101");
        r2.setPhone("+8020202020202");
        r3.setPhone("+69030303030303");
        r1.setNumReadTicket(1);
        r2.setNumReadTicket(2);
        r3.setNumReadTicket(3);

        r2.takeBook(3);
        r1.takeBook(b1.getTitle(), b2.getTitle(), b3.getTitle());
        r3.takeBook(b2.getTitle(), b3.getTitle());
        r1.takeBook(books);

        r1.returnBook(18);
        r3.returnBook(b1.getTitle(), b2.getTitle(), b3.getTitle());
        r2.returnBook(b2.getTitle(), b3.getTitle());
        r1.returnBook(books);
        listAllBooks(books);
        listAllReaders(readers);


    }
    private static void listAllBooks (Book[] books){
        StringBuilder mergeListAllBooks = new StringBuilder();
        for (int i=0; i< books.length; i++){
            mergeListAllBooks.append(books[i].getTitle()+" ("+ books[i].getAuthor()
                    +" " + books[i].getYear()+" г.)");
            if (i< (books.length-1)) {
                mergeListAllBooks.append(", ");
            }
        }
        System.out.println("Библиотека состоит из: \n" +mergeListAllBooks+ "\n");
    }
    private static void listAllReaders (Reader[] readers){
        StringBuilder mergeListAllReaders = new StringBuilder();
        for (int i=0; i< readers.length; i++){
            mergeListAllReaders.append(readers[i].getFio()+", Факультет: "+ readers[i].getDepartment()
                    +", ДР: " + readers[i].getBirthDate()+", № читбилета: "
                    + readers[i].getNumReadTicket()+", № телефона: "
                    + readers[i].getPhone()//+" "

            );
            if (i< (readers.length-1)) {
                mergeListAllReaders.append(", \n");
            }
        }
        System.out.println("Список читателей: \n" +mergeListAllReaders);
    }

}
