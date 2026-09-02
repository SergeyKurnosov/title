//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    /*
     1.Метод принимает пот пользовтеля возраст, возвращает boolean — подходит человек под условие или нет.
     */

    System.out.println("age : ");
    int age = scanner.nextInt();
    System.out.println("Adult : " + isAdult(age));
    //========================================================================
    /*
    2.Создать метод который проверяет, простое ли число, используя цикл внутри метода.
     */
    System.out.println("num : ");
    int num = scanner.nextInt();
    System.out.println("Simple : " + isSimple(num));
    //========================================================================
    /*
    3.Метод считает количество гласных букв в строке, перебирая символы через charAt.
     */
    scanner.nextLine();
    System.out.println("line : ");
    String line = scanner.nextLine();
    System.out.println("vowel letters : " + countVowelLetters(line));
    //========================================================================
    /*
    4.Программа в цикле принимает оценки (2–5), пока не введут слово «стоп»; невалидные оценки отклоняет, но не прерывает работу; в конце считает средний балл и выдаёт вердикт
     */

    String grade = "";
    String grades="";
    String[]dates = new String[]{grade,grades};
    do {
        System.out.println("grade : ");
        dates[0] = scanner.nextLine();
        addGradeToGrades(dates);
    }while (!dates[0].equals("стоп"));

    double middle = middleGradeToGrades(dates);
    System.out.println("middle grade : " + middle);

}

private static boolean isAdult(int age){
    if(age >= 18){
        return true;
    }
    return false;
}
private static boolean isSimple(int num){
    if(num == 1){
        return false;
    }
    for (int i = 2; i < num; i++) {
        if(num%i==0){
            return false;
        }
    }

    return true;
}
private static int countVowelLetters(String line){
    int count = 0;
    for (int i = 0; i <line.length(); i++) {
        char toLowerchar = Character.toLowerCase(line.charAt(i));
        if(toLowerchar == 'a' || toLowerchar == 'e' || toLowerchar == 'i' || toLowerchar == 'o' || toLowerchar == 'u'){
            count++;
        }
    }
    return count;
}

private static void addGradeToGrades(String[]dates){
    if(!dates[0].isEmpty() && dates[0].length()==1){
            if(!Character.isDigit(dates[0].charAt(0))){
                return;
            }
            else {
                dates[1]+=dates[0];
            }
    }
}

private static double middleGradeToGrades(String[]dates){
    double result = 0.0;
    double sum = 0;
    for (int i = 0; i < dates[1].length(); i++) {
        sum+=Integer.parseInt(String.valueOf(dates[1].charAt(i)));
    }
    result = sum / dates[1].length();
    return result;
}


