package org.wsp.models;

// Generated 12 août 2013 22:46:28 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Turbo generated by hbm2java
 */
@Entity
@Table(name = "Turbo", catalog = "wsp")
public class Turbo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6632066205310941156L;
	private Integer idTurbo;
	private Integer tradingSessionIdTradingSession;
	private String code;
	private String name;
	private String url;
	private Date creationDate;
	private Date beginNeg;
	private Date endNed;
	private float barDes;
	private Date emissionDate;
	private Date echeanceDate;
	private String emetteur;
	private String typeTurbo;
	private String sousJacant;
	private int state;
	private int priority;
	private int stock;

	public Turbo() {
	}

	public Turbo(String code, String name, String url, Date creationDate,
			Date beginNeg, Date endNed, float barDes, Date emissionDate,
			Date echeanceDate, String emetteur, String typeTurbo,
			String sousJacant, int state, int priority, int stock) {
		this.code = code;
		this.name = name;
		this.url = url;
		this.creationDate = creationDate;
		this.beginNeg = beginNeg;
		this.endNed = endNed;
		this.barDes = barDes;
		this.emissionDate = emissionDate;
		this.echeanceDate = echeanceDate;
		this.emetteur = emetteur;
		this.typeTurbo = typeTurbo;
		this.sousJacant = sousJacant;
		this.state = state;
		this.priority = priority;
		this.stock = stock;
	}

	public Turbo(Integer tradingSessionIdTradingSession, String code,
			String name, String url, Date creationDate, Date beginNeg,
			Date endNed, float barDes, Date emissionDate, Date echeanceDate,
			String emetteur, String typeTurbo, String sousJacant, int state,
			int priority, int stock) {
		this.tradingSessionIdTradingSession = tradingSessionIdTradingSession;
		this.code = code;
		this.name = name;
		this.url = url;
		this.creationDate = creationDate;
		this.beginNeg = beginNeg;
		this.endNed = endNed;
		this.barDes = barDes;
		this.emissionDate = emissionDate;
		this.echeanceDate = echeanceDate;
		this.emetteur = emetteur;
		this.typeTurbo = typeTurbo;
		this.sousJacant = sousJacant;
		this.state = state;
		this.priority = priority;
		this.stock = stock;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idTurbo", unique = true, nullable = false)
	public Integer getIdTurbo() {
		return this.idTurbo;
	}

	public void setIdTurbo(Integer idTurbo) {
		this.idTurbo = idTurbo;
	}

	@Column(name = "TradingSession_idTradingSession")
	public Integer getTradingSessionIdTradingSession() {
		return this.tradingSessionIdTradingSession;
	}

	public void setTradingSessionIdTradingSession(
			Integer tradingSessionIdTradingSession) {
		this.tradingSessionIdTradingSession = tradingSessionIdTradingSession;
	}

	@Column(name = "Code", nullable = false, length = 45)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "Name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "URL", nullable = false)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreationDate", nullable = false, length = 19)
	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "BeginNeg", nullable = false, length = 8)
	public Date getBeginNeg() {
		return this.beginNeg;
	}

	public void setBeginNeg(Date beginNeg) {
		this.beginNeg = beginNeg;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "EndNed", nullable = false, length = 8)
	public Date getEndNed() {
		return this.endNed;
	}

	public void setEndNed(Date endNed) {
		this.endNed = endNed;
	}

	@Column(name = "BarDes", nullable = false, precision = 12, scale = 0)
	public float getBarDes() {
		return this.barDes;
	}

	public void setBarDes(float barDes) {
		this.barDes = barDes;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EmissionDate", nullable = false, length = 10)
	public Date getEmissionDate() {
		return this.emissionDate;
	}

	public void setEmissionDate(Date emissionDate) {
		this.emissionDate = emissionDate;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EcheanceDate", nullable = false, length = 10)
	public Date getEcheanceDate() {
		return this.echeanceDate;
	}

	public void setEcheanceDate(Date echeanceDate) {
		this.echeanceDate = echeanceDate;
	}

	@Column(name = "Emetteur", nullable = false, length = 45)
	public String getEmetteur() {
		return this.emetteur;
	}

	public void setEmetteur(String emetteur) {
		this.emetteur = emetteur;
	}

	@Column(name = "TypeTurbo", nullable = false, length = 45)
	public String getTypeTurbo() {
		return this.typeTurbo;
	}

	public void setTypeTurbo(String typeTurbo) {
		this.typeTurbo = typeTurbo;
	}

	@Column(name = "SousJacant", nullable = false, length = 45)
	public String getSousJacant() {
		return this.sousJacant;
	}

	public void setSousJacant(String sousJacant) {
		this.sousJacant = sousJacant;
	}

	@Column(name = "State", nullable = false)
	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Column(name = "Priority", nullable = false)
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Column(name = "Stock", nullable = false)
	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Turbo [idTurbo=" + idTurbo
				+ ", tradingSessionIdTradingSession="
				+ tradingSessionIdTradingSession + ", code=" + code + ", name="
				+ name + ", url=" + url + ", creationDate=" + creationDate
				+ ", beginNeg=" + beginNeg + ", endNed=" + endNed + ", barDes="
				+ barDes + ", emissionDate=" + emissionDate + ", echeanceDate="
				+ echeanceDate + ", emetteur=" + emetteur + ", typeTurbo="
				+ typeTurbo + ", sousJacant=" + sousJacant + ", state=" + state
				+ ", priority=" + priority + ", stock=" + stock + "]";
	}

	

}
