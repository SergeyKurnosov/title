import task_1.*;
import task_1.Student;
import task_2.*;
import task_3.*;
import task_4.*;


void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /*
1.Создать класс Person с приватными полями name (String) и age (int), геттерами и методом displayInfo(), выводящим имя и возраст.
Создать Student extends Person, добавляющий приватное поле grade (double) со своим геттером/сеттером (с валидацией: grade должна быть от 0 до 10,
иначе не устанавливать и вывести ошибку), и переопределяющий displayInfo() — вывод дополняется оценкой. В main создать массив Person[]
из 4 элементов, часть — обычные Person, часть — Student, заполнить с клавиатуры (включая символ-переключатель типа через switch), пройти в цикле и вызвать displayInfo()
для каждого (полиморфизм — вызовется нужная версия метода).
     */
    Person[] persons = new Person[4];
    for (int i = 0; i < 4; i++) {
        Person person;
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("is Student? (Y-yes ; N-no)");
        String isStudent = scanner.nextLine();
        switch (isStudent) {
            case "Y":
                System.out.println("grade");
                double grade = scanner.nextDouble();
                scanner.nextLine();
                person = new Student(grade, name, age);
                break;
            case "N":
                person = new Person(name, age);
                break;
            default:
                person = null;
                break;
        }
        if (person != null) {
            persons[i] = person;
        }
    }

    for (int i = 0; i < 4; i++) {
        persons[i].displayInfo();
    }

//===============================================================================================
    /*
2.Создать класс BankAccount с приватными полями owner (String) и balance (double), методами deposit/withdraw (с валидацией, как раньше)
и методом calculateYearlyReport(), возвращающим balance без изменений. Создать SavingsAccount extends BankAccount с приватным полем interestRate (double),
переопределяющий calculateYearlyReport() — добавляет проценты к балансу. Создать CheckingAccount extends BankAccount с приватным полем overdraftFee (double),
переопределяющий calculateYearlyReport() — вычитает фиксированную комиссию. В main: массив BankAccount[] из нескольких счетов разных типов,
в цикле вызвать calculateYearlyReport() для каждого и вывести итоговый прогноз баланса.
     */
    BankAccount[] bankAccounts = {new CheckingAccount("One", 123, 120), new SavingsAccount("Twoo", 100, 45), new CheckingAccount("Three", 999, 12)};
    for (int i = 0; i < 3; i++) {
        System.out.println(bankAccounts[i].calculateYearlyReport());
    }
//===============================================================================================
    /*
3.Создать класс Shape с приватным полем name (String), геттером и методом area() (заглушка, возвращает 0), и методом describe(),
который выводит name и вызывает area() (то есть describe() не переопределяется в подклассах — важно показать, что даже невиртуальный метод базового класса,
вызывающий area() внутри себя, всё равно получит нужную переопределённую версию area() благодаря полиморфизму).
Создать Circle и Rectangle как подклассы, переопределяющие только area(). В main: массив Shape[], заполнить с клавиатуры, вызвать describe() для каждого элемента, увидеть,
что при одном и том же коде вызова результат разный в зависимости от реального типа объекта.
     */
    Shape[] shapes = new Shape[4];

    for (int i = 0; i < 4; i++) {
        Shape shape;
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("type (C-Circle ; R-Rectangle)");
        String type = scanner.nextLine();
        switch (type) {
            case "C":
                shape = new Circle(name);
                break;
            case "R":
                shape = new Rectangle(name);
                break;
            default:
                shape = null;
        }
        if (shape != null) {
            shapes[i] = shape;
        }
    }

    for (int i = 0; i < 4; i++) {
        shapes[i].describe();
    }

//===============================================================================================
    /*
*
Создать класс Student с приватными полями name (String) и averageGrade (double). Создать массив из 5 объектов Student, заполнить с клавиатуры.
* Задача: вывести список студентов, отсортированный по averageGrade по возрастанию, используя Arrays.sort() — без ручной сортировки пузырьком и
* без вынесения оценок в отдельный массив. Для этого класс Student должен реализовать интерфейс Comparable<Student> и переопределить метод compareTo(Student other).
     */

    Student[] students = new Student[4];
    for (int i = 0; i < 4; i++) {
        System.out.println("name");
        String name = scanner.nextLine();
        System.out.println("averageGrade");
        double averageGrade = scanner.nextDouble();
        scanner.nextLine();
        students[i] = new Student(name, averageGrade);
    }

    System.out.println(Arrays.toString(students));
    Arrays.sort(students);
    System.out.println(Arrays.toString(students));


    scanner.close();
}


