package JAVA.OOP;
import java.util.Scanner;



public class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();

        System.out.print("Введите ширину прямоугольника: ");
        rectangle2.setWidth(scanner.nextInt());

        System.out.print("Введите высоту прямоугольника: ");
        rectangle2.setHeight(scanner.nextInt());

        System.out.println("///////////");
                rectangle1.Start();
                rectangle1.result();
                rectangle1.End();

        System.out.println("///////////");
                rectangle2.Start1();
                rectangle2.result();
                rectangle2.End();

/// 1)В предыдущем ДЗ добавить реализацию собственного функционального интерфейса.                
System.out.println("Сумма по площадей:" + rectangle1.SumArea(rectangle1, rectangle2));
/// 2)Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ, предоставив собственную реализацию.
System.out.println("Сравнение по площади:");
        if (rectangle1.compareTo(rectangle2) == -1) 
                System.out.println("Площадь первого прямоугольника меньше второго");
        else if (rectangle1.compareTo(rectangle2) == 0) 
                System.out.println("Площадь прямоугольников равны");
        else
                System.out.println("Площадь первого прямоугольника больше второго");

}       
}
