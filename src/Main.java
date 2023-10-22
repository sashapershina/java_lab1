import java.util.Scanner;

public class Main {

    private static Container container = new Container();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Меню:\n" +
                    "1. Добавить элемент (int)\n" +
                    "2. Вывести содержимое\n" +
                    "3. Удалить по индексу\n" +
                    "0: Выход");
            int ans = input.nextInt();
            switch (ans) {
                case 1:
                    container.Add(input.nextInt());
                    break;
                case 2:
                    for (int i = 0; i < container.getSize(); i++) {
                        System.out.print(container.ElementAt(i) + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("0 <= idx <= " + (container.getSize() - 1));
                    container.RemoveAt(input.nextInt());
                    break;
                case 0:
                    return;
            }
        }

    }
}