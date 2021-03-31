package assignment2;



abstract class Persistence {
    abstract public String persist();
}
class FilePersistence extends Persistence{
    @Override
    public String persist() {
    	
    	return " file";
    }
}
class DatabasePersistence extends Persistence{
    @Override
    public String persist() {
    	return "Database"; 
    }
}

public class Assignment2Q6 {

	public static void main(String[] args) {
		Persistence obj1= new  FilePersistence();
		Persistence obj2=new DatabasePersistence();
		System.out.println(obj1.persist());
		System.out.println(obj2.persist());

	}

}
