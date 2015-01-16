package LightPhonebook;



import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
	HashMap<String, LinkedList<Integer>> phonebook ;
	Set<String> contacts ;
/**
 * Creates a phonebook
 */
	public PhoneBook() {
		phonebook = new HashMap<String, LinkedList<Integer>>() ;
		contacts = phonebook.keySet();
	}
/**
 * Prvi init;	
 * @param name
 * @param brojTelefona
 */
	public void addContact(String name, int brojTelefona) {
		LinkedList<Integer> nameb = new LinkedList<Integer>();
		nameb.add(brojTelefona);
		phonebook.put(name, nameb);
	}
	
/**
 * Adds only number;	
 */
	public void addNumbertoExisting(String name, int newphonenum) {
		phonebook.get(name).add(newphonenum);
	}
	
	
	public void toSortOfString() {
//		StringBuilder sb = new StringBuilder();
		Iterator<String> iterName = contacts.iterator();
		while (iterName.hasNext()) {
			String namefromP = iterName.next();
			System.out.println(namefromP);
			Iterator<Integer> listNumIter = phonebook.get(namefromP).iterator();	
			while (listNumIter.hasNext()) {
				int num = listNumIter.next();
				System.out.println(num);
			}
		}
//		
//		return sb.toString();
	}
	
	
	
	
}
