import task_1.Point;
import task_2.Person;
import task_3.Point_three;

void main(String[] args) {
/*
1.Создать класс Point с приватными полями x и y (int). Переопределить equals() (сравнение по значениям полей, с проверкой на null и на
тип через instanceof) и hashCode() (на основе x и y, например через Objects.hash(x, y)). В main: создать два разных объекта Point с
одинаковыми координатами и сравнить их через == и через .equals() — показать разницу в результате. Затем положить оба объекта в HashSet<Point>
и проверить, что множество считает их дубликатом (размер набора — 1), только если equals/hashCode реализованы корректно.
 */
    Point point1 = new Point(11,22), point2 = new Point(11,22);
    System.out.println(point1==point2);
    System.out.println(point1.equals(point2));

    Set<Point> pointSet = new HashSet<>();
    pointSet.add(point1);
    pointSet.add(point2);
    System.out.println(pointSet.size());//один
    System.out.println("//////////////////////////////////////////");

//===============================================================================================
/*
2.Создать класс Person с полями name (String) и age (int), переопределить equals()/hashCode() так, чтобы два человека считались равными
только при совпадении обоих полей. Задача-ловушка: специально переопределить только equals(), не переопределяя hashCode(), и положить два
"равных" объекта в HashMap<Person, String> как ключи — увидеть, что несмотря на equals() == true, HashMap их не считает одним и тем же ключом
(потому что хэш-коды разные). Задача — исправить, добавив корректный hashCode()
 */
    Person person1 = new Person("One",11), person2 = new Person("One",11);
    Map<Person,String> personMap = new HashMap<>();
    personMap.put(person1,"One");
    personMap.put(person2,"Two");
    System.out.println(personMap.toString());// добавляет второй(перезаписывает)
    System.out.println("//////////////////////////////////////////");
//===============================================================================================
/*
3.Переписать класс Point из первой задачи как record Point(int x, int y) {}. В main показать, что equals(), hashCode() и toString() уже
работают правильно "из коробки", без единой написанной строчки — повторить те же проверки (сравнение двух record с одинаковыми полями,
добавление в HashSet) и убедиться, что результат идентичен ручной реализации из первой задачи, но кода не пришлось писать вообще. И попытаться
написать point.x = 5; — увидеть, что не скомпилируется, и объяснить, почему (все поля record неявно final).
 */

//===============================================================================================
    Point_three point_three1 = new Point_three(11,22), point_three2 = new Point_three(11,22);
    System.out.println(point_three1==point_three2);
    System.out.println(point_three1.equals(point_three2));

    Set<Point_three> point_threeSet = new HashSet<>();
    point_threeSet.add(point_three1);
    point_threeSet.add(point_three2);
    System.out.println(point_threeSet.size());//один

    point_three1.x = 5;// java: x has private access in task_3.Point_three

}


