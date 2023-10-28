package SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlHelper {
    private final ConnectionFactory connectionFactory;

    public SqlHelper(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }

    public void execute(String sql) {
        try {
            execute(sql, PreparedStatement::execute);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public <T> T execute(String sql, SqlExecutor<T> executor) throws SQLException {
        try (Connection conn = connectionFactory.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            return executor.execute(ps);
        } catch (SQLException e) {
            throw e;
        }
    }
}
