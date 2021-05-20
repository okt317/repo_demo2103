package design.duck;
/*
 * 단독으로는 인스턴스화를 할 수 없다
 * 반드시 구현체 클래스가 있어야한다
 * 메소드 오버라이딩을 꼭 해야한다
 * 만일 하지 않으면 너도 인터페이스가 되야한다
 */
public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날고있어");
		// TODO Auto-generated method stub

	}

}
