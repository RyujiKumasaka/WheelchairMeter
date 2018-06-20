package jp.zenkoukai.wheelchairmeter;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DistanceData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long wheelchairMeterId;

	private Integer distance;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	private Long createUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	private Long updateUser;

	private Boolean deleteFlg;
/*
	public DistanceData(
			Long distanceDataId,
			Long wheelchairMeterId,
			Integer distance,
			Long createUser,
			Date updateDate,
			Long updateUser,
			Boolean deleteFlg) {
		this.id = distanceDataId;
		this.wheelchairMeterId = wheelchairMeterId;
		this.distance = distance;
		this.createUser = createUser;
		this.updateDate = updateDate;
		this.updateUser = updateUser;
		this.deleteFlg = deleteFlg;
	}
*/
	@PrePersist
	public void onPrePersist() {
		this.createDate = new Date();
		this.updateDate = new Date();
		this.createUser = 1L;
		this.updateUser = 1L;
		this.deleteFlg = false;
	}

	@PreUpdate
	public void onPreUpdate() {
		this.updateDate = new Date();
		this.updateUser = 1L;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWheelchairMeterId() {
		return wheelchairMeterId;
	}

	public void setWheelchairMeterId(Long wheelchairMeterId) {
		this.wheelchairMeterId = wheelchairMeterId;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Long getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(Long updateUser) {
		this.updateUser = updateUser;
	}

	public Boolean getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

}
