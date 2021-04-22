import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class baglanti {

	static String url = "jdbc:postgresql://localhost:5432/stok";
	static Connection conn;
	static Statement st;

	static ResultSet yap(String sorgu ) {
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(url, "postgres", "1234");
			st = conn.createStatement();
			rs = st.executeQuery(sorgu);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return rs;
	}

	static void ekle(String sorgu) {

		try {
			st.executeQuery(sorgu);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	static void guncelle(String sorgu) {

		try {

			st.executeUpdate(sorgu);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	static void sil(String sorgu) { 

		try {

			st.executeUpdate(sorgu);
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	static ResultSet ara(String sorgu) {

		ResultSet rs = null;

		try {

			rs = st.executeQuery(sorgu);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return rs;

	}

}
