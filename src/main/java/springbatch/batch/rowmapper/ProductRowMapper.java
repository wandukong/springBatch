package springbatch.batch.rowmapper;

import org.springframework.jdbc.core.RowMapper;
import springbatch.batch.domain.ProductVO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<ProductVO> {
    @Override
    public ProductVO mapRow(ResultSet resultSet, int i) throws SQLException {
        return null;
    }
}
