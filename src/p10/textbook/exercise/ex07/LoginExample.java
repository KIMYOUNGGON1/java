package p10.textbook.exercise.ex07;

public class LoginExample {
	public static void main(String[] args) {
		
	}
	
	public static void login(String id, String password) throws NotExistIDException {
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
