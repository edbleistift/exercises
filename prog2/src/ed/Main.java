/*
//поиск пропущенного числа
package ed;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] N = {1, 3, 4, 5}; //задал массив значений для удобства, хотя можно и ручной ввод сделать
        int j = N[0];
        for (int i = 0; i < N.length; i++)
        {
            if (j != N[i]) {
                arr.add(j);
                i--;
            }
            j++;
        }
        System.out.println("Пропущенное число: ");
        for(int r : arr)
        {
            System.out.println(r);
        }
    }
}
*/


/*
//поиск повторяющегося числа
package ed;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //ввод размера массива
        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Зполните массив значениями: ");

        for(int i = 0; i < size; i++) { //заполяем массив
            array[i] = sc.nextInt();
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Повторяющееся значение: ");

        for(int i = 0; i < array.length; i++) { //ищем повторябщееся значение
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j]) {
                    System.out.println(j);
                }
            }
        }
    }
}
*/

/*
//проверка валидности строки: "(", "{", "[", ")", "}", "]"
package ed;

import java.util.Scanner;
import java.util.Stack; //(LIFO) последний пришел - первый обслужен

public class Main{ //объявление класса

    public static boolean main(String expression) { //объявляем ф-ю, проверяющую валидность строки
            if ((expression.length() % 2) == 1) {
                return false;
            }
            else {
                Stack<Character> s = new Stack<>(); //объявление стека
                for (char bracket : expression.toCharArray())
                switch (bracket) {
                    case '{': s.push('}'); //push - добавляем элемент на вершину стека
                    break;
                    case '(': s.push(')');
                    break;
                    case '[': s.push(']');
                    break;
                default :
                    if (s.isEmpty() || bracket != s.peek()) { //peek() - возвращаем элемент на вершине стека, но не удаляет его
                            return false;
                        }
                    s.pop(); //pop - удаляем самый верхний элемент стека
                    }
                return s.isEmpty();
            }
    }

    public static void main(String[] args) { //основной метод программы
            Scanner in = new Scanner(System.in); //задаем скобочную последовательность
            String expression = in.nextLine();
            boolean answer = main(expression);
            if (answer) {
                    System.out.println("Строка: " + expression + " - валидна");
                }
            else {
                    System.out.println("Строка: " + expression + " - не валидна");
                }

            }
}
*/
