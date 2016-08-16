package advanced_6.aneka_collection;

import java.util.Comparator;

/* Menggunakan referensi Class lain (ClassExample) untuk tipe 
 * data generic, didalamnya tidak ada properti 
 * seperti menggunakan comparable */

public class ComparatorExample implements Comparator<ClassExample> {

	@Override
	public int compare(ClassExample arg0, ClassExample arg1) {
		return arg0.getId().compareTo(arg1.getId());
	}

}
