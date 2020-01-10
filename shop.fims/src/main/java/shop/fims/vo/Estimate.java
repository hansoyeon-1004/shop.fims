package shop.fims.vo;

public class Estimate {

	private String exaRepCd;// 모든 심사 결과
	private String areacityAdminCd;// 모든 행정기관코드
	private String areaCd;// 전국지역코드
	private String areaCityCd;// 모든 지역 시군코드
	private String festCd;// 축제코드
	private String memCd;// 회원코드
	private String accMemCd;// 하나의 거래처별 소속 회원코드
	private String festProCd;// 하나의 축제내 여러개 프로그램 소개코드
	private String evaIndexCd;// 심사 평가지표명코드
	private String exaCondition;// 심사 유무
	private String exaDt;// 심사일자
	private String exaTotalScore;// 총점
	private String estClaCd;// 심사구분
	private String evaNm;// 평가명
	private String l_criteria;// 대평가항목
	private String m_criteria;// 중평가항목
	private String s_criteria;// 소평가항목
	private String scoring_criteria;// 배점기준
	private String scoring;// 배점
	public String getExaRepCd() {
		return exaRepCd;
	}
	public void setExaRepCd(String exaRepCd) {
		this.exaRepCd = exaRepCd;
	}
	public String getAreacityAdminCd() {
		return areacityAdminCd;
	}
	public void setAreacityAdminCd(String areacityAdminCd) {
		this.areacityAdminCd = areacityAdminCd;
	}
	public String getAreaCd() {
		return areaCd;
	}
	public void setAreaCd(String areaCd) {
		this.areaCd = areaCd;
	}
	public String getAreaCityCd() {
		return areaCityCd;
	}
	public void setAreaCityCd(String areaCityCd) {
		this.areaCityCd = areaCityCd;
	}
	public String getFestCd() {
		return festCd;
	}
	public void setFestCd(String festCd) {
		this.festCd = festCd;
	}
	public String getMemCd() {
		return memCd;
	}
	public void setMemCd(String memCd) {
		this.memCd = memCd;
	}
	public String getAccMemCd() {
		return accMemCd;
	}
	public void setAccMemCd(String accMemCd) {
		this.accMemCd = accMemCd;
	}
	public String getFestProCd() {
		return festProCd;
	}
	public void setFestProCd(String festProCd) {
		this.festProCd = festProCd;
	}
	public String getEvaIndexCd() {
		return evaIndexCd;
	}
	public void setEvaIndexCd(String evaIndexCd) {
		this.evaIndexCd = evaIndexCd;
	}
	public String getExaCondition() {
		return exaCondition;
	}
	public void setExaCondition(String exaCondition) {
		this.exaCondition = exaCondition;
	}
	public String getExaDt() {
		return exaDt;
	}
	public void setExaDt(String exaDt) {
		this.exaDt = exaDt;
	}
	public String getExaTotalScore() {
		return exaTotalScore;
	}
	public void setExaTotalScore(String exaTotalScore) {
		this.exaTotalScore = exaTotalScore;
	}
	public String getEstClaCd() {
		return estClaCd;
	}
	public void setEstClaCd(String estClaCd) {
		this.estClaCd = estClaCd;
	}
	public String getEvaNm() {
		return evaNm;
	}
	public void setEvaNm(String evaNm) {
		this.evaNm = evaNm;
	}
	public String getL_criteria() {
		return l_criteria;
	}
	public void setL_criteria(String l_criteria) {
		this.l_criteria = l_criteria;
	}
	public String getM_criteria() {
		return m_criteria;
	}
	public void setM_criteria(String m_criteria) {
		this.m_criteria = m_criteria;
	}
	public String getS_criteria() {
		return s_criteria;
	}
	public void setS_criteria(String s_criteria) {
		this.s_criteria = s_criteria;
	}
	public String getScoring_criteria() {
		return scoring_criteria;
	}
	public void setScoring_criteria(String scoring_criteria) {
		this.scoring_criteria = scoring_criteria;
	}
	public String getScoring() {
		return scoring;
	}
	public void setScoring(String scoring) {
		this.scoring = scoring;
	}
	@Override
	public String toString() {
		return "Estimate [exaRepCd=" + exaRepCd + ", areacityAdminCd=" + areacityAdminCd + ", areaCd=" + areaCd
				+ ", areaCityCd=" + areaCityCd + ", festCd=" + festCd + ", memCd=" + memCd + ", accMemCd=" + accMemCd
				+ ", festProCd=" + festProCd + ", evaIndexCd=" + evaIndexCd + ", exaCondition=" + exaCondition
				+ ", exaDt=" + exaDt + ", exaTotalScore=" + exaTotalScore + ", estClaCd=" + estClaCd + ", evaNm="
				+ evaNm + ", l_criteria=" + l_criteria + ", m_criteria=" + m_criteria + ", s_criteria=" + s_criteria
				+ ", scoring_criteria=" + scoring_criteria + ", scoring=" + scoring + "]";
	}
	
	
	
	
	
	
}
