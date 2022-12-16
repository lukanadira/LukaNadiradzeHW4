import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductUtil {

    private ProductUtil() {
    }

    public static void createTable() {

        String createSql = "CREATE TABLE PRODUCTS (" +
                "ID INTEGER NOT NULL AUTO_INCREMENT, " +
                "NAME_ VARCHAR(255), " +
                "COLOR VARCHAR(255)," +
                "YEAR_ INTEGER NOT NULL," +
                "PRIMARY KEY(ID))";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Created table in given database...");

    }

    public static void insert(Product product) {

        String insertSql = "INSERT INTO PRODUCTS(NAME_, COLOR, YEAR_) VALUES(" +
                "'" + product.getName() + "', " +
                "'" + product.getColor() + "', " +
                "" + product.getYear() + ")";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<Product> getAllProducts() {

        String selectSql = "SELECT * FROM PRODUCTS";

        List<Product> products = new ArrayList<>();

        try {

            ResultSet resultSet = JDBCUtil.getStatement().executeQuery(selectSql);

            while (resultSet.next()) {

                products.add(new Product(
                        resultSet.getLong("ID"),
                        resultSet.getString("NAME_"),
                        resultSet.getString("COLOR"),
                        resultSet.getInt("YEAR_")
                ));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;

    }

    public static void updateProducts(long id, String newName) {

        String updateSql = "UPDATE PRODUCTS SET NAME_ = '" + newName + "' WHERE ID = " + id;

        try {
            JDBCUtil.getStatement().executeUpdate(updateSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteProduct(long id) {

        String deleteAll = "DELETE FROM PRODUCTS WHERE ID = " + id;

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void deleteAll() {

        String deleteAll = "DELETE FROM PRODUCTS";

        try {
            JDBCUtil.getStatement().executeUpdate(deleteAll);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
