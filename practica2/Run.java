public class Run{
	public static void main(String[] args){
		int edad = 19;
        boolean estreno = false;
        boolean verPeli = (edad >= 18) || estreno;

        System.out.println("Respuesta: " + verPeli);
	}
}