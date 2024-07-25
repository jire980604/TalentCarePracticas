public class Run{
	public static void main(String[] args){
        EdadException edEx = new EdadException();

		try {
            int edad =11/0;
            edEx.validarEdad(edad);
        } catch (NullPointerException ex){
            ex.printStackTrace();
            System.out.println("Entre al catch");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally{
            System.out.println("finally");
        }

        System.out.println("Continuacion del programa en java");
	}
}