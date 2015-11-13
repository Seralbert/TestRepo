package com.javarush.test.level08.lesson11.home04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array)
    {
        // Найти минимум
        int min = array.get(0);
        for (int i : array)
        {
            if (i < min) min = i;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException
    {
        //Тут создать и заполнить список
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<Integer>();
        //System.out.print("Вветите N: ");
        int n = Integer.parseInt(b.readLine());
        for (int N = 0; N < n; N++)
        {
            arr.add(Integer.parseInt(b.readLine()));
            //arr.add(N + 100);
        }

        return arr;
    }
}
