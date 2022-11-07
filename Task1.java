package Tasks_02;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//  Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

public class Task1 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task1.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        int[] arr = new int[] {10,5,3,9,2};
        int arrayLength = arr.length;
        for (int i = 1; i < arrayLength; i++) {
            for (int y = 0; y < arrayLength-i; y++) {
                if (arr[y] > arr[y+1]) {
                    logger.info("Проход "+ i +" меняем "+arr[y]+" на "+arr[y+1]);
                    int max = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = max;
                }
            }    
        }
        for (int index = 0; index < arrayLength; index++) {
            System.out.printf("%s ", arr[index]);                        
        }
    }
}