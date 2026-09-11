import task1.Dog;
import task2.Car;
import task3.*;
import task4.*;

void main(String[] args) {

    //==============================================================
    /*
1. Создать класс Animal с приватным полем name (String), конструктором и геттером getName(), а также методом makeSound(),
который выводит "Животное издаёт звук". Создать класс Dog extends Animal, который переопределяет makeSound(), выводя "Гав!".
В main создать объект Dog, вызвать getName() (унаследованный метод) и makeSound() (переопределённый).
     */
    Dog dog = new Dog("Sharik");
    dog.makeSound();
    System.out.println(dog);
    System.out.println();
    //==============================================================
    /*
2. Создать класс Vehicle с приватным полем speed (int), геттером и сеттером setSpeed (сеттер должен отклонять отрицательные значения — "Скорость не может быть отрицательной").
Создать класс Car extends Vehicle, добавляющий своё приватное поле brand (String) с отдельным геттером/сеттером. В main создать Car,
установить скорость и марку через сеттеры (показать, что speed меняется только через унаследованный setSpeed, а не напрямую).
     */
    Car car = new Car();
    car.setBrand("Volvo");
    car.setSpeed(100);
    System.out.println(car);
    System.out.println();
    //==============================================================
    /*
3. Создать класс Employee с приватными полями name (String) и baseSalary (double), геттерами и методом calculatePay(), возвращающим baseSalary без изменений.
Создать подклассы Manager extends Employee (переопределяет calculatePay() — добавляет 20% бонуса) и Developer extends Employee (переопределяет calculatePay()
— добавляет фиксированную надбавку 15000). В main: считать с клавиатуры N — количество сотрудников; в цикле для каждого — считать имя, базовую зарплату
и символ типа ('M' или 'D', через switch создать нужный подкласс) в массив Employee[] размера N. Пройти по массиву в цикле, для каждого вызвать calculatePay()
(полиморфизм — вызывается метод конкретного подкласса, хотя тип массива — базовый Employee) и накопить общую сумму выплат. Вывести итоговую ведомость и общую сумму.
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("Количество сотрудников  : ");
    int n = scanner.nextInt();
    scanner.nextLine();
    Employee[] employees = new Employee[n];
    for (int i = 0; i < n; i++) {
        System.out.println("Имя : ");
        String name = scanner.nextLine();
        System.out.println("Зарплата : ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Символ : ");
        String symbol = scanner.nextLine();
        Employee employee;
        switch (symbol) {
            case "M":
                employee = new Manager(name, baseSalary);
                break;
            case "D":
                employee = new Devolper(name,baseSalary);
                break;
            default:
                employee = null;
        }
        if (employee != null) {
            employees[i] = employee;
        }

    }

    double sum = 0;
    for (Employee employee : employees){
        sum += employee.calculatePay();
        System.out.println(employee.getName() + " / " + employee.calculatePay());
    }
    System.out.println("TOTAL SUM :::::::::::::: " + sum);
    //==============================================================
    /*
4. Создать класс Shape с приватным полем type (char, например 'C' для круга, 'R' для прямоугольника), геттером и методом area(),
возвращающим 0 (заглушка). Создать Circle extends Shape с приватным полем radius (double), переопределяющий area() (Math.PI * radius * radius),
и Rectangle extends Shape с полями width, height (double), переопределяющий area() (width * height). В main: считать с клавиатуры N фигур;
в цикле для каждой — считать символ типа через switch, в зависимости от типа считать нужные размеры (радиус либо ширину/высоту) и создать соответствующий объект в массив Shape[].
Пройти по массиву в цикле, вызвать area() для каждой (полиморфизм), вывести площадь каждой фигуры и её тип, а также найти и вывести фигуру с максимальной площадью.
     */
    System.out.println("Количество фигур  : ");
    int n2 = scanner.nextInt();
    scanner.nextLine();
    Shape[]shapes = new Shape[n2];
    for (int i = 0; i < n2; i++) {
        System.out.println("Символ : ");
        String symbol = scanner.nextLine();
        Shape shape;
        switch (symbol){
            case "C":
                System.out.println("Радиус : ");
                double radius = scanner.nextDouble();
                scanner.nextLine();
                shape = new Circle(symbol.charAt(0),radius);
                break;
            case "R":
                System.out.println("Высота : ");
                double height = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Ширина : ");
                double width = scanner.nextDouble();
                scanner.nextLine();
                shape = new Rectangle(symbol.charAt(0), width,height);
                break;
            default:
                shape = null;
                break;
        }
        if(shape!= null){
            shapes[i] = shape;
        }
    }


double maxArea = 0;
  int index= 0;
    for (int i = 0; i < shapes.length; i++) {
        if(shapes[i].area() > maxArea){
            maxArea = shapes[i].area();
            index = i;
        }
    }

    System.out.println(shapes[index].getType() + "/" + shapes[index].area());

}


