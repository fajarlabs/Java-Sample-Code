package basic_15.date_dasar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDasar {
	public void cetakHasil() {
		// Ambil data date
		Date date = new Date();
		// Format date-nya
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// Hasil 24-07-2016 12:53:45
		System.out.println(simpleDateFormat.format(date));
	}
}
