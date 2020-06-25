package by.epam.javaonline.algoritmization.decomposition;

//���� ����� X, Y, Z, � � ����� ������ ����������������. 

//�������� �����(������) ���������� ��� �������, ���� ���� ����� ��������� ������ X � Y� ������. 

public class Task9 {

	public static void main(String[] args) {

		int x, y, z, t;

		x = 10;
		y = 15;
		z = 12;
		t = 13;

		quadrangleSquare(x, y, z, t);
	}

	public static void quadrangleSquare(int x, int y, int z, int t) {

		double halfPerimeter;
		double square;
		
		halfPerimeter = (x + y + z + t) / 2;		
		square = Math.sqrt((halfPerimeter - x) * (halfPerimeter - y) * (halfPerimeter - z) * (halfPerimeter - t));
		System.out.println("������� = " + square);
	}

}
