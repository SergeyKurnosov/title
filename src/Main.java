
public static class Book{
    String title;
    int pages;


    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "\nBook{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
//=====================================================================================
public static class Rectangle {
    double with;
    double height;

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    public double getArea(){
        return with*height;
    }
    public double getPerimeter(){
        return (with+height)*2;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "with=" + with +
                ", height=" + height +
                '}';
    }
}
//=====================================================================================
public static class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount >0 ){
            balance += amount;
        }
    }
    public void  withdraw(double amount){
        if(balance >= amount){
            balance-=amount;
        }
        else {
            System.out.println("Недостаточно средств");
        }
    }

    public String printInfo() {
        return "\nBankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
}



void main(String[] args) {

//=======================================================
/*
Простая
Создать класс `Book` с полями `title` (String) и `pages` (int). Добавить конструктор, принимающий оба поля.
В `main` создать два объекта `Book` с разными данными и вывести их поля через `System.out.println` (например, "Книга: <title>, страниц: <pages>").
 */

    Book book1 = new Book("one", 11);
    Book book2 = new Book("two", 22);
    System.out.print(book1);
    System.out.print(book2);
    System.out.println();
//=======================================================
/*
Средняя
Создать класс `Rectangle` с полями `width` и `height` (оба double). Добавить конструктор и метод `getArea()`, возвращающий площадь (`width * height`),
а также метод `getPerimeter()`, возвращающий периметр. В `main` создать два объекта с разными размерами, вывести для каждого площадь и периметр, и сравнить через `if`,
у какого из двух прямоугольников площадь больше.
*/
    Rectangle rect1 = new Rectangle(11.1, 22.2);
    System.out.println(rect1.getArea() + " / " + rect1.getPerimeter());
    Rectangle rect2 = new Rectangle(33.3, 44.4);
    System.out.println(rect2.getArea() + " / " + rect2.getPerimeter());
    if(Double.compare(rect1.getArea(), rect2.getArea()) == 0) {
        System.out.println("площади равны");
    }
    else if(Double.compare(rect1.getArea(), rect2.getArea()) == 1) {
        System.out.println("площадь rect1 больше");
    }
    else if(Double.compare(rect1.getArea(), rect2.getArea()) == -1) {
        System.out.println("площадь rect2 больше");
    }

//=======================================================
/*
Сложная
Создать класс `BankAccount` с полями `owner` (String) и `balance` (double). Добавить конструктор, метод `deposit(double amount)` (увеличивает баланс)
и метод `withdraw(double amount)` (уменьшает баланс, но только если средств достаточно — иначе вывести "Недостаточно средств" и не менять баланс).
Добавить метод `printInfo()`, который выводит владельца и текущий баланс. В `main` создать объект, выполнить несколько операций подряд (пополнение,
снятие корректной суммы, попытку снять больше, чем есть на счёте) и после каждой операции вызывать `printInfo()`, чтобы показать, как меняется состояние объекта.
*/

    BankAccount bankAccount = new BankAccount("Sergey",0.0);
    System.out.println(bankAccount.printInfo());
    bankAccount.deposit(123);
    System.out.println(bankAccount.printInfo());
    bankAccount.withdraw(100.22);
    System.out.println(bankAccount.printInfo());
    bankAccount.withdraw(300);
    System.out.println(bankAccount.printInfo());

}


