package test;

public class basicTest {
	
	public static int average(int value[], int min, int max) {
		int i =0;
		int inputNumber = 0;
		int validNumber = 0;
		int sum = 0;
		int average;
		int a = 112233445566;
		
		while((value[i]!=-999)&& inputNumber<100) {
			inputNumber++;
			if(value[i]>=min && value[i]<=max) {
				validNumber++;
				sum = sum + value[i];
			}else continue;
			i++;
		}
		if(validNumber > 0) {
			average = sum/validNumber;
		}else
			average = -999;
		return average;
	}

	public static void main(String[] args) {
		int value[] = new int[2];
		System.out.println(average(value,0,1));
	}

}
