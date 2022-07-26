package com.java8.pojo;

import java.util.List;

public class PlanComponent {

	private int planCompId;
	private ProductComponent pc;
	public PlanComponent(int planCompId, ProductComponent pc) {
		super();
		this.planCompId = planCompId;
		this.pc = pc;
	}
	
	public int getPlanCompId() {
		return planCompId;
	}

	public void setPlanCompId(int planCompId) {
		this.planCompId = planCompId;
	}

	public ProductComponent getPc() {
		return pc;
	}

	public void setPc(ProductComponent pc) {
		this.pc = pc;
	}

	@Override
	public String toString() {
		return "PlanComponent [planCompId=" + planCompId + ", pc=" + pc + "]";
	}
	
	
	
}
