package ru.nsi;

public class Main {

    private static int[] generateSequence(int begin, int end, int count) {
        int[] sequence = new int[count];
        //Написать код наполняющий последовательность...
        if (count == 2) {
            sequence[0] = begin;
            sequence[1] = end;
        } else if (count > 2) {
            int N;
            N = (end - begin) / (count - 1);
            sequence[0] = begin;
            for (int i = 0; i < count - 2; i++) {
                sequence[i + 1] = sequence[i] + N;
            }
            sequence[count - 1] = end;
        } else {
            System.out.println("The sequence size must be greater than one.");
        }
        return sequence;
    }

    private static int getMinValue(int[] sequence) {
        int minValue = 0;
        minValue = sequence[0];
        return minValue;
    }

    private static int getMaxValue(int[] sequence) {
        int maxValue = 0;
        maxValue = sequence[sequence.length - 1];
        return maxValue;
    }

    private static int getAvgValue(int[] sequence) {
        int avgValue = 0;
        for (int i = 0; i < sequence.length; i++) {
            avgValue = avgValue + sequence[i];
        }
        avgValue = avgValue / sequence.length;
        return avgValue;
    }

    public static void main(String[] args) {
        //1. Считать аргументы командной строки
        int begin = Integer.parseInt(args[0]);
        int end = Integer.parseInt(args[1]);
        int count = Integer.parseInt(args[2]);

        System.out.println(String.format("BEGIN: %s, END: %s, COUNT: %s", begin, end, count));

        //2. Сгенерировать и вывести последовательность в одну строчку, разделяя элементы пробелом

        int sequence[] = generateSequence(begin, end, count);
        System.out.print("SEQUENCE:");
        for (int i = 0; i < sequence.length; i++) {
            System.out.print(" " + sequence[i]);
        }
        System.out.println("");
        //3. Вывести в одну строчку минимальное, максимальное и средние значения последовательности
        System.out.print("MINIMAL VALUE: " + getMinValue(sequence) + ", MAXIMUM VALUE: "+ getMaxValue(sequence) + ", AVERAGE VALUE: " + getAvgValue(sequence));
    }
}
