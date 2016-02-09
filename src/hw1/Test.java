package hw1;

public class Test {
	public static boolean make_bricks(int small,int big,int goal) {
		// small == 0
		if(small == 0){
			for(int i =1 ; i<= big ; i++){
				int tgoal = i*5;
				if(tgoal == goal){
					return true;
				}
			}
		}
		// if big == 0
		if(big == 0){
			for(int i =1 ; i<= small ; i++){
				int tgoal = i*1;
				if(tgoal == goal){
					return true;
				}
			}
		}
		// when big bricks are more than small bricks
		if(big > small){
			for (int i=1; i<= big;i++){
				for (int j = 1; j<=small;j++){
					int tgoal = 1*j + 5*i;
					if(tgoal == goal){
						return true;
					}
				}
			}
		}
		else if(small > big){
			for (int i=1; i<= small;i++){
				for (int j = 1; j<=big;j++){
					int tgoal = 1*j + 5*i;
					if(tgoal == goal){
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static boolean make_bricks1(int small,int big,int goal) {
		if(goal % 5 == 0){
			int div = goal / 5;
			if (div == big){
				return true;
			}
		}
		else {
			int rem = goal % 5;
			if(rem == small){
				return true;
			}
		}
		return false;
	}
}
