package com.collegesearch.domain.school;
// Generated Jul 22, 2016 11:35:09 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GraduateSchoolMajor generated by hbm2java
 */
@Entity
@Table(name = "graduate_school_major", catalog = "school")
public class GraduateSchoolMajor implements java.io.Serializable {

	private GraduateSchoolMajorId id;
	private School school;
	private GraduateMajor graduateMajor;
	private String degree;
	private Integer toefl;
	private Integer ielts;
	private Integer gre;
	private Integer gmat;
	private Integer lsat;
	private String phone;
	private String email;
	private Integer rank;
	private String admissionWebpage;
	private Integer fallApplicationDeadline;
	private Integer springApplicationDeadline;

	public GraduateSchoolMajor() {
	}

	public GraduateSchoolMajor(GraduateSchoolMajorId id, School school, GraduateMajor graduateMajor) {
		this.id = id;
		this.school = school;
		this.graduateMajor = graduateMajor;
	}

	public GraduateSchoolMajor(GraduateSchoolMajorId id, School school, GraduateMajor graduateMajor, String degree,
			Integer toefl,Integer ielts, Integer gre, Integer gmat, Integer lsat, String phone, String email, Integer rank, String admissionWebpage,
			Integer fallApplicationDeadline, Integer springApplicationDeadline) {
		this.id = id;
		this.school = school;
		this.graduateMajor = graduateMajor;
		this.degree = degree;
		this.toefl = toefl;
		this.ielts = ielts;
		this.gre = gre;
		this.gmat = gmat;
		this.lsat = lsat;
		this.phone = phone;
		this.email = email;
		this.rank = rank;
		this.admissionWebpage = admissionWebpage;
		this.fallApplicationDeadline = fallApplicationDeadline;
		this.springApplicationDeadline = springApplicationDeadline;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "schoolId", column = @Column(name = "School_id", nullable = false)),
			@AttributeOverride(name = "majorId", column = @Column(name = "Major_id", nullable = false, length = 10)) })
	public GraduateSchoolMajorId getId() {
		return this.id;
	}

	public void setId(GraduateSchoolMajorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "School_id", nullable = false, insertable = false, updatable = false)
	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Major_id", nullable = false, insertable = false, updatable = false)
	public GraduateMajor getGraduateMajor() {
		return this.graduateMajor;
	}

	public void setGraduateMajor(GraduateMajor graduateMajor) {
		this.graduateMajor = graduateMajor;
	}

	@Column(name = "Degree", length = 10)
	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	@Column(name = "TOEFL")
	public Integer getToefl() {
		return this.toefl;
	}

	public void setToefl(Integer toefl) {
		this.toefl = toefl;
	}

	@Column(name = "IELTS")
	public Integer getIelts() {
		return this.ielts;
	}

	public void setIelts(Integer ielts) {
		this.ielts = ielts;
	}

	@Column(name = "Gre")
	public Integer getGre() {
		return this.gre;
	}

	public void setGre(Integer gre) {
		this.gre = gre;
	}

	@Column(name = "GMAT")
	public Integer getGmat() {
		return this.gmat;
	}

	public void setGmat(Integer gmat) {
		this.gmat = gmat;
	}

	@Column(name = "LSAT")
	public Integer getLsat() {
		return this.lsat;
	}

	public void setLsat(Integer lsat) {
		this.lsat = lsat;
	}


	@Column(name = "Phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "Email", length = 40)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Rank")
	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@Column(name = "AdmissionWebpage", length = 100)
	public String getAdmissionWebpage() {
		return this.admissionWebpage;
	}

	public void setAdmissionWebpage(String admissionWebpage) {
		this.admissionWebpage = admissionWebpage;
	}

	@Column(name = "Fall_Application_Deadline")
	public Integer getFallApplicationDeadline() {
		return this.fallApplicationDeadline;
	}

	public void setFallApplicationDeadline(Integer fallApplicationDeadline) {
		this.fallApplicationDeadline = fallApplicationDeadline;
	}

	@Column(name = "Spring_Application_Deadline")
	public Integer getSpringApplicationDeadline() {
		return this.springApplicationDeadline;
	}

	public void setSpringApplicationDeadline(Integer springApplicationDeadline) {
		this.springApplicationDeadline = springApplicationDeadline;
	}
}
