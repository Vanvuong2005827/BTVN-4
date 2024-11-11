package core;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Book> books = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    //1. add a new book
    public void AddBook() {
        books.add(new Book());

        System.out.println("Mã Sách: ");
        books.getLast().setMaSach(sc.nextInt());
        sc.nextLine();

        System.out.println("Tên Sách: ");
        books.getLast().setTenSach(sc.nextLine());

        System.out.println("Tên Tác Giả: ");
        books.getLast().setTenTacGia(sc.nextLine());

        System.out.println("Năm Sản Xuất: ");
        books.getLast().setNamSanXuat(sc.nextInt());
        sc.nextLine();

        System.out.println("Tóm Tắt Nội Dung: ");
        books.getLast().setTomTatNoiDung(sc.nextLine());

        System.out.println("Giá Tiền: ");
        books.getLast().setGiaTien(sc.nextDouble());
        sc.nextLine();
    }

    //2. Adjust infomation of book
    public void Adjust(){
        System.out.println("Nhập Vào Mã Sách Cần Chỉnh Sửa: ");
        int id = sc.nextInt();
        for(Book book : books){
            if(book.getMaSach() == id){
                System.out.println("Mã Sách Mới: ");
                book.setMaSach(sc.nextInt());
                sc.nextLine();

                System.out.println("Tên Sách Mới: ");
                book.setTenSach(sc.nextLine());

                System.out.println("Tên Tác Giả Mới: ");
                book.setTenTacGia(sc.nextLine());

                System.out.println("Năm Sản Xuất Mới: ");
                book.setNamSanXuat(sc.nextInt());
                sc.nextLine();

                System.out.println("Tóm Tắt Nội Dung Mới: ");
                book.setTomTatNoiDung(sc.nextLine());

                System.out.println("Giá Tiền Mới: ");
                book.setGiaTien(sc.nextDouble());
                sc.nextLine();

                return;
            }
        }

        System.out.println("Không Tồn Tại Mã Sách Này!");
    }

    //3. Print All Books
    public void PrintBooks(){
        for(Book book : books){
            System.out.println(book);
        }
    }

    //4. Print the oldest book
    public void OldestBook(){
        int MinYear = Integer.MAX_VALUE;
        int Index = 0;

        for(int i = 0 ; i < books.size() ; ++i){
            if (books.get(i).getNamSanXuat() < MinYear){
                Index = i;
                MinYear = books.get(i).getNamSanXuat();
            }
        }

        System.out.println("Cuốn Sách Lâu Đời Nhất Là: ");
        books.get(Index).Display();
    }

    //5. Print the book which is suit for people
    public void SuitBook(){
        System.out.println("Nhập vào giá tiền: ");
        double money = sc.nextDouble();

        double MaxMoney = Integer.MIN_VALUE;
        int Index = 0;

        for(int i = 0 ; i < books.size() ; ++i){
            if (books.get(i).getGiaTien() <= money){
                if (books.get(i).getGiaTien() > MaxMoney){
                    MaxMoney = books.get(i).getGiaTien();
                    Index = i;
                }
            }
        }

        if (MaxMoney == Integer.MIN_VALUE){
            System.out.println("Bạn không đủ tiền để mua bất cứ quyển sách nào!");
        } else {
            System.out.println("Quyển Sách Bạn nên mua là: ");
            books.get(Index).Display();
        }
    }

    //6. Sort Book
    public void SortBook(){
        System.out.println("1. Sắp Xếp theo tên");
        System.out.println("2. Sắp Xếp theo giá");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                books.sort(Comparator.comparing(Book::getTenSach));
                break;
            case 2:
                books.sort(Comparator.comparing(Book::getGiaTien));
                break;
        }
    }

    public static void main(String[] args) {
        books.add(new Book("Java Programming", 101, "John Doe", 2020, "Learn Java basics.", 29.99));
        books.add(new Book("Data Structures", 102, "Jane Smith", 2021, "Data structures in depth.", 39.99));
        books.add(new Book("Algorithms", 103, "Robert Brown", 2019, "Master algorithms.", 49.99));
        books.add(new Book("Web Development", 104, "Emily White", 2022, "Building web applications.", 59.99));
        books.add(new Book("Machine Learning", 105, "Michael Green", 2023, "Introduction to machine learning.", 69.99));
        int n;
        Main main = new Main();
        do {
            System.out.println("1. Thêm Sách Mới");
            System.out.println("2. Chỉnh Sửa Sách");
            System.out.println("3. Danh Sách");
            System.out.println("4. Quyển Sách Lâu Đời Nhất");
            System.out.println("5. Quyển Sách Nên Mua");
            System.out.println("6. Sắp Xếp");
            System.out.println("7. Exit");
            n = sc.nextInt();

            switch (n){
                case 1:
                  main.AddBook();
                  break;
                case 2:
                  main.Adjust();
                  break;
                case 3:
                  main.PrintBooks();
                  break;
                case 4:
                  main.OldestBook();
                  break;
                case 5:
                  main.SuitBook();
                  break;
                case 6:
                  main.SortBook();
                  break;
            }

        } while (n < 7);
    }
}
