import task_3.Student;

void main(String[] args) {
/*
1.Дан список целых чисел (List<Integer>, задать вручную, минимум 10 значений). С помощью Stream API вывести на экран только чётные числа,
каждое на новой строке (filter + forEach).
*/
    List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
    list.stream()
            .filter(i->i%2==0)
            .forEach(System.out::println);

//===============================================================================================
/*
2.Дан список строк — имена студентов (List<String>, с разным регистром букв, например "иван", "Мария", "ПЁТР"). С помощью Stream API
привести все имена к виду с заглавной первой буквой и остальными строчными, отсортировать по алфавиту и вывести результат (map + sorted + forEach).
Метод приведения к нужному регистру можно оформить как обычный статический метод и передать в map через ссылку на метод.
 */
    List<String> names = List.of("иван", "Мария", "ПЁТР","Сергей","НИКИТА","вероника");
    names.stream()
            .map(n->n= nameCorrect(n))
            .sorted()
            .forEach(System.out::println);



//===============================================================================================
/*
3.Дан список объектов Student с полями name (String) и grade (int, средний балл). С помощью Stream API отобрать студентов с баллом выше
заданного порога (например, 4), собрать их в новый список (collect(Collectors.toList())) и вывести количество отобранных студентов через
.size() этого списка, а затем — их имена.
 */
 List<Student> students = List.of(new Student("One",2),new Student("Two",4),new Student("Three",6),new Student("Four",8));
 List<Student> result = students.stream()
         .filter(s->s.getGrade()>4)
         .collect(Collectors.toList());

    System.out.println(result.size());
    result.stream()
            .forEach(s-> System.out.println(s.getName()));

//===============================================================================================
}

String nameCorrect(String n){
    return n.substring(0,1).toUpperCase()+n.substring(1).toLowerCase();
}


