package com.javarush.test.level03.lesson08.task01;

/* Как захватить мир
Ввести с клавиатуры число и имя, вывести на экран строку:
«имя» захватит мир через «число» лет. Му-ха-ха!
Пример: Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String name = reader.readLine();
String sAge = reader.readLine();
int nAge = Integer.parseInt(sAge);
         */

 /*
 в задании не работает
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int age = scanner.nextInt();
         */
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        String name = reader.readLine();
        int nAge = Integer.parseInt(sAge);

        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");

    }
}