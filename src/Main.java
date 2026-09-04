//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
/*
Простая
Считать с клавиатуры два числа (int) — делимое и делитель.
Попытаться выполнить деление и вывести результат.
Если делитель равен 0 — поймать ArithmeticException и вывести "На ноль делить нельзя" вместо падения программы.
 */
    System.out.println("делимое ");
    int dividend = scanner.nextInt();
    System.out.println("делитель ");
    int divisor = scanner.nextInt();
    double result = 0;
    try {
        result = (double) dividend / divisor;
        if(result == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("нельзя");
        }
        System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("На ноль делить нельзя :" + e.getMessage());
    }
    //==================================================================
/*
Средняя
Считать с клавиатуры строку. Попытаться преобразовать её в число через Integer.parseInt.
Если преобразование не удалось — поймать то NumberFormatException и вывести "Введено не число", а не дать программе упасть.
Обернуть это в цикл: повторять запрос ввода, пока пользователь не введёт корректное число
 */
    scanner.nextLine();
    String line;
    int result1 = 0;
    boolean correct = true;
    do {
        System.out.println("строка ");
        line = scanner.nextLine();


        try {
            result1 = Integer.parseInt(line);
            correct = true;
            System.out.println("Введено число : " + result1);
        } catch (NumberFormatException e) {
            System.out.println("Введено не число : " + e.getMessage());
            correct = false;
        }
    } while (!correct);
    //==================================================================
/*
Сложная
Создать массив int размером 5. Считать с клавиатуры индекс массива (int) и делитель (int).
Нужно: (1) обратиться к элементу массива по введённому индексу, (2) поделить его на введённый делитель.
Обработать оба возможных исключения раздельно — ArrayIndexOutOfBoundsException (если индекс вне границ массива) и ArithmeticException (если делитель 0) — каждое своим отдельным catch с отдельным сообщением.
Добавить блок finally, который выводит "Попытка обработки завершена" независимо от того, было исключение или нет.
 */

    int [] array = {12,345,9,23,1};
    System.out.println("индекс ");
    int index = scanner.nextInt();
    System.out.println("делитель ");
    int divisor1 = scanner.nextInt();
    double result2 = 0;
    try {
      result2 =  (double) array[index] / divisor1;
        if(result2 == Double.POSITIVE_INFINITY){
            throw new ArithmeticException("нельзя");
        }
        System.out.println("результат " + result2);
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("индекс вне границ массива : "+ e.getMessage());
    }
    catch (ArithmeticException e){
        System.out.println("делитель 0 : "+ e.getMessage());
    }
    finally {
        System.out.println("Попытка обработки завершена");
    }

    //==================================================================

}


