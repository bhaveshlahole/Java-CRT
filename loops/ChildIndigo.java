package com.pote.engg.loops;

class ChildIndigo extends HybridParent{
	
	String NameCh1 = "Indigo";
	
	public ChildIndigo(String NameCh1) {
		this.NameCh1 = NameCh1;
	}
	public ChildIndigo() {
		
	}
	public String getHybridNameCh1() {
		return NameCh1;
	}
	
	public void setHybridName(String NameCh1)
	{
		this.NameCh1 = NameCh1;
	}
	
	public void HybridDetail(){
		System.out.println("Parent name :: "+getHybridNameCh1());
		HybridParentDetail();
		
		
	}
	

}
