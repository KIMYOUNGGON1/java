package p09.textbook.s090401;

public class CallListener implements Button.onClickListener {
	@Override
	public void onClick() {
		System.out.println("전화를 건다.");
	}
}
