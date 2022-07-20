package org.example;

import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;

class People {
    public int lenght; // Создали класс   People
    int EmpID;// номер спортсменга
    String name;    // имя спортсмена
    int jump;        // высота прыжка спортсмена
    int running_distance; // предел пробегаемого расстояния
    int power; // Сопротивление ветру

    People(int EmpID,String name, int jump, int running_distance, int power) {
        this.EmpID = EmpID;
        this.name = name;
        this.jump = jump;
        this.running_distance = running_distance;
        this.power = power;
    }
    public People() {
    }
    void displayInfo(){  // метод вывода полей для класса People
        System.out.printf("Number flag: %d \t Name: %s \t jump: %d \t swimming_speed: %d \t power: %d \n", EmpID, name, jump, running_distance, power);
    }
    public String toString() {                 // Общий метод вывода данных полей после разных сортировок
        return this.EmpID + " " + this.name + " " + this.jump + " " + this.running_distance + " " + this.power;
    }
}



class Team { // Создан класс команды

    public static void main(String[] args) {

        System.out.println("Command 'Sahara skiers' , starting lineup");
        System.out.println("-----------------------------------------");

        People people1 = new People(1,"Hon_Gil_Don",160,700,25);
        people1.displayInfo();

        People people2 = new People(2,"Akira_Kurosava",70,450,15);
        people2.displayInfo();

        People people3 = new People(3,"Ilya_Murometz",80,700,150);
        people3.displayInfo();

        People people4 = new People(4,"Bomberman",40,1000,100);
        people4.displayInfo();

        People people5 = new People(5,"Barmaley",60,400,40);
        people5.displayInfo();

        People people6 = new People(6,"Solovey_Razboynik",30,1050,40);
        people6.displayInfo();

        People people7 = new People(3,"Berimor",80,800,30);
        people7.displayInfo();

        People people8 = new People(4,"Olaf_Sholtz",90,1000,10);
        people8.displayInfo();

        Polosa polosa1 = new Polosa(1,"Trassa", 500,  0, 0);
        Polosa polosa2 = new Polosa(2,"Zabor", 0,50,0);
        Polosa polosa3 = new Polosa(3,"Tonnel", 10, 0, 130);

        ArrayList<People> Arr00 = new ArrayList<People>();  // Cобрали стартовую коллекцию из восьми персонажей
        Arr00.add(people1);
        Arr00.add(people2);
        Arr00.add(people3);
        Arr00.add(people4);
        Arr00.add(people5);
        Arr00.add(people6);
        Arr00.add(people7);
        Arr00.add(people8);

        ArrayList<Polosa> Arr01 = new ArrayList<Polosa>();  // Cобрали стартовую коллекцию из трех препятствий
        Arr01.add(polosa1);
        Arr01.add(polosa2);
        Arr01.add(polosa3);

        int n = Arr00.size(); // число участников на старте первого этапа

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Start number 1");
        polosa1.displayInfo();

        ArrayList<People> Arr10 = new ArrayList<People>();// Для наполнения прошедшими первый этап соревнования
        ArrayList<People> Arr11 = new ArrayList<People>();// Для наполнения сошедшими с дистанции после первого препятствия

        for(int i = 0; i < n; i++) {
            if (Arr00.get(i).running_distance > Arr01.get(0).lenght) {
                Arr10.add(Arr00.get(i));
            }
            else {
                Arr11.add(Arr00.get(i));
            }
        }

        System.out.println();
        System.out.println("Finished People :");
        for (int i=0; i<Arr10.size(); i++)
            System.out.println(Arr10.get(i));
        System.out.println();
        System.out.println("Menshe nyzno kyrit :");
        for (int i=0; i<Arr11.size(); i++)
            System.out.println(Arr11.get(i));


        n = Arr10.size(); // число участников на старте второго этапа

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Start number 2");
        polosa2.displayInfo();

        ArrayList<People> Arr20 = new ArrayList<People>();// Для наполнения прошедшими второй этап соревнования
        ArrayList<People> Arr21 = new ArrayList<People>();// Для наполнения сошедшими с дистанции после второго препятствия

        for(int i = 0; i < n; i++) {
            if (Arr10.get(i).jump > Arr01.get(1).height) {
                Arr20.add(Arr10.get(i));
            }
            else {
                Arr21.add(Arr10.get(i));
            }
        }

        System.out.println();
        System.out.println("Finished People :");
        for (int i=0; i<Arr20.size(); i++)
            System.out.println(Arr20.get(i));
        System.out.println();
        System.out.println("Menshe nyzno kushat pirozki :");
        for (int i=0; i<Arr21.size(); i++)
            System.out.println(Arr21.get(i));


        n = Arr20.size(); // число участников на старте третьего этапа

        System.out.println("------------------------------------------------------------------");
        System.out.println("Start number 3");
        polosa3.displayInfo();

        ArrayList<People> Arr30 = new ArrayList<People>();// Для наполнения прошедшими третий этап соревнования
        ArrayList<People> Arr31 = new ArrayList<People>();// Для наполнения сошедшими с дистанции после третьего препятствия

        for(int i = 0; i < n; i++) {
            if (Arr20.get(i).power > Arr01.get(2).wind_speed) {
                Arr30.add(Arr20.get(i));
            }
            else {
                Arr31.add(Arr20.get(i));
            }
        }

        System.out.println();
        System.out.println("Finished People :");
        for (int i=0; i<Arr30.size(); i++)
            System.out.println(Arr30.get(i));
        System.out.println();
        System.out.println("Vetrom sdulo :");
        for (int i=0; i<Arr31.size(); i++)
            System.out.println(Arr31.get(i));

    }
}


class Polosa extends People { //создан класс препятствий

    int NumID;// номер препятствия
    String problem_name; // название препятствия
    int lenght; // длина беговой дорожки
    int height; // высота забора
    int wind_speed; // сила встречного ветра
    Polosa(int NumID, String problem_name, int lenght, int height, int wind_speed) {
        this.NumID = NumID;
        this.problem_name = problem_name;
        this.lenght = lenght;
        this.height = height;
        this.wind_speed = wind_speed;
    }
    public Polosa() {
    }
    void displayInfo(){                  // метод вывода полей объектов в классе Препятствия
        System.out.printf("Numer problem: %d \tProblem name: %s \t Length: %d \t Heigth: %d \t  Wind_speed: %d \n", NumID,problem_name, lenght, height, wind_speed);
    }
    public String toString() {                 // Общий метод вывода данных полей после разных сортировок
        return this.NumID + " " + this.problem_name + " " + this.lenght + " " + this.height + " " + this.wind_speed;
    }
}

