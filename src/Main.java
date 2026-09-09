
void main(String[] args) {
    //================================================================
    /*
Простая
Создать класс Person с приватными полями name (String) и age (int).
Добавить конструктор и публичные геттеры/сеттеры для обоих полей — без какой-либо валидации.
В main создать объект, изменить оба поля через сеттеры, вывести значения через геттеры.
     */
    Person person = new Person();
    person.setName("Sergey");
    person.setAge(25);
    System.out.println("Name: " + person.getName() + " ; Age: " + person.getAge());
    System.out.println();
    //================================================================
    /*
Средняя
Создать класс Product с приватными полями name (String) и price (double). Сеттер setPrice должен проверять: если переданное значение отрицательное — не менять цену
и вывести "Цена не может быть отрицательной", иначе установить новое значение. В main продемонстрировать оба случая: успешную установку цены и попытку установить отрицательную.
     */
    Product product = new Product();
    product.setName("product");
    product.setPrice(200);
    System.out.println(product.getPrice());
    product.setPrice(-200);
    System.out.println(product.getPrice());
    System.out.println();
    //================================================================
    /*
Сложная
Создать класс BankAccount с приватными полями owner (String) и balance (double) — оба поля должны быть недоступны напрямую снаружи класса (никаких публичных полей и никакого сеттера setBalance — баланс меняется только через методы deposit/withdraw). Добавить:
геттеры getOwner() и getBalance() (только чтение баланса, без прямой записи);
метод deposit(double amount) — отклоняет пополнение, если amount <= 0 (вывести "Некорректная сумма пополнения");
метод withdraw(double amount) — отклоняет снятие, если amount <= 0 или если средств недостаточно (отдельные сообщения для каждого случая).
В main показать, что снаружи класса невозможно написать account.balance = 1000000; напрямую — баланс можно изменить только через deposit/withdraw, и оба метода отказывают на некорректных данных, оставляя баланс в согласованном состоянии.
     */

    BankAccount account = new BankAccount("Sergey");
   // account.balance = 1000000; // java: balance has private access in BankAccount!!!!

    System.out.println(account.toString());
    account.withdraw(100);
    System.out.println(account.toString());
    account.deposit(0);
    System.out.println(account.toString());
    account.deposit(300);
    System.out.println(account.toString());
    account.withdraw(100);
    System.out.println(account.toString());



}


