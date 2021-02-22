package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameOfStudent = "Guzel works for Megacom";
        final int num = 70;

        String word = "Don't worry be happy";


        System.out.println(num + " " + word + " " + nameOfStudent);

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили нуль");
        }


        System.out.print("Type your name: ");
        Scanner name = new Scanner(System.in);
        System.out.print("Your name is " + name.nextLine());
    }
}
