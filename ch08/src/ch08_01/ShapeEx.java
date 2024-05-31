package ch08_01;

public class ShapeEx {

	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		sh[0] = new Triangle();
		sh[1] = new Rectangle();
		sh[2] = new Circle();
		for (Shape s:sh) {
			s.print();
			s.draw();
			if (s instanceof Rectangle) {
				((Rectangle)s).display();
			}
		}

	}

}
