package com.java.lamdaExpression;

public class Student {

		private int sId;
		private String sName;
		
		public Student(int sId, String sName) {
			super();
			this.sId = sId;
			this.sName = sName;
		}

		public int getsId() {
			return sId;
		}

		public void setsId(int sId) {
			this.sId = sId;
		}

		public String getsName() {
			return sName;
		}

		public void setsName(String sName) {
			this.sName = sName;
		}
		
		public String toString() {
			return "ID : " + sId + " Name : " + sName;
		}
}
