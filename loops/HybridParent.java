package com.pote.engg.loops;

 class HybridParent extends HybridInheritance {
	 String Nameparent = "Indigo , AirIndia , Vistara";
	 int company = 3; 
	
	 public HybridParent(String NameParent,int company) {
		 this.Nameparent = NameParent;
		 this.company = company;
	 }
	 public HybridParent() {
		 
	 }
	 
	 public String getHybridNameParent() {
			return Nameparent;
		}
		
		public void setHybridName(String Name)
		{
			this.Nameparent = Nameparent;
		}
		
		public int getHybridcompany() {
			return company;
		}
		
		public void setHybridcompany(int company)
		{
			this.company = company;
		}
		
		public void HybridParentDetail(){
			System.out.println("Parent name :: "+getHybridNameParent());
			System.out.println("Parent name :: "+getHybridcompany());
			HybridParentDetail();
			
		}

}
