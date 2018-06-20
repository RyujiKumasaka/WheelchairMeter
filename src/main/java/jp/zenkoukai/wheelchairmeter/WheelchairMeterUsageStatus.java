package jp.zenkoukai.wheelchairmeter;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class WheelchairMeterUsageStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long wheelchairMeterId;

	private Long facilityUserId;

	@Temporal(TemporalType.DATE)
	private LocalDate startDate;

	@Temporal(TemporalType.DATE)
	private LocalDate endDate;

	private LocalTime createDate;

	private Long createUser;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalTime updateDate;

	private Long updateUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Boolean deleteFlg;

	public WheelchairMeterUsageStatus(
			Long id,
			Long wheelchairMeterId,
			Long facilityUserId,
			LocalDate startDate,
			LocalDate endDate,
			Long createUser,
			LocalTime updateDate,
			Long updateUser,
			Boolean deleteFlg) {
			this.id = id;
			this.wheelchairMeterId = wheelchairMeterId;
			this.facilityUserId = facilityUserId;
			this.startDate = startDate;
			this.endDate = endDate;
			this.createUser = createUser;
			this.updateDate = updateDate;
			this.updateUser = updateUser;
			this.deleteFlg = deleteFlg;
	}

	@PrePersist
		public void prePersist() {
		this.createDate = LocalTime.now();
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
	public Long getFacilityUserId() {
		return facilityUserId;
	}
	public void setFacilityUserId(Long facilityUserId) {
		this.facilityUserId = facilityUserId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public LocalTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalTime createDate) {
		this.createDate = createDate;
	}
	public Long getCreateUser() {
		return createUser;
	}
	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}
	public LocalTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalTime updateDate) {
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

