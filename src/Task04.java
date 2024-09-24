/*
Задача 4. Логирование операций с массивом во время поиска
минимального и максимального элементов
Реализуйте метод поиска минимального и максимального элементов массива.
После нахождения каждого элемента (минимального и максимального),
сделайте запись в лог-файл log.txt в формате год-месяц-день
час:минуты {минимальный элемент}, {максимальный элемент}
 */
public class Task04 {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};
        int[] minMax= findMinMax(arr);
        System.out.println("Min:  "+ minMax[0]);
        System.out.println("Max:  "+ minMax[1]);
    }
    public int[] findMinMax(int[] arr){
        int max = arr[0];
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max< arr[i]) max = arr[i];
            else {
                if (min > arr[i]) min = arr[i];
            }
        }

        return new int[]{min, max};
    }

}
