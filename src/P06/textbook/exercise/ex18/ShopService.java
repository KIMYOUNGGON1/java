package P06.textbook.exercise.ex18;

public class ShopService {
	private static ShopService a = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance () {
		return a;
	}
	
}
