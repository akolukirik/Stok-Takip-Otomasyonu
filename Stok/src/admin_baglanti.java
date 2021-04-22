import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class admin_baglanti {
	
	//Bu class üzerinden admin için gerekli baglantý gerçekleþtiriþmiþtir.

	static String url = "jdbc:postgresql://localhost:5432/stok";
	static Connection conn = null;

	static ResultSet sorgu() {
		ResultSet rs = null;
		try {

			conn = DriverManager.getConnection(url, "postgres", "1234");
			Statement st = conn.createStatement();
			rs = st.executeQuery("select * from giris");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}

	static ResultSet sorgula(String sorgu) {

		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(url, "postgres", "1234");
			Statement st = conn.createStatement();
			rs = st.executeQuery(sorgu);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rs;
	}

}