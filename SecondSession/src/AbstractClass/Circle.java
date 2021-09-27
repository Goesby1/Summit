package AbstractClass;

class Circle extends Shape {
	

	
	@Override
	public void printArea() {
		System.out.println(  Math.PI * (super.first * super.first));
	}

	public static void main (String [] args) {
		
		Circle cir = new Circle();
		Rectangle sq = new Rectangle();
		Triangle tri = new Triangle();
		cir.first = 5;
		cir.printArea();
		
		sq.first = 5;
		sq.second = 5;
		sq.printArea();
		
		tri.first = 5;
		tri.second = 5;
		tri.printArea();
		
		
		
		
	}
}
