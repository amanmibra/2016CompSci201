import java.util.Arrays;
import java.util.Comparator;

public class ClientsList {

	private class Person{
		String fname;
		String lname;
		public Person(String fname, String lname){
			this.fname = fname.trim();
			this.lname = lname.trim();
			//System.out.println(fname +  " " + lname );
		}
	}
	
	public String[] dataCleanup(String[] names) {
		ClientsList.Person[] arr = new ClientsList.Person[names.length];

		for(int i = 0; i < names.length; i++){
			String name = names[i];
			int index = name.indexOf(",");

			if(index < 0){
				index = name.indexOf(" ");
				String[] n  = name.split(" ");
				String fname = n[0];
				String lname = n[1];
				arr[i] = new ClientsList.Person(fname, lname);
			}else{
				String[] n  = name.split(",");
				String fname = n[1];
				String lname = n[0];
				arr[i] = new ClientsList.Person(fname, lname);
			}

		}
		Comparator<ClientsList.Person> byLastName = (a,b) -> (a.lname  + a.fname).compareTo(b.lname + b.fname);
		Arrays.sort(arr, byLastName);
		return Arrays.stream(arr)
				.map(p -> String.format("%s %s", p.fname, p.lname))
				.toArray(s -> new String[s]);
	}
}