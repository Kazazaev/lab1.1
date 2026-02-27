class Rectangle {
    double width;
    double height;
    
    public Rectangle() {
        width = -1;
        height = -1;
    }
    
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle[] rects = new Rectangle[10];
        
        // Создаем прямоугольники
        for (int i = 0; i < rects.length; i++) {
            rects[i] = new Rectangle(i + 1, (i + 1) * 2);
        }
        
        // Выводим информацию
        for (int i = 0; i < rects.length; i++) {
            System.out.println("Прямоугольник " + (i + 1) + ":");
            System.out.println("Ширина = " + rects[i].width);
            System.out.println("Высота = " + rects[i].height);
            System.out.println("Периметр = " + rects[i].getPerimeter());
            System.out.println("Площадь = " + rects[i].getArea());
            System.out.println();
        }
    }
}
