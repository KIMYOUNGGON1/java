package P06.lecture.p3constructor;

public class computer {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
	
	computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}
	
	computer(String model, int memory) {
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	
	
	computer(String model) {
		this.model =model;
		this.memory = 4;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
//	computer(String cpu) {
//		this.model = "hp";
//		this.memory = 4;
//		this.ssd = 128;
//	
//	computer(String cpu, int ssd) {
//		
//	}


}
