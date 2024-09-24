/*
Задача 3. Удаление пустых строк из текста
Дана строка с несколькими строками текста, разделенными переводами строки.
Напишите метод, который удаляет все пустые строки из текста.
Пример:
line1

line2

line3
Результат:
line1
line2
line3
 */
public class Task03 {
    public static void main(String[] args) {
        String str = "line1\n" +
                "\n" +
                "line2\n" +
                "\n" +
                "line3";
        String res  = delEmptyString(str);
        System.out.println(res);
    }
    public static String delEmptyString(String str){
        String[] stringList = str.split("\n\n");
        String result = String.join("\n", stringList);
        return result;
    }



}
