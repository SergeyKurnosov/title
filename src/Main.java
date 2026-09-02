//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    /*
    Простая
    Дан массив из N вещественных чисел. Найти сумму, среднее арифметическое и количество элементов больше среднего.
     */
    double[] arr1 = {1.3, 2.1, 4.3, 9.4, 5.1, 0.2};
    double sum = 0, arifmetic = 0;
    int count_bigger = 0;
    for (double elem : arr1) {
        sum += elem;
    }
    arifmetic = sum / arr1.length;
    for (double elem : arr1) {
        if (elem > arifmetic) {
            count_bigger++;
        }
    }
    System.out.println("summ : " + sum + "\narifmetic : " + arifmetic + "\n" + "count : " + count_bigger + "\n\n\n");

    //============================================================
    /*
    Средняя
    Дан двумерный массив char размером M×N (заполнен буквами и цифрами).
    Посчитать отдельно количество букв, количество цифр и количество остальных символов в каждой строке массива, вывести построчно.
     */
    char[][] arr2 = {
            {'a', '3', 'e', '6', '>'},
            {'4', 'b', '2', '!', '='},
            {'f', '5', 'c', '1', '0'}
    };

    for (int i = 0; i < arr2.length; i++) {
        int count_letter = 0, count_digit = 0, count_other = 0;
        for (int j = 0; j < arr2[i].length; j++) {
            if ((arr2[i][j] >= 'a' && arr2[i][j] <= 'z') || (arr2[i][j] >= 'A' && arr2[i][j] <= 'Z')) {
                count_letter++;
            } else if (arr2[i][j] >= '0' && arr2[i][j] <= '9') {
                count_digit++;
            } else {
                count_other++;
            }
        }
        System.out.println("=====================================================");
        System.out.println("count letter : " + count_letter + "\ncount digit : " + count_digit + "\n count other : " + count_other + "\n\n\n");
    }

    //============================================================
    /*
    Сложная
    Дан двумерный массив вещественных чисел размером N×N.
    Для каждой строки найти индекс и значение максимального элемента.
    Затем определить, является ли матрица симметричной относительно главной диагонали — сравнение чисел проводить с учётом погрешности (epsilon), а не через ==
     */
    double[][] arr3 = {
            {1.2, 3.9, 6.1, 7.0},
            {3.9, 3.2, 4.3, 5.2},
            {6.1, 4.3, 1.4, 2.3},
            {7.0, 5.2, 2.3, 0.7}
    };
    for (int i = 0; i < arr3.length; i++) {
        double max_value = 0;
        int max_index = 0;
        for (int j = 0; j < arr3[i].length; j++) {
            if (arr3[i][j] > max_value) {
                max_value = arr3[i][j];
                max_index = j;
            }
        }
        System.out.println("\nmax value : " + max_value + "\nmax index : " + max_index);
    }
    double EPSILON = 1e-15;
    boolean simetric = true;
    for (int i = 0; i < arr3.length; i++) {
        for (int j = 0; j < arr3[i].length; j++) {
            if (Math.abs(arr3[i][j] - arr3[j][i]) > EPSILON) {
                simetric = false;
                break;
            }
        }
        if (!simetric) {
            break;
        }
    }
    if (simetric) {
        System.out.println("matrix symmetrical");

    } else {
        System.out.println("matrix not symmetrical");
    }

    //============================================================
    /*
    *
    Дан двумерный массив char размером N×N, где буквы обозначают клетки (например, 'X', 'O', '.').
    Реализовать проверку: существует ли в массиве сплошная линия одинаковых символов (по горизонтали, вертикали или главной/побочной диагонали) длиной не меньше заданного K, при этом символ '.' в линию не засчитывается.
    Использовать только вложенные циклы и условия — без рекурсии и коллекций.
     */
    System.out.println("====================================");
    Scanner scanner = new Scanner(System.in);
    System.out.println("size diagonal : ");
    int size = scanner.nextInt();
    char[][] arr4 = {
            {'x', '.', '0', '0'},
            {'0', 'x', '0', '.'},
            {'x', '0', 'x', '0'},
            {'0', '.', '.', '.'}
    };

    for (int i = 0; i < arr4.length; i++) {
        boolean horizont = true;
        boolean vertical = true;
        boolean diagonal_down = true;
        boolean diagonal_up = true;
        for (int j = 0; j < arr4[i].length; j++) {
            if (arr4[i][j] != '.') {
                //========================================================

                if (horizont && j < arr4[i].length - 1) {
                    if (arr4[i][j] == arr4[i][j + 1]) {
                        int count_horizont = 0, last_line_index = 0;
                        for (int k = j; k < arr4[i].length; k++) {
                            if (arr4[i][j] != arr4[i][k]) {
                                break;
                            } else {
                                count_horizont++;
                                last_line_index = k;
                            }
                        }
                        if (count_horizont <= size)
                            System.out.println("horisont - " + arr4[i][j] + " : " + count_horizont);
                        if (last_line_index == arr4[i].length - 1) {
                            horizont = false;
                        }
                    }
                }
                //========================================================
                if (vertical && i < arr4.length - 1) {
                    if (arr4[i][j] == arr4[i + 1][j]) {

                        int count_vertical = 0, last_line_index = 0;
                        for (int k = i; k < arr4.length; k++) {

                            if (arr4[i][j] != arr4[k][j]) {
                                break;
                            } else {
                                count_vertical++;
                                last_line_index = k;
                            }
                        }
                        if (count_vertical <= size)
                            System.out.println("vertical - " + arr4[i][j] + " : " + count_vertical);
                        if (last_line_index == arr4.length - 1) {
                            vertical = false;
                        }
                    }
                }
                //========================================================
                if (diagonal_down && i < arr4.length - 1 && j < arr4[i].length - 1) {
                    if (arr4[i][j] == arr4[i + 1][j + 1]) {
                        if (i > 0 && j > 0) {
                            if (arr4[i][j] == arr4[i - 1][j - 1]) {
                                continue;
                            }
                        }
                        int count_diagonal_down = 0, last_line_index = 0;
                        for (int k = 0; k < arr4.length; k++) {
                            if (j + k == arr4[i].length || i + k == arr4.length) {
                                break;
                            }

                            if (arr4[i][j] != arr4[i + k][j + k]) {
                                break;
                            } else {
                                count_diagonal_down++;
                                last_line_index = k;
                            }
                        }
                        if (count_diagonal_down <= size)
                            System.out.println("diagonal down - " + arr4[i][j] + " : " + count_diagonal_down);
                        if (last_line_index == arr4.length - 1) {
                            diagonal_down = false;
                        }
                    }
                }
                //========================================================
                if (diagonal_up && i > 0 && j < arr4[i].length - 1) {
                    if (arr4[i][j] == arr4[i - 1][j + 1]) {
                        if (i > 0 && j > 0) {
                            if (arr4[i][j] == arr4[i + 1][j - 1]) {
                                continue;
                            }
                        }
                        int count_diagonal_up = 0, last_line_index = 0;
                        for (int k = 0; k < arr4.length; k++) {
                            if (j + k == arr4[i].length) {
                                break;
                            }

                            if (arr4[i][j] != arr4[i - k][j + k]) {
                                break;
                            } else {
                                count_diagonal_up++;
                                last_line_index = k;
                            }
                        }
                        if (count_diagonal_up <= size)
                            System.out.println("diagonal up - " + arr4[i][j] + " : " + count_diagonal_up);
                        if (last_line_index == arr4.length - 1) {
                            diagonal_up = false;
                        }
                    }
                }
            }


        }
    }

    //============================================================

}
