package advanced_8.kirim_email;

// Install terlebih dahulu javax.mail
// Dibutuhkan juga library com.sun.mail.util.MailLogger
// library ini sudah tersedia di java ee
// atau download disini http://www.java2s.com/Code/Jar/j/Downloadjavaxmail150jar.htm
// dan masukkan kedalam folder lib

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class KirimEmail {
	
	public void lihatHasil() {
		/* Email penerima */
		String to = "admin@gmail.com";

		/* Si pengirim email */
		String from = "fajarrdp@gmail.com";

		/* Asumsinya mengirim email dari localhost */
		String host = "localhost";

		/* Get system properties */
		Properties properties = System.getProperties();

		/* Setup mail server */
		properties.setProperty("mail.smtp.host", host);

		/* Dapatkan session object */
		Session session = Session.getDefaultInstance(properties);

		try {
			/* Buat default mimeMessage object */
			MimeMessage message = new MimeMessage(session);

			/* Header pengirim */
			message.setFrom(new InternetAddress(from));

			/* Tambahkan penerima */
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			/* Tambahkan judul pesan */
			message.setSubject("Judul pesan!");

			/* Sekarang buat pesan email-nya */
			message.setText("This is actual message");

			/* Kirim email */
			Transport.send(message);
			System.out.println("Pesan berhasil terkirim....");
			
		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
	}
	
	/* Jalankan file ini dengan cara,
	 * Klik kanan -> Run As -> Java Application
	 */		
	public static void main(String[] args) {
		KirimEmail kirimEmail = new KirimEmail();
		kirimEmail.lihatHasil();
	}
}