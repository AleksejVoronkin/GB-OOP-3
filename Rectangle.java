package JAVA.OOP;


public class Rectangle implements InterFace, Const, Def, Comparable<Rectangle>, CustomInterFace {
    
    public void Start(){
        System.out.println("НАЧАЛО РАБОТЫ КОНСТАНТЫ");
        System.out.println();
    }
    public void Start1(){
        System.out.println("НАЧАЛО РАБОТЫ ПРОГРАММЫ");
        System.out.println();
    }
    public void End(){
        System.out.println();
        System.out.println("КОНЕЦ РАБОТЫ ПРОГРАММЫ");
    }

    private int width;
    private int height;

       // Конструктор без параметров, который создает прямоугольник 2 на 1.
    public Rectangle() {    
        width = W; 
        height = H;
    }
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }

    public void result() {
        System.out.println("Ширина: " + getWidth()+Cm());
        System.out.println("Высота: " + getHeight()+Cm());
        System.out.println("Периметр: " + calculatePerimeter()+Cm());
        System.out.println("Площадь: " + calculateArea()+Cm2());
    }
////добавить реализацию собственного функционального интерфейса.
    @Override
    public int SumArea(Rectangle r1 ,Rectangle r2 ){
        int Sum = r1.calculateArea() + r2.calculateArea();
        return Sum;
    }
////Реализовать любой выбранный интерфейс из списка (Iterator<E>, Iterable<E>, Comparator<E>, Comparable<E>) в предыдущем ДЗ, предоставив собственную реализацию.
    @Override
    public int compareTo(Rectangle other) {
        int area1 = this.calculateArea();
        int area2 = other.calculateArea();
    
        if (area1 < area2) {
            return -1;
        } else if (area1 > area2) {
            return 1;
        } else {
            return 0;
        }
    }
}