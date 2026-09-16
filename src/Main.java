import task_1.*;
import task_2.Circle;
import task_2.Drawable;
import task_2.TextLabel;
import task_3.Devoloper;
import task_3.Employe;
import task_3.Manager;
import task_3.Payable;
//import task_2.*;
//import task_3.*;


void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /*
Простая
Создать абстрактный класс Animal с приватным полем name (String), геттером, конструктором и абстрактным методом makeSound().
Добавить обычный (не абстрактный) метод sleep(), выводящий "Спит". Создать Dog extends Animal и Cat extends Animal, каждый реализует makeSound()
 по-своему. В main: массив Animal[], заполнить объектами обоих подклассов, в цикле вызвать makeSound() и sleep() у каждого.
     */
Animal [] animals = {new Cat("cat1"),new Dog("dog1"),new Cat("cat2"),new Dog("dog2")};

for(Animal animal : animals){
    animal.makeSound();
    animal.sleep();
    System.out.println("============");
}

//===============================================================================================
    /*
Средняя
Создать интерфейс Drawable с методом draw(). Создать два никак не связанных друг с другом класса — Circle (поле radius) и TextLabel (поле text),
— оба реализуют Drawable, каждый по-своему определяя draw() (для круга — вывести параметры круга, для текста — вывести сам текст).
В main: массив Drawable[], заполнить объектами обоих классов, вызвать draw() в цикле.
     */
    Drawable[] drawables = {new Circle(12.2), new TextLabel("Hello"),new Circle(67.9),new TextLabel("World")};
    for(Drawable drawable : drawables){
        drawable.draw();
        System.out.println("=============");
    }

//===============================================================================================
    /*
Сложная*
Создать интерфейс Payable с методом calculatePay() (double). Создать абстрактный класс Employee implements Payable с приватными полями name (String) и
baseSalary (double), геттерами (инкапсуляция), конструктором и абстрактным методом getBonus() (double) — а calculatePay() реализован здесь же,
в абстрактном классе, как return baseSalary + getBonus(); Создать Manager extends Employee, где getBonus() возвращает 20% от baseSalary,
и Developer extends Employee, где getBonus() возвращает фиксированные 15000. В main: считать с клавиатуры N сотрудников, для каждого — имя,
оклад и тип (через switch создать нужный подкласс) в массив Payable[]. Пройти по массиву в цикле, вызвать calculatePay()
у каждого посчитать и вывести общую сумму выплат и вывести, у кого зарплата с бонусом оказалась наибольшей.
     */

    System.out.println("количество: ");
    int n = scanner.nextInt();
    scanner.nextLine();
    Payable[] payables = new Payable[n];
    Employe[] employes = new Employe[n];
    for (int i = 0; i < n; i++) {
        System.out.println("имя: ");
        String name = scanner.nextLine();
        System.out.println("оклад: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("тип (D-Devoloper;M-Manager: ");
        String type = scanner.nextLine();
        Payable payable;
        switch (type){
            case "D":
                payable = new Devoloper(name, salary);
                break;
            case "M":
                payable = new Manager(name, salary);
                break;
            default:
                payable = null;
        }
        if(payable!=null){
            payables[i] = payable;
            employes[i] = (Employe)payable;
        }
    }
    double allSalary = 0.0 , maxSalary = 0.0;
    int indexMaxSalary = 0;
    for (int i = 0; i < n; i++) {
        double calcSalary = payables[i].calculatePay();
        allSalary+=calcSalary;
        if(maxSalary < calcSalary){
            maxSalary = calcSalary;
            indexMaxSalary = i;
        }
            System.out.println(calcSalary);
    }
    System.out.println("All: "+ allSalary);
    System.out.println("MaxSalary: "+ maxSalary);
    System.out.println("MaxSalaryName: "+ employes[indexMaxSalary].getName());

    scanner.close();
}


