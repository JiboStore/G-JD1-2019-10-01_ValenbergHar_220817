package senla.task6;

import java.util.List;

public class Task6 {

	public static void main(String[] args) {

		List<Item> items = null;

		items.add(new Item("�����", 1, 600));
		items.add(new Item("�������", 2, 5000));
		items.add(new Item("�������", 4, 1500));
		items.add(new Item("�������", 2, 40000));
		items.add(new Item("�������", 1, 500));

		Backpack bp = new Backpack(10.1);
		bp.makeAllSets(items);
		List<Item> solve = bp.getBestSet();

		if (solve == null) {
			System.out.println("There is no result");
		} else {
			System.out.println(solve);
		}
	}
}
