package cn.hongmao.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import cn.jasonone.him.model.HimStatus;

@MappedJdbcTypes(JdbcType.INTEGER)
public class StatusHandler extends BaseTypeHandler<HimStatus> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, HimStatus parameter, JdbcType jdbcType)
			throws SQLException {
		if(parameter.name().equals("HIDE")){
			ps.setInt(i, 0);
		}else {
			ps.setInt(i, 1);
		}
	}

	@Override
	public HimStatus getNullableResult(ResultSet rs, String columnName) throws SQLException {
		int id = rs.getInt(columnName);
		if(id == 0){
			return HimStatus.HIDE;
		}else {
			return HimStatus.ONLINE;
		}
	}

	@Override
	public HimStatus getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		int id = rs.getInt(columnIndex);
		if(id == 0){
			return HimStatus.HIDE;
		}else {
			return HimStatus.ONLINE;
		}
	}

	@Override
	public HimStatus getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		int id = cs.getInt(columnIndex);
		if(id == 0){
			return HimStatus.HIDE;
		}else {
			return HimStatus.ONLINE;
		}
	}

}
