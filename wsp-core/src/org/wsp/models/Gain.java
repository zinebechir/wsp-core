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
 * Gain generated by hbm2java
 */
@Entity
@Table(name = "Gain", catalog = "wsp")
public class Gain implements java.io.Serializable {

	private Integer idGain;
	private int tradingSessionIdTradingSession;
	private float soldeLiquid;
	private Date timeSnapshot;

	public Gain() {
	}

	public Gain(int tradingSessionIdTradingSession, float soldeLiquid,
			Date timeSnapshot) {
		this.tradingSessionIdTradingSession = tradingSessionIdTradingSession;
		this.soldeLiquid = soldeLiquid;
		this.timeSnapshot = timeSnapshot;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idGain", unique = true, nullable = false)
	public Integer getIdGain() {
		return this.idGain;
	}

	public void setIdGain(Integer idGain) {
		this.idGain = idGain;
	}

	@Column(name = "TradingSession_idTradingSession", nullable = false)
	public int getTradingSessionIdTradingSession() {
		return this.tradingSessionIdTradingSession;
	}

	public void setTradingSessionIdTradingSession(
			int tradingSessionIdTradingSession) {
		this.tradingSessionIdTradingSession = tradingSessionIdTradingSession;
	}

	@Column(name = "SoldeLiquid", nullable = false, precision = 12, scale = 0)
	public float getSoldeLiquid() {
		return this.soldeLiquid;
	}

	public void setSoldeLiquid(float soldeLiquid) {
		this.soldeLiquid = soldeLiquid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TimeSnapshot", nullable = false, length = 19)
	public Date getTimeSnapshot() {
		return this.timeSnapshot;
	}

	public void setTimeSnapshot(Date timeSnapshot) {
		this.timeSnapshot = timeSnapshot;
	}

}
