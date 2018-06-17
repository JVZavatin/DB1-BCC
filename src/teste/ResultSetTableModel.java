package teste;

//import dao.Config; Criar dao
import java.sql.*;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author André Schwerz
 */
public class ResultSetTableModel extends AbstractTableModel {

    private Connection connection;

    private final Statement statement;
    private final ResultSet resultSet;
    private final ResultSetMetaData metaData;
    private final int numberOfRows;

    private boolean connectedToDatabase = false;

    private void setDatabaseURL() throws SQLException {
        connection = DriverManager.getConnection(Config.URL, Config.LOGIN, Config.PASSWORD);
    }

    public ResultSetTableModel(String sql) throws SQLException {
        setDatabaseURL();
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statement.executeQuery(sql);
        metaData = resultSet.getMetaData();
        resultSet.last();
        numberOfRows = resultSet.getRow();
        connectedToDatabase = true;
        this.fireTableStructureChanged();
    }

    @Override
    public Class getColumnClass(int column) throws IllegalStateException {
        try {
            String className = metaData.getColumnClassName(column + 1);
            return Class.forName(className);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return Object.class;
    }

    @Override
    public int getColumnCount() throws IllegalStateException {
        try {
            return metaData.getColumnCount();
        } catch (SQLException sex) {
            System.out.println(sex.getMessage());
        }
        return 0;
    }

    @Override
    public String getColumnName(int column) throws IllegalStateException {
        try {
            return metaData.getColumnLabel(column + 1);
        } catch (SQLException sex) {
            System.out.println(sex.getMessage());
        }
        return "";
    }

    @Override
    public int getRowCount() throws IllegalStateException {
        return numberOfRows;
    }

    @Override
    public Object getValueAt(int row, int column)
            throws IllegalStateException {

        try {
            resultSet.absolute(row + 1);
            return resultSet.getObject(column + 1);
        } catch (SQLException sex) {
            System.out.println(sex.getMessage());
        }

        return "";
    }

    public void disconnectFromDatabase() {
        if (connectedToDatabase) {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException sex) {
                System.out.println(sex.getMessage());
            } finally {
                connectedToDatabase = false;
            }
        }
    }
}
