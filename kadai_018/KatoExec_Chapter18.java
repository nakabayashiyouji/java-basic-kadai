package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		        Person[] people = {
		            new KatoTaro(),
		            new KatoIchiro(),
		            new KatoHanako()
		        };

		        for (Person p : people) {
		            p.printInfo();
		        }
	}
}