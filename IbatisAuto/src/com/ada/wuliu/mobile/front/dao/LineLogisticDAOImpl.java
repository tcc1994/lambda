package com.ada.wuliu.mobile.front.dao;

import com.ada.wuliu.shipper.front.domian.LineLogistic;
import com.ada.wuliu.shipper.front.domian.LineLogisticExample;
import com.ibatis.sqlmap.client.SqlMapClient;
import java.sql.SQLException;
import java.util.List;

public class LineLogisticDAOImpl implements LineLogisticDAO {

	/**
	 * This field was generated by Abator for iBATIS. This field corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	private SqlMapClient sqlMapClient;

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public LineLogisticDAOImpl() {
		super();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public SqlMapClient getSqlMapClient() {
		return sqlMapClient;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public Long insert(LineLogistic record) throws SQLException {
		Object newKey = sqlMapClient.insert(
				"adwl_line_logistic.abatorgenerated_insert", record);
		return (Long) newKey;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public int updateByPrimaryKey(LineLogistic record) throws SQLException {
		int rows = sqlMapClient
				.update("adwl_line_logistic.abatorgenerated_updateByPrimaryKey",
						record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public int updateByPrimaryKeySelective(LineLogistic record)
			throws SQLException {
		int rows = sqlMapClient
				.update("adwl_line_logistic.abatorgenerated_updateByPrimaryKeySelective",
						record);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public List selectByExample(LineLogisticExample example)
			throws SQLException {
		List list = sqlMapClient.queryForList(
				"adwl_line_logistic.abatorgenerated_selectByExample", example);
		return list;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public LineLogistic selectByPrimaryKey(Long llId) throws SQLException {
		LineLogistic key = new LineLogistic();
		key.setLlId(llId);
		LineLogistic record = (LineLogistic) sqlMapClient.queryForObject(
				"adwl_line_logistic.abatorgenerated_selectByPrimaryKey", key);
		return record;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public int deleteByExample(LineLogisticExample example) throws SQLException {
		int rows = sqlMapClient.delete(
				"adwl_line_logistic.abatorgenerated_deleteByExample", example);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public int deleteByPrimaryKey(Long llId) throws SQLException {
		LineLogistic key = new LineLogistic();
		key.setLlId(llId);
		int rows = sqlMapClient.delete(
				"adwl_line_logistic.abatorgenerated_deleteByPrimaryKey", key);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public int countByExample(LineLogisticExample example) throws SQLException {
		Integer count = (Integer) sqlMapClient.queryForObject(
				"adwl_line_logistic.abatorgenerated_countByExample", example);
		return count.intValue();
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public int updateByExampleSelective(LineLogistic record,
			LineLogisticExample example) throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = sqlMapClient.update(
				"adwl_line_logistic.abatorgenerated_updateByExampleSelective",
				parms);
		return rows;
	}

	/**
	 * This method was generated by Abator for iBATIS. This method corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	public int updateByExample(LineLogistic record, LineLogisticExample example)
			throws SQLException {
		UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
		int rows = sqlMapClient.update(
				"adwl_line_logistic.abatorgenerated_updateByExample", parms);
		return rows;
	}

	/**
	 * This class was generated by Abator for iBATIS. This class corresponds to the database table adwl_line_logistic
	 * @abatorgenerated  Thu Dec 20 13:01:58 CST 2018
	 */
	private static class UpdateByExampleParms extends LineLogisticExample {
		private Object record;

		public UpdateByExampleParms(Object record, LineLogisticExample example) {
			super(example);
			this.record = record;
		}

		public Object getRecord() {
			return record;
		}
	}
}