package com.cisco.springcore.referancetype;

public class C {
	private int z;
	private B obj;
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public C(int z, B obj) {
		super();
		this.z = z;
		this.obj = obj;
	}
	public C() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "C [z=" + z + ", obj=" + obj + "]";
	}
	
}
