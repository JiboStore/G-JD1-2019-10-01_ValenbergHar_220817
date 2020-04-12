package headfirst.socets;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviceServer {
	String[] adviceList = { "����� �������� ��������", "������ ���������� ������. ���,��� �� ������ ��� ������.",
			"��� �����: �� �������",
			"������ ������ ���� �� �������.  ������� ������ ���������� ���, ��� �� *�� ����� ����* � ��� �������.",
			"��������, ��� ����� ��������� ������ ��������." };

	public void go() {

		ServerSocket serverSock;
		try {
			serverSock = new ServerSocket(4242);
			while (true) {
				Socket sock = serverSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close();
				System.out.println(advice);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private String getAdvice() {
		int random = (int) (Math.random() * adviceList.length);
		return adviceList[random];
	}

	public static void main(String[] args) {

	}

}
