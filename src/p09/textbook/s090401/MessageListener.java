package p09.textbook.s090401;

public class MessageListener implements Button.onClickListener{
	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");	
	}
}
