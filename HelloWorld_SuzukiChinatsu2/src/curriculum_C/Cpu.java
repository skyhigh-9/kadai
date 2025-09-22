package curriculum_C;

import java.util.Random;

public class Cpu {
	
	public int getCpu() {
	//CPUの手札ランダムにする
	Random ran = new Random();
    int num = ran.nextInt(3);
	return num;
	}
		
	
}
