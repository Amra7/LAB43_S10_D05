package LightPhonebook;



import java.util.Scanner;

public class TestPhonebook {

	public static void main(String[] args) {

		PhoneBook samsung = new PhoneBook();
		int input;
	
		
		do {
			System.out.println("Unesite broj od 1 do 4. \n1-add;\n2-edit;\n3-printall;\n4-EXIT;");
			input = TextIO.getlnInt();
			
			if (input == 1) {
				System.out.println("Unesite ime : ");
				String name = TextIO.getln();
				System.out.println("Unesite broj : ");
				int brojTelefona = TextIO.getlnInt();
				samsung.addContact(name, brojTelefona);
			} else if (input == 2) {
				System.out.println("Unesite ime na koji zelite dodati broj (ime mora biti u phonebooku/light ver.) : ");
				String name = TextIO.getln();
				System.out.println("Unesite broj koji zelite unijeti : ");
				int brojTelefona = TextIO.getlnInt();
				samsung.addNumbertoExisting(name, brojTelefona);
			} else if (input ==3) {
				samsung.toSortOfString();
			} else if (input == 4) {
				System.out.println("KRAJ");
				return;
			}
			
			
		} while (input != 4);
		

	}

}
