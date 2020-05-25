/**
 *@Generated by sagacity-quickvo 4.11
 */
package com.sagframe.sqltoy.showcase.vo;

import java.time.LocalDateTime;

import org.sagacity.sqltoy.config.annotation.Sharding;
import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import org.sagacity.sqltoy.config.annotation.Strategy;

import com.sagframe.sqltoy.showcase.vo.base.AbstractStaffInfoVO;

/**
 * @project sqltoy-oracle
 * @author zhongxuchen
 * @version 1.0.0 Table: sqltoy_staff_info,Remark:员工信息表
 */
@SqlToyEntity
@Sharding(db = @Strategy(name = "hashBalanceDBSharding", fields = { "staffId" })
//分表跟分库类似
//,table = @Strategy(name = "hashBalanceDBSharding", fields = { "staffId" })
)
public class StaffInfoVO extends AbstractStaffInfoVO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4609820466201465046L;

	/** default constructor */
	public StaffInfoVO() {
		super();
	}

	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public StaffInfoVO(String staffId) {
		this.staffId = staffId;
	}

	/** minimal constructor */
	public StaffInfoVO(String staffId, String staffCode, String staffName, String organId, String sexType,
			LocalDateTime entryDate, String createBy, LocalDateTime createTime, String updateBy,
			LocalDateTime updateTime, Integer status) {
		this.staffId = staffId;
		this.staffCode = staffCode;
		this.staffName = staffName;
		this.organId = organId;
		this.sexType = sexType;
		this.entryDate = entryDate;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.status = status;
	}

	/** full constructor */
	public StaffInfoVO(String staffId, String staffCode, String staffName, String organId, String sexType,
			LocalDateTime birthday, LocalDateTime entryDate, LocalDateTime termDate, byte[] photo, String country,
			String censusRegister, String address, String email, String telNo, String post, String postGrade,
			String createBy, LocalDateTime createTime, String updateBy, LocalDateTime updateTime, Integer status) {
		this.staffId = staffId;
		this.staffCode = staffCode;
		this.staffName = staffName;
		this.organId = organId;
		this.sexType = sexType;
		this.birthday = birthday;
		this.entryDate = entryDate;
		this.termDate = termDate;
		this.photo = photo;
		this.country = country;
		this.censusRegister = censusRegister;
		this.address = address;
		this.email = email;
		this.telNo = telNo;
		this.post = post;
		this.postGrade = postGrade;
		this.createBy = createBy;
		this.createTime = createTime;
		this.updateBy = updateBy;
		this.updateTime = updateTime;
		this.status = status;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	/**
	 * @todo vo columns to String
	 */
	@Override
	public String toString() {
		return super.toString();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public StaffInfoVO clone() {
		try {
			return (StaffInfoVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

}
