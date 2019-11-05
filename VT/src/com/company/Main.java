package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String command;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Здравствуйте, для начала работы нажмите 1, для выхода из программы введите 0");
            command = in.next();
        }while ((!command.equals("1"))&&(!command.equals("0")));

        if(command.equals("0")){
            System.out.println("До свидания!");
        }


        if(command.equals("1")){
            do {
                System.out.println("Чтобы добавить список машину, введите 'Creat', чтобы просмотреть список- 'Read', чтобы редактировать инвормацию-'Upgreat', чтобы удалить машину из списка-'Delete'");
                command = in.next();
            }while ((!command.equals("Create"))&&(!command.equals("Read"))&&(!command.equals("Update"))&&(!command.equals("Delete")));
                 switch (command) {
                     case "Create":
                         Create();
                         break;
                     case "Read":
                         Show();
                         break;
                     case "Update":
                         Update();
                         break;
                     case "Delete":
                         Delete();
                         break;
                 }
            }
        }

        //Создание новой машины
        public static void Create(){
        Scanner in = new Scanner(System.in);
        System.out.println("Какой тип машины желаете добавить?(1-самосвал, 2-лимузин, 3-спорткар, 4-тягач)");
        String com = in.next();


        System.out.print("Введите марку: ");
        String mark = in.next();

        System.out.print("Введите цвет: ");
        String color = in.next();

        System.out.print("Введите цену за час: ");
        int price = in.nextInt();

        System.out.print("Введите вес: ");
        int weight = in.nextInt();

        System.out.print("Введите высоту: ");
        int height = in.nextInt();


        switch (com) {
              case "1":
                  System.out.println("Введите максимальный преносимый вес: ");
                  int maxWeight = in.nextInt();
                  DumpTruck DT= new DumpTruck(weight, color, height, mark, price, maxWeight);
                  break;
              case "2":
                  System.out.println("Введите максимальный лимит людей: ");
                  int peopleLimit = in.nextInt();
                  Limo LM = new Limo(weight, color, height, mark, price, peopleLimit);
                  break;
              case "3":
                  System.out.println("Введите максимальную скорость: ");
                  int maxSpeed = in.nextInt();
                  Sportcar SC= new Sportcar(weight, color, height, mark, price, maxSpeed);
                  break;
              case "4":
                  System.out.println("Введите мощность: ");
                  int power = in.nextInt();
                  Tractor TR = new Tractor(weight, color, height, mark, price, power);
                  break;
        }
    }

    //Отобразить список машин
    public static void Show(){

    }


    //Обновить информацию о машине
    public static void Update(){

    }

    //Удалить машину из списка
    public static void Delete(){

    }


    //Поиск в списке по критериям
    public static void Find(){

    }
}
