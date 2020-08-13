import java.io.File;

public class DeleteFile {
	public static void main(String[] args) { 
	    File myObj = new File("/home/ubuntu/consumo/consumoTelefonia1597355435027consumoTelefonia1597355435027.zip"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	  } 
}
