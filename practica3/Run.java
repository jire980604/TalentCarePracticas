public class Run{
	public static void main(String[] args){
		int num = 6;
        long resultado = 1;

        for(int i = 1; i <= num; i++){
            resultado *= i;
        }

        System.out.println("El factorial de : " + num + " es " + resultado);
	}
}