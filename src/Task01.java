//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Дана строка базового URL:
https://example.com/search?
Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
передаются в виде строки, где ключи и значения разделены =, а пары
ключ-значение разделены &. Если значение null, то параметр не должен
попадать в URL.
Пример:
params = "query=java&sort=desc&filter=null"
Результат:
https://example.com/search?query=java&sort=desc
 */
public class Task01 {
    public static void main(String[] args) {
        String params = "query=java&sort=desc&filter=null";
        String startUrl = "https://example.com/search?";
        String resultUrl = getURL(startUrl,params);
        System.out.println(resultUrl);
    }
    public static String getURL(String startUrl, String params){
        StringBuilder sb = new StringBuilder();
        sb.append(startUrl);
        String[] listParams = params.split("&");
        for (String listParam : listParams) {
            if (!listParam.split("=")[1].equalsIgnoreCase("null")){
                sb.append("&"  + listParam);
            }
        }
        return sb.toString();
    }

}