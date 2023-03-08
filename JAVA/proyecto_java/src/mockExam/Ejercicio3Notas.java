package mockExam;

public class Ejercicio3Notas {

	public static void main(String[] args) {
		
		System.out.println(frecuenciaNota("DO"));
		System.out.println(frecuenciaNota(null));
		
		System.out.println(frecuenciaSostenido("mi", true));
		System.out.println(frecuenciaSostenido(null, false));

	}
	
	public static double frecuenciaNota(String nota) {
		StringBuilder res = new StringBuilder();
		res=res.append(0);
		
		if(nota!=null && !nota.isEmpty()) {
			switch(nota.toUpperCase()) {
			case "DO":{
				res.append(523.25);
				break;
			}case "RE":{
				res.append(587.33);
				break;
			}case "MI":{
				res.append(659.26);
				break;
			}case "FA":{
				res.append(698.46);
				break;
			}case "SOL":{
				res.append(783.99);
				break;
			}case "LA":{
				res.append(880);
				break;
			}case "SI":{
				res.append(987.77);
				break;
			}default:{
				res.append(0);
			}
			}
		}
		return Double.valueOf(res.toString());
	}
	
	public static double frecuenciaSostenido(String nota, boolean sostenido) {
		double res=0;
		if(nota!=null && !nota.isEmpty()) {
			res= sostenido? frecuenciaNota(nota)*1.03 : frecuenciaNota(nota);
		}
		return res;
	}

}
