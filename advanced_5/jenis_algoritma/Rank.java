package advanced_5.jenis_algoritma;

public class Rank {
	public static void lihatHasil() {
		Rank p = new Rank();
		System.out.print("3 pangkat 6 =  ");
		System.out.print(p.HitungPangkat(3, 6));
	}

	public int HitungPangkat(int x, int y) {
		if (y == 1) {
			return x;
		} else {
			return x * HitungPangkat(x, y - 1);
		}
	}
}