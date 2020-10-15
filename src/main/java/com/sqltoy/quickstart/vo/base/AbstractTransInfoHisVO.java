/**
 *@Generated by sagacity-quickvo 4.16
 */
package com.sqltoy.quickstart.vo.base;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.callback.SelectFields;
import org.sagacity.sqltoy.config.annotation.Id;
import org.sagacity.sqltoy.config.annotation.Column;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDate;

/**
 * @project sqltoy-quickstart
 * @version 1.0.0
 * Table: sqltoy_trans_info_his,Remark:支付交易流水表  
 */
@Entity(tableName="sqltoy_trans_info_his",pk_constraint="PRIMARY")
public abstract class AbstractTransInfoHisVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5000151558625857059L;
	
	/**
	 * jdbcType:VARCHAR
	 * 交易ID
	 */
	@Id(strategy="generator",generator="org.sagacity.sqltoy.plugins.id.DefaultIdGenerator")
	@Column(name="TRANS_ID",length=32L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String transId;
	
	/**
	 * jdbcType:VARCHAR
	 * 交易代码
	 */
	@Column(name="TRANS_CODE",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String transCode;
	
	/**
	 * jdbcType:VARCHAR
	 * 交易渠道
	 */
	@Column(name="TRANS_CHANNEL",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String transChannel;
	
	/**
	 * jdbcType:DECIMAL
	 * 交易金额
	 */
	@Column(name="TRANS_AMT",length=14L,type=java.sql.Types.DECIMAL,nullable=false)
	protected BigDecimal transAmt;
	
	/**
	 * jdbcType:DECIMAL
	 * 交易状态
	 */
	@Column(name="STATUS",length=1L,type=java.sql.Types.INTEGER,nullable=false)
	protected Integer status;
	
	/**
	 * jdbcType:VARCHAR
	 * 交易返回码
	 */
	@Column(name="RESULT_CODE",length=20L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String resultCode;
	
	/**
	 * jdbcType:DATETIME
	 * 交易时间
	 */
	@Column(name="TRANS_TIME",length=19L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDateTime transTime;
	
	/**
	 * jdbcType:DATE
	 * 交易日期
	 */
	@Column(name="TRANS_DATE",length=10L,type=java.sql.Types.DATE,nullable=false)
	protected LocalDate transDate;
	
	/**
	 * jdbcType:VARCHAR
	 * 用户ID
	 */
	@Column(name="USER_ID",length=32L,type=java.sql.Types.VARCHAR,nullable=false)
	protected String userId;
	
	/**
	 * jdbcType:VARCHAR
	 * 交易卡号
	 */
	@Column(name="CARD_NO",length=32L,type=java.sql.Types.VARCHAR,nullable=true)
	protected String cardNo;
	

	/** default constructor */
	public AbstractTransInfoHisVO() {
	}
	
	/** pk constructor */
	public AbstractTransInfoHisVO(String transId)
	{
		this.transId=transId;
	}

	
	/**
	 *@param transId the transId to set
	 */
	public AbstractTransInfoHisVO setTransId(String transId) {
		this.transId=transId;
		return this;
	}
		
	/**
	 *@return the TransId
	 */
	public String getTransId() {
	    return this.transId;
	}
	
	/**
	 *@param transCode the transCode to set
	 */
	public AbstractTransInfoHisVO setTransCode(String transCode) {
		this.transCode=transCode;
		return this;
	}
		
	/**
	 *@return the TransCode
	 */
	public String getTransCode() {
	    return this.transCode;
	}
	
	/**
	 *@param transChannel the transChannel to set
	 */
	public AbstractTransInfoHisVO setTransChannel(String transChannel) {
		this.transChannel=transChannel;
		return this;
	}
		
	/**
	 *@return the TransChannel
	 */
	public String getTransChannel() {
	    return this.transChannel;
	}
	
	/**
	 *@param transAmt the transAmt to set
	 */
	public AbstractTransInfoHisVO setTransAmt(BigDecimal transAmt) {
		this.transAmt=transAmt;
		return this;
	}
		
	/**
	 *@return the TransAmt
	 */
	public BigDecimal getTransAmt() {
	    return this.transAmt;
	}
	
	/**
	 *@param status the status to set
	 */
	public AbstractTransInfoHisVO setStatus(Integer status) {
		this.status=status;
		return this;
	}
		
	/**
	 *@return the Status
	 */
	public Integer getStatus() {
	    return this.status;
	}
	
	/**
	 *@param resultCode the resultCode to set
	 */
	public AbstractTransInfoHisVO setResultCode(String resultCode) {
		this.resultCode=resultCode;
		return this;
	}
		
	/**
	 *@return the ResultCode
	 */
	public String getResultCode() {
	    return this.resultCode;
	}
	
	/**
	 *@param transTime the transTime to set
	 */
	public AbstractTransInfoHisVO setTransTime(LocalDateTime transTime) {
		this.transTime=transTime;
		return this;
	}
		
	/**
	 *@return the TransTime
	 */
	public LocalDateTime getTransTime() {
	    return this.transTime;
	}
	
	/**
	 *@param transDate the transDate to set
	 */
	public AbstractTransInfoHisVO setTransDate(LocalDate transDate) {
		this.transDate=transDate;
		return this;
	}
		
	/**
	 *@return the TransDate
	 */
	public LocalDate getTransDate() {
	    return this.transDate;
	}
	
	/**
	 *@param userId the userId to set
	 */
	public AbstractTransInfoHisVO setUserId(String userId) {
		this.userId=userId;
		return this;
	}
		
	/**
	 *@return the UserId
	 */
	public String getUserId() {
	    return this.userId;
	}
	
	/**
	 *@param cardNo the cardNo to set
	 */
	public AbstractTransInfoHisVO setCardNo(String cardNo) {
		this.cardNo=cardNo;
		return this;
	}
		
	/**
	 *@return the CardNo
	 */
	public String getCardNo() {
	    return this.cardNo;
	}



	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		StringBuilder columnsBuffer=new StringBuilder();
		columnsBuffer.append("transId=").append(getTransId()).append("\n");
		columnsBuffer.append("transCode=").append(getTransCode()).append("\n");
		columnsBuffer.append("transChannel=").append(getTransChannel()).append("\n");
		columnsBuffer.append("transAmt=").append(getTransAmt()).append("\n");
		columnsBuffer.append("status=").append(getStatus()).append("\n");
		columnsBuffer.append("resultCode=").append(getResultCode()).append("\n");
		columnsBuffer.append("transTime=").append(getTransTime()).append("\n");
		columnsBuffer.append("transDate=").append(getTransDate()).append("\n");
		columnsBuffer.append("userId=").append(getUserId()).append("\n");
		columnsBuffer.append("cardNo=").append(getCardNo()).append("\n");
		return columnsBuffer.toString();
	}
	
	/**
	 * @TODO create entityQuery fields
	 */
	public static SelectFieldsImpl select() {
		return new SelectFieldsImpl();
	}
	
	public static class SelectFieldsImpl extends SelectFields {
		private List<String> fields = new ArrayList<String>();

		@Override
		public String[] getSelectFields() {
			String[] result = new String[fields.size()];
			fields.toArray(result);
			return result;
		}
		
	    public SelectFieldsImpl transId() {
	    	if (!fields.contains("transId")) {
				fields.add("transId");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl transCode() {
	    	if (!fields.contains("transCode")) {
				fields.add("transCode");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl transChannel() {
	    	if (!fields.contains("transChannel")) {
				fields.add("transChannel");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl transAmt() {
	    	if (!fields.contains("transAmt")) {
				fields.add("transAmt");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl status() {
	    	if (!fields.contains("status")) {
				fields.add("status");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl resultCode() {
	    	if (!fields.contains("resultCode")) {
				fields.add("resultCode");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl transTime() {
	    	if (!fields.contains("transTime")) {
				fields.add("transTime");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl transDate() {
	    	if (!fields.contains("transDate")) {
				fields.add("transDate");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl userId() {
	    	if (!fields.contains("userId")) {
				fields.add("userId");
			}
	    	return this;
	    }
    
	    public SelectFieldsImpl cardNo() {
	    	if (!fields.contains("cardNo")) {
				fields.add("cardNo");
			}
	    	return this;
	    }
    
	}
	
	public static class Fields {
        /**
         * 交易ID
         */
    	public static String transId="transId";
    
        /**
         * 交易代码
         */
    	public static String transCode="transCode";
    
        /**
         * 交易渠道
         */
    	public static String transChannel="transChannel";
    
        /**
         * 交易金额
         */
    	public static String transAmt="transAmt";
    
        /**
         * 交易状态
         */
    	public static String status="status";
    
        /**
         * 交易返回码
         */
    	public static String resultCode="resultCode";
    
        /**
         * 交易时间
         */
    	public static String transTime="transTime";
    
        /**
         * 交易日期
         */
    	public static String transDate="transDate";
    
        /**
         * 用户ID
         */
    	public static String userId="userId";
    
        /**
         * 交易卡号
         */
    	public static String cardNo="cardNo";
    
	}
}
