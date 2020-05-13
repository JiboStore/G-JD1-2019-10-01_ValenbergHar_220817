package grokaemalg;

import java.util.List;

public class BinarySearch1 {
	static Integer searchInList(Integer[] array, int searchItem) {
		int countOperation = 0; // ������� ��������

		int lowIndex = 0; // ������� ��������� ������
		int highIndex = array.length - 1; // ������� ��������� ������

		Integer resultIndex = null; // �������� ���������

		while (lowIndex <= highIndex) // ���� ��������� ������ ������ ��������, �� ���������� ������
		{
			countOperation++; // ��������� � �������� ��������

			int mediumIndex = (lowIndex + highIndex) / 2; // ������� ������� ������
			int currentItem = array[mediumIndex]; // � ��� �����

			if (currentItem == searchItem) // ����� �����
			{
				resultIndex = mediumIndex;
				break;
			} else if (currentItem < searchItem) // ���� ������� ����� ������ ���������
			{
				lowIndex = mediumIndex + 1; // ��������� � ���������� ������� ������ �� ��������
			} else {
				highIndex = mediumIndex - 1; // ��������� � ���������� ������� ����� �� ��������
			}
		}

		System.out.println("BinarySearch O: " + countOperation);

		return resultIndex;
	}
}