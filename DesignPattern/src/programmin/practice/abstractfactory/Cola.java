package programmin.practice.abstractfactory;

public class Cola extends Beverage {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("콜라 뚜껑 열기");
	}

	@Override
	public void putInCup() {
		// TODO Auto-generated method stub
		System.out.println("콜라 컴에 담기");
	}

}
