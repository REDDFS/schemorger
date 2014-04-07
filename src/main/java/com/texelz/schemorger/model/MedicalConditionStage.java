package com.texelz.schemorger.model;

/**
 *
 * A stage of a medical condition, such as 'Stage IIIa'.
 * @fullPath Thing > MedicalEntity > MedicalIntangible > MedicalConditionStage
 *
 * @author Texelz (by Onhate)
 *
 */
public class MedicalConditionStage extends MedicalIntangible {

	private Double stageAsNumber;
	private String subStageSuffix;
	/**
	 * The stage represented as a number, e.g. 3.
	 */
	public Double getStageAsNumber() {
		return this.stageAsNumber;
	}
	public void setStageAsNumber(Double stageAsNumber) {
		this.stageAsNumber = stageAsNumber;
	}
	/**
	 * The substage, e.g. 'a' for Stage IIIa.
	 */
	public String getSubStageSuffix() {
		return this.subStageSuffix;
	}
	public void setSubStageSuffix(String subStageSuffix) {
		this.subStageSuffix = subStageSuffix;
	}
}