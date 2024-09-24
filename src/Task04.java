import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Задача 4. Логирование операций с массивом во время поиска
минимального и максимального элементов
Реализуйте метод поиска минимального и максимального элементов массива.
После нахождения каждого элемента (минимального и максимального),
сделайте запись в лог-файл log.txt в формате год-месяц-день
час:минуты {минимальный элемент}, {максимальный элемент}
 */


public class Task04 {
    private static final Logger LOG = Log.log(Task04.class.getName());

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};
        int[] minMax= findMinMax(arr);
        int min = minMax[0];
        int max = minMax[1];
        System.out.println("Min:  "+ min);
        System.out.println("Max:  "+ max);

    }
    public static int[] findMinMax(int[] arr){
        SimpleDateFormat dateFormat = new
                SimpleDateFormat("yyyy-MM-dd HH:mm");
        int max = arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max< arr[i]) max = arr[i];
            else {
                if (min > arr[i]) min = arr[i];
            }
        }
        String timestamp = dateFormat.format(new Date());
        LOG.log(Level.INFO, timestamp + " Min: " + min + ", Max: " + max );

        return new int[]{min, max};
    }

}
