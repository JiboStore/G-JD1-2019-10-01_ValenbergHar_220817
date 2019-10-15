package by.academy.java.maskevich.Homework;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		System.out.print("������� ���������� ���������� �������: ");
		Scanner in = new Scanner(System.in);
		int kolich = in.nextInt();

		int mas[] = new int[kolich];
		int numbers[] = new int[kolich];

		System.out.print("������� �����: ");
		for (int i = 0; i < kolich; i++) {
		mas[i] = in.nextInt();
		numbers[i] = (mas[i] + "").length();
		}
		System.out.print("���������� ������: ");
		for (int i = 0; i < mas.length; i++) {
		System.out.print(mas[i] + " ");
		System.out.print(numbers[i] + " ");
		}
		System.out.println("\n__________________");

		numbersLength(mas, numbers, kolich);
		System.out.println("\n__________________");
		numbersAverage(mas, numbers, kolich);
		System.out.println("\n__________________");
		numberEven(mas);

		}
	

		// ������� �� ������� ����� �������� � ����� ������� �����,
		// � ����� �� �����. ���� ����� � ���������� ������
		// ��������� - ������� ������ �� �������
		private static void numbersLength(int[] mas, int[] numbers, int kolich) {
		int bignum = numbers[0];
		int smallnum = numbers[0];
		int big = 0, small = 0;
		for (int i = 0; i < mas.length; i++) {
		small = i;
		smallnum = (mas[i] + "").length();
		}

		for (int i = 0; i > mas.length; i++) {
		big = i;
		bignum = (mas[i] + "").length();
		}
		System.out.printf("������� �����: %d, ���������� ����: %d", mas[big], bignum);
		System.out.printf("\n ������� �����: %d, ���������� ����: %d", mas[small], smallnum);
		}

		// ������� �� ������� �� �����, ����� �������
		// ������ (������) �������, � ����� �����
		private static void numbersAverage(int[] mas, int[] numbers, int kolich) {
		float aver = 0;
		float d = kolich;
		int bigger = 0;
		int smaller = 0;
		int bignum = numbers[0];
		int smallnum = numbers[0];

		for (int i = 0; i < kolich; i++) {
		aver = aver + numbers[i];
		}
		aver = aver / d;
		System.out.println("\n ������� �����: " + aver);
		System.out.printf("\n �����, ����� ������� ������ �������: ");

		for (int i = 0; i < kolich; i++) {
		if (aver > numbers[i]) {
		smaller = mas[i];
		smallnum = (mas[i] + "").length();
		System.out.printf("\n �����: %d, ���������� ����: %d", smaller, smallnum);
		}

		}
		System.out.printf("\n �����, ����� ������� ������ �������: ");
		for (int i = 0; i < kolich; i++) {
		if (aver < numbers[i]) {
		bigger = mas[i];
		bignum = (mas[i] + "").length();
		System.out.printf("\n �����: %d, ���������� ����: %d", bigger, bignum);
		}
		}
		}
		
		
		private static void numberEven(int[] mas) {
			int a=0;
			int b=0;
			int c=0;
			for (int i= 0; i<mas.length; i++) {
				if((mas[i]%2==0)&&(mas[i]>=22)) {
					while (mas[i]!=0) {
						if(mas[i]%2==0) {
							a=a+1;
						}
						mas[i]=mas[i]/10;
						b=b+1;
					}
					if(a==b) {
						c=c+1;
						
					}
				}
			}
			System.out.println("���������� �����, ���������� ������ ������ �����: " + c);
		}}
			


