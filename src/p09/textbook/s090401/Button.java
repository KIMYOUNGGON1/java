package p09.textbook.s090401;

public class Button {
	onClickListener listener;
	
	void setOnClickListener(onClickListener listner) {
		this.listener = listner;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface onClickListener {
		void onClick();
	}
}
