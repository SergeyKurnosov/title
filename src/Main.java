

void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
/*
1.Создать ArrayList<String> — список покупок. В цикле считывать с клавиатуры названия товаров, пока не будет введено слово "стоп"
(сигнальное значение). После этого вывести весь список. Затем считать с клавиатуры название товара для удаления, удалить его из списка
через remove() (если такого товара нет — вывести "Товар не найден"), вывести итоговый список и его размер.
*/
    List<String> list = new ArrayList<>();
    String word;
    do {
        System.out.println("товар:");
        word = scanner.nextLine();
        list.add(word);
    }while (!word.equals("стоп"));
    list.remove(list.size()-1);
    System.out.println(list);

    System.out.println("товар для удаления:");
    word = scanner.nextLine();
    if(list.contains(word)){
        list.remove(word);
    }
    else{
        System.out.println("Товар не найден");
    }
    System.out.println(list);
    System.out.println(list.size());

//===============================================================================================
/*
2.Считать с клавиатуры N слов в цикле, добавляя каждое в ArrayList<String>. Создать HashSet<String> из этого списка (new HashSet<>(list))
и вывести его размер в сравнении с размером исходного списка — так наглядно видно, сколько было повторов. Вывести сами уникальные слова из Set.
 */
    List<String> list2 = new ArrayList<>();
    String word2;
    do {
        System.out.println("слово:");
        word2 = scanner.nextLine();
        list2.add(word2);
    } while (!word2.equals("стоп"));
    list2.remove(list2.size() - 1);
    System.out.println(list2);
    System.out.println(list2.size());

    Set<String> set = new HashSet<>(list2);
    System.out.println(set);
    System.out.println(set.size());

//===============================================================================================
/*
3.Считать с клавиатуры предложение, разбить на слова через split(" "). Создать HashMap<String, Integer> и посчитать, сколько раз встречается
каждое слово (проверять containsKey, если есть — увеличивать счётчик через put(word, map.get(word) + 1), если нет — put(word, 1)).
Вывести итоговую таблицу "слово — количество" (перебор через for (String key : map.keySet()) или entrySet()).
 */
    System.out.println("Предложение:");
    String str = scanner.nextLine();
    str  = str.toLowerCase();
    String[] words = str.split(" ");
    Map<String, Integer> map = new HashMap<>();
    for(String word3:words){
        if(map.containsKey(word3)){
            map.put(word3, map.get(word3)+1);
        }
        else {
            map.put(word3,1);
        }
    }

    System.out.println("Слово:   |Количество:");
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
        System.out.println(entry.getKey()+"   "+entry.getValue());

    }
//===============================================================================================
/*
Создать ArrayList<Integer> из чисел от 1 до 10. Задача в два этапа:
Написать код, который в цикле for-each пытается удалить из списка все чётные числа через list.remove(number) прямо во время перебора — и
убедиться, что программа падает с ConcurrentModificationException (важно, чтобы студент реально это увидел и понял, почему нельзя изменять
коллекцию во время итерации по ней обычным for-each).
Исправить это, используя Iterator<Integer> напрямую (iterator(), hasNext(), next()) и его собственный метод remove(),
который единственный умеет безопасно удалять элемент во время итерации.
 */

    List<Integer> ints = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        ints.add(i);
    }
    System.out.println(ints);
    for (Integer int_ : ints){
        if(int_%2==0){
            ints.remove(int_);
        }
    }
    /*
    ОШИБКА!!!!!!!!
    Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
	at Main.main(Main.java:89)
     */
    Iterator<Integer>iterator = ints.iterator();
    while (iterator.hasNext()){
        Integer int_ = iterator.next();
        if(int_%2==0){
            iterator.remove();
        }
    }
    System.out.println(ints);


    scanner.close();
}


