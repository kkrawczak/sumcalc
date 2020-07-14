package com.random.sumcalc.model;

public class RandomVO {

	public Integer min;
	public Integer max;
	public Integer records;
	
	public RandomVO(){}
	
	public RandomVO(Integer min, Integer max, Integer records) {
		this.min = min;
		this.max = max;
		this.records = records;
	}
	
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getRecords() {
		return records;
	}
	public void setRecords(Integer records) {
		this.records = records;
	}
}
