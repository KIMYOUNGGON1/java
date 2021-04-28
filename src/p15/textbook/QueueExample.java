package p15.textbook;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messagequeue = new LinkedList<Message>();
		
		messagequeue.offer(new Message("sendMail", "홍길동"));
		messagequeue.offer(new Message("sendSMS", "신용권"));
		messagequeue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messagequeue.isEmpty()) {
			Message message = messagequeue.poll();
			switch (message.Command) {
			case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS을 보냅니다.");
			break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
			break;
			}
		}
	}
}
