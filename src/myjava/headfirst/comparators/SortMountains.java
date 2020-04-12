package headfirst.comparators;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortMountains {
	List<Mountain> mtn = new LinkedList<Mountain>();

	class NameCompare implements Comparator<Mountain> {

		@Override
		public int compare(Mountain o1, Mountain o2) {
			return o1.name.compareTo(o2.name);
		}

	}

	class HeightCompare implements Comparator<Mountain> {

		@Override
		public int compare(Mountain o1, Mountain o2) {
			return o2.height - o1.height;
		}

	}

	public static void main(String[] args) {
		new SortMountains().go();

	}

	private void go() {
		mtn.add(new Mountain("�����������", 12500));
		mtn.add(new Mountain("̳�����", 10000));
		mtn.add(new Mountain("³����", 11000));
		mtn.add(new Mountain("����", 9000));

		System.out.println("� ������� ����������:\n" + mtn);
		NameCompare nc = new NameCompare();
		Collections.sort(mtn, nc);
		System.out.println("�� ��������:\n" + mtn);
		HeightCompare he = new HeightCompare();
		Collections.sort(mtn, he);
		System.out.println("�� ������:\n" + mtn);

	}

}
