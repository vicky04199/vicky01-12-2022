package org.inter;

public class SbiBank implements RbiBank {

	@Override
	public void saving() {
		System.out.println("saving76");
		
	}

	@Override
	public void depoist() {
		System.out.println("deposit78");
		
	}
	private void fixed() {
		System.out.println("fix88");

	}
	public static void main(String[] args) {
		SbiBank g=new SbiBank();
		g.depoist();
		g.fixed();
		g.saving();
	}

}
