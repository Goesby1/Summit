package AbstractClass;

class Triangle extends Shape {

	@Override
	public void printArea() {
		System.out.print( (.5 * (double) (super.first * super.second) ) );
	}

}
