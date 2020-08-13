import java.io.File;

public class DeleteDirectory {

	public static void main(String[] args) {
	    boolean success =  DeleteDirectory.deleteDirectory(new File("/home/ubuntu/consumo/consumoTelefonia1597285131720"));
	    if (!success) {
	        System.out.println("Falha na remoção");
	    }
	}
	
	public static boolean deleteDirectory(File directoryToBeDeleted) {
	    File[] allContents = directoryToBeDeleted.listFiles();
	    if (allContents != null) {
	        for (File file : allContents) {
	            deleteDirectory(file);
	        }
	    }
	    return directoryToBeDeleted.delete();
	}
}
