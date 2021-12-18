package com.pb.bondarenko.hw11;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.FileWriter;
import java.util.*;
import java.time.LocalDate;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static List<PhoneBook> phoneBook = new ArrayList<>();
    public static ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        mapper.registerModule(module);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Телефонная книга \n Введите номер действия:\n" +
                    "\n 1. Добавление элемента" +
                    "\n 2. Поиск элементов" +
                    "\n 3. Удаление элемента" +
                    "\n 4. Редактирование элемента" +
                    "\n 5. Вывод всех записей с сортировкой по указанному полю" +
                    "\n 6. Запись в файл всех данных" +
                    "\n 7. Загрузка из файла всех данных" +
                    "\n 0. Выход");
            String action = scanner.next();
            switch (action) {
                case "1":
                    addElem(scanner);
                    break;
                case "2":
                    findElem(scanner);
                    break;
                case "3":
                    removeElem(scanner);
                    break;
                case "4":
                    editElem(scanner);
                    break;
                case "5":
                    sortElem(scanner);
                    break;
                case "6":
                    writeToFile();
                    break;
                case "7":
                    readFile();
                    break;
                case "0":
                    System.out.println("Bye-Bye!");
                    return;
                default:
                    System.out.println("Введите номер из указанного перечня!");
            }
        }

    }

    public static void addElem(Scanner scanner) {
        System.out.println("Введите ФИО:");
        String fio = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Введите дату рождения:");
        String bth = scanner.next();

        System.out.println("Введите адрес:");
        scanner.nextLine();
        String address = scanner.nextLine();
        boolean morePhone = true;
        List<String> phones = new ArrayList<>();

        while (morePhone) {
            System.out.println("Введите телефон: ");
            String phone = scanner.next();
            phones.add(phone);

            System.out.println("Еще телефон?" +
                    "\n 1. Нет" +
                    "\n 2. Да");

            String morePhones = scanner.next();

            if (Objects.equals(morePhones, "1")) {
                morePhone = false;
            }
        }
        phoneBook.add(new PhoneBook(fio, bth, phones, address));
    }

    public static void findElem(Scanner scanner) {
        boolean findItem = true;
        while (findItem) {
            System.out.println("Критерий поиска:" +
                    "\n 1. Телефон" +
                    "\n 2. ФИО" +
                    "\n 3. Дата рождения" +
                    "\n 0. Выход \n");
            String findElem = null;
            String findBy = scanner.next();

            if (Objects.equals(findBy, "1")) {
                findItem = true;
                System.out.println("Введите телефон:");
                String phone = scanner.next();
                for (PhoneBook item : phoneBook) {
                    for (int i = 0; i < item.getPhones().size(); i++) {
                        if (item.getPhones().get(i).equals(phone)) {
                            findElem = item.toString();
                            break;
                        }
                    }

                }
                if (findElem == null) {
                    System.out.println("Ничего не нашлось");
                } else {
                    System.out.println(findElem);
                }
            } else if (Objects.equals(findBy, "2")) {
                findItem = true;
                System.out.println("Введите ФИО:");
                String fio = scanner.nextLine();

                for (PhoneBook item : phoneBook) {
                    if (Objects.equals(item.getFio(), fio)) {
                        findElem = item.toString();
                        break;
                    }
                }
                if (findElem == null) {
                    System.out.println("Ничего не нашлось");
                } else {
                    System.out.println(findElem);
                }
            } else if (Objects.equals(findBy, "3")) {
                findItem = true;
                System.out.println("Введите дату рождения:");
                String birthday = scanner.next();

                for (PhoneBook item : phoneBook) {
                    if (Objects.equals(item.getBth(), birthday)) {
                        findElem = item.toString();
                        break;
                    }
                }
                if (findElem == null) {
                    System.out.println("Ничего не нашлось");
                } else {
                    System.out.println(findElem);
                }
            } else if (Objects.equals(findBy, "0")) {
                findItem = false;
            } else {
                System.out.println("Введите номер из указанного перечня!");
                findItem = false;
            }
        }
    }

    public static void editElem(Scanner scanner) {
        System.out.println("Введите данные пользователя, в контактах которого хотите изменить данные");
        System.out.println("Укажите ФИО:");
        String fio = scanner.nextLine();
        boolean editElement = true;
        String editBy = "";
        while (editElement) {
            System.out.println("Редактировать:" +
                    "\n 1. По адресу" +
                    "\n 0. Выход \n");

            editBy = scanner.next();
            switch (editBy) {
                case "1":
                    System.out.println("Введите новый адрес:");
                    String newAddress = scanner.nextLine();
                    phoneBook.stream().filter(item -> Objects.equals(item.getFio(), fio)).findFirst().ifPresent(item -> item.setAddress(newAddress));
                    break;
                case "0":
                    System.out.println("Выход");
                    editElement = false;
                    break;
                default:
                    System.out.println("Введите номер из указанного перечня!");
                    editElement = false;
            }
            LocalDate date = LocalDate.now();
            phoneBook.stream().filter(item -> Objects.equals(item.getFio(), fio)).findFirst().ifPresent(item -> item.setDlm(date));
        }

    }

    public static void removeElem(Scanner scanner) {
        boolean dropItem = true;
        while (dropItem) {
            System.out.println("Удалить:" +
                    "\n 1. Телефон" +
                    "\n 2. Запись по ФИО" +
                    "\n 0. Выход \n");

            String test = scanner.next();
            if (Objects.equals(test, "1")) {
                dropItem = true;
                System.out.println("Введите телефон, который хотите удалить:");
                String phone = scanner.next();
                List<String> phoneList = new ArrayList<String>(Arrays.asList(phone.split("")));

                boolean delPhone = phoneBook.removeIf(item -> Objects.equals(item.getPhones(), phoneList));
                if (delPhone) {
                    System.out.println("Телефон " + phone + " удален!");
                } else {
                    System.out.println("Ничего не нашлось");
                }
            } else if (Objects.equals(test, "2")) {
                dropItem = true;

                System.out.println("Введите ФИО: ");
                String fio = scanner.nextLine();

                boolean dropFio = phoneBook.removeIf(item -> Objects.equals(item.getFio(), fio));
                if (dropFio) {
                    System.out.println("Контакт " + " " + fio + " удален!");
                } else {
                    System.out.println("Ничего не нашлось");
                }

            } else if (Objects.equals(test, "0")) {
                dropItem = false;
            } else {
                System.out.println("Введите номер из указанного перечня!");
                dropItem = false;
            }
        }
    }


    public static void sortElem(Scanner scanner) {
        boolean sortElement = true;
        while (sortElement) {
            System.out.println("Вы желаете отсортировать список по:" +
                    "\n 1. ФИО" +
                    "\n 2. Дата рождения" +
                    "\n 0. Выход \n");

            String sort = scanner.next();
            if (Objects.equals(sort, "1")) {
                sortElement = true;
                System.out.println("До:");
                for (PhoneBook i : phoneBook) {
                    System.out.println(i);
                }

                phoneBook.sort(Comparator.comparing(PhoneBook::getFio));

                System.out.println("После:");
                for (PhoneBook i : phoneBook) {
                    System.out.println(i);
                }

            } else if (Objects.equals(sort, "2")) {
                sortElement = true;
                System.out.println("До:");
                for (PhoneBook i : phoneBook) {
                    System.out.println(i);
                }

                phoneBook.sort(Comparator.comparing(PhoneBook::getBth));

                System.out.println("После:");
                for (PhoneBook i : phoneBook) {
                    System.out.println(i);
                }

            } else {
                System.out.println("Введите номер из указанного перечня!");
                sortElement = false;
            }
        }
    }


    public static void writeToFile() throws JsonProcessingException {
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String json = mapper.writeValueAsString(phoneBook);

        try (Writer writer = new FileWriter("files\\PhBook.txt")) {
            writer.write(json);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println(json);
    }

    public static void readFile() {
        try {
            String json = new String(Files.readAllBytes(Paths.get("files\\PhBook.txt")), StandardCharsets.UTF_8);
            System.out.println(json);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}