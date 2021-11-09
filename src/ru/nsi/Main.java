package ru.nsi;

public class Main {

    private static int[] generateSequence(int begin, int end, int count) {
        int[] sequence = new int[count];
        //Написать код наполняющий последовательность...

        return sequence;
    }

    private static int getMinValue(int[] sequence) {
        int minValue = 0;

        return minValue;
    }

    private static int getMaxValue(int[] sequence) {
        int maxValue = 0;

        return maxValue;
    }

    private static int getAvgValue(int[] sequence) {
        int avgValue = 0;

        return avgValue;
    }

    public static void main(String[] args) {
        //1. Считать аргументы командной строки
        int begin = Integer.parseInt( args[0] );
        int end = Integer.parseInt( args[1] );
        int count = Integer.parseInt( args[2] );

        System.out.println( String.format("BEGIN: %s, END: %s, COUNT: %s", begin, end, count) );

        //2. Сгенерировать и вывести последовательность в одну строчку, разделяя элементы пробелом

        //3. Вывести в одну строчку минимальное, максимальное и средние значения последовательности
    }
}
