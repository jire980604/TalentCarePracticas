public class Run{
	public static void main(String[] args){
        EdadException edEx = new EdadException();

		try {
            int edad =11;
            edEx.validarEdad(edad);
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Entre al catch");
            System.out.println(ex.getMessage());
        }finally{
            System.out.println("finally");
        }
	}
}