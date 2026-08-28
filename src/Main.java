//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {




    Scanner scanner_hello = new Scanner(System.in);
    System.out.println("Please enter name :");
    String name = scanner_hello.nextLine();
    System.out.println("Please enter age :");
    int age = Integer.parseInt(scanner_hello.nextLine());

    System.out.println("Hello " + name + " with age " + age);


//----------------------------------------------------------------------------------------------------------------------
/*
Задача 2: Средняя (Чек в магазине)
Напиши программу, которая работает как простая касса. Она должна запрашивать данные о покупке и выводить итоговую стоимость.
Что нужно сделать:
 * Запроси название товара (String).
 * Запроси цену за одну штуку (int).
 * Запроси количество купленного товара (int).
 * Создай еще одну переменную int для хранения итоговой суммы (цена умножить на количество).
 * Выведи красивый чек.
 */

    Scanner scanner_check = new Scanner(System.in);
    System.out.println("Please enter product name :");
    String product = scanner_check.nextLine();
    System.out.println("Please enter price :");
    int price = Integer.parseInt(scanner_check.nextLine());
    System.out.println("Please enter count :");
    int count = Integer.parseInt(scanner_check.nextLine());
    int total_sum = price*count;

    System.out.printf("|%-20s|%n", String.valueOf('-').repeat(20));
    System.out.printf("|%-20s|%n", "Check");
    System.out.printf("|%-20s|%n", "Product name :" + product);
    System.out.printf("|%-20s|%n", "Count :" + count);
    System.out.printf("|%-20s|%n", "Total sum :" + total_sum);
    System.out.printf("|%-20s|%n", String.valueOf('-').repeat(20));

//----------------------------------------------------------------------------------------------------------------------

/*
Задача 3: Сложная (Анкета с подвохом)
Напиши программу для создания "Карточки персонажа" в игре. Эта задача кажется простой, но в ней скрыт классический подвох, на котором спотыкаются 90% новичков при работе со Scanner.
Что нужно сделать:
 * Запроси уровень персонажа (int).
 * Запроси имя персонажа (String). Может состоять из нескольких слов (например, "Джон Сноу").
 * Запроси базовое здоровье (int).
 * Запроси класс персонажа (String, например, "Воин" или "Маг").
 * Выведи карточку персонажа на экран.
 */

    Scanner scanner_person = new Scanner(System.in);
    System.out.println("Please enter level :");
    int level = Integer.parseInt(scanner_person.nextLine());
    System.out.println("Please enter name :");
    String name_person = scanner_person.nextLine();
    System.out.println("Please enter HP :");
    int hp = Integer.parseInt(scanner_person.nextLine());
    System.out.println("Please enter class :");
    String class_name = scanner_person.nextLine();

    System.out.printf("|%-40s|%n", String.valueOf('-').repeat(40));
    System.out.printf("|%-40s|%n", "Person :");
    System.out.printf("|%-40s|%n", "Name :" + name_person);
    System.out.printf("|%-40s|%n", "Level :" + level);
    System.out.printf("|%-40s|%n", "HP :" + hp);
    System.out.printf("|%-40s|%n", "Class :" + class_name);
    System.out.printf("|%-40s|%n", String.valueOf('_').repeat(40));


}
