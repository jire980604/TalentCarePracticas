import  java.util.Scanner;

public class Run{
	public static void main(String[] args){
        //Crear instancia de scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce la clave: ");
        int clave = scanner.nextInt();

        System.out.println("Numero de minutos: ");
        double min = scanner.nextDouble();

        String zona;
        double precio = 0; 

        int ban = 0;

		switch (clave){

            case 12:
                zona = "America del Norte";
                precio = min * 2;
                break;
            case 15:
                zona = "America Central";
                precio = min* 2.2;
                break;
            case 18:
                zona = "America del Sur";
                precio = min * 4.5;
                break;
            case 19:
                zona = "Europa";
                precio = min * 3.5;
                break;
            case 23:
                zona = "Asia";
                precio = min * 6;
                break;
            case 25:
                zona = "Africa";
                precio = min * 6;
                break;
            case 29:
                zona = "Oceania";
                precio = min * 5;
                break;                    

            default:
                zona = "Zona invalida";
                ban = 1;
                break;
        }

        if(ban == 0){
            System.out.println("El costo de la llamada para la zona de " + zona + " es: " + precio);
        }else {
            System.out.println(zona);
        }

        scanner.close();
	}
}