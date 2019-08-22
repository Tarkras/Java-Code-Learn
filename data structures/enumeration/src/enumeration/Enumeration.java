package enumeration;

public class Enumeration {
	
	/** An enum is a special "class" that represents a group of constants which will not change.
	 *  You can have multiple values in every variable listed using parenthesis */
	enum DayTranslation {
		MONDAY("Lunes"),
		TUESDAY("Martes"),
		WEDNSDAY("Miercoles"),
		THURSDAY("Jueves"),
		FRIDAY("Viernes"),
		SATURDAY("Sabado"),
		SUNDAY("Domingo");
		
		/* To access the data in the parenthesis you have to create constants and constructors. */
	    String trl;
		DayTranslation(String trl){
			this.trl = trl;
		}
		
		// To pass information.
		public String getTranslation() { return trl;}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(DayTranslation dt: DayTranslation.values()) {
			System.out.println(dt.getTranslation());
		}
		
	}

}
