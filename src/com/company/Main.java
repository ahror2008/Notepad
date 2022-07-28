package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static LinkedList<Notepad> linkedList = new LinkedList<>();
    public static LinkedList<Notepad> linkedList2 = new LinkedList<>();
    public static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            System.out.println("[1] malumot qo'shish");
            System.out.println("[2] malumotni kurish ");
            System.out.println("[3] malumotni yangilash ");
            int a= scanner.nextInt();
            switch (a) {
                case 1->{
                    System.out.println("sarlavxa: ");
                    String title= scanner.next();
                    System.out.println("malumot: ");
                    String data= scanner.next();
                    linkedList.add(new Notepad(title,data));

                }
                case 2->{
                    linkedList.forEach( notepad -> {
                        System.out.println("sarlavxa: "+notepad.getTitle()+"  malumot: " +notepad.getData());
                    });
                }
                case 3->{
                    System.out.println("sarlavxa: ");
                    String title= scanner.next();
                    System.out.println("malumot: ");
                    String data= scanner.next();


                    linkedList.replaceAll(notepad -> {

                        notepad.setTitle(title);
                        notepad.setData(data);

                        return notepad;
                    });


                }
            }


        }
    }
}


