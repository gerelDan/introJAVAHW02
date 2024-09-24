/*
Задача 2. Создание CSV-строки из массива объектов
Дан массив объектов, где каждый объект представляет собой строку данных, и
массив заголовков. Создайте строку CSV, где строки данных разделяются новой
строкой, а значения в строках разделяются запятыми.
Пример:
String[] headers = {"Name", "Age", "City"};
String[][] data = {
{"John", "30", "New York"},
{"Alice", "25", "Los Angeles"},
{"Bob", "35", "Chicago"}
};
Результат:
Name,Age,City
John,30,New York
Alice,25,Los Angeles
Bob,35,Chicago
 */

public class Task02 {
    public static void main(String[] args) {
        String[] headers = {"Name", "Age", "City"};
        String[][] data = {
                {"John", "30", "New York"},
                {"Alice", "25", "Los Angeles"},
                {"Bob", "35", "Chicago"}
        };
        String CSVString = createCSVString(headers, data);
        System.out.println(CSVString);

    }
    public static String createCSVString(String[] headers, String[][] data){
        StringBuilder CSVString = new StringBuilder();
        CSVString.append(String.join(",", headers) + "\n");
        for (String[] datum : data) {
            CSVString.append(String.join(",", datum)+"\n");
        }
        return CSVString.toString();
    }


}