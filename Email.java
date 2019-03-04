package email;

import java.util.Scanner;

public class Email {
	private String email;
	private String prenume;
	private String numeFamilie;
	private int parolaDefaultLength=10;//lungime standard pt parola
	private String parola;
	int  mailboxCapacitate=500;
	private String departament;
	private String emailAlternativ;
	private String companie="company.com";
	
	//constructor pt first name si last name
	
	public Email(String prenume, String numeFamilie){ 
	this.prenume=prenume;
	this.numeFamilie=numeFamilie;
	
	this.departament=setDepartament();//returneaza string cu numele departamentului
	System.out.println("Departamentul este de "+this.departament);
	
	this.parola=parolaRandom(parolaDefaultLength);
	System.out.println("Parola este: "+this.parola);
	
	//combinare elem pt a genera mail
	email=prenume.toLowerCase()+"."+numeFamilie.toLowerCase()+"@"+departament.toLowerCase()+"."+companie;
	
	}
	
	//metoda pt generare parola random de lungime length
	private String parolaRandom(int length)
	{
		String parolaSet="ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$&"; //tratam stringul ca vector
		char[]parola=new char[length]; //vector de char
		for(int i=0;i<length;i++)
		{
			int random=(int)(Math.random()*parolaSet.length());
			parola[i]=parolaSet.charAt(random);
		}
		return new String(parola);
	}
	//metoda care cere si returneaza departamentul
	private String setDepartament()
	{
		System.out.print("Nou angajat: "+prenume+" "+numeFamilie+"\nCoduri Departamente:\n1 pt Vanzari\n2 pt HR\n3 pt Development\n0 pt niciunul\nIntroduceti codul departamentului pt noul angajat:");
		Scanner in=new Scanner(System.in); //pt a citi inputul
		int alegereDep=in.nextInt();//de tip int(cod departament
		if(alegereDep==1){return "Vanzari";}
		else if(alegereDep==2){return "HR";}
		else if(alegereDep==3){return "Development";}
		else{return"";}
	}
	
	
	//metoda de setare capacitate mailbox(setter)
	public void setMailboxCapacitate(int capacitate) {
		this.mailboxCapacitate = capacitate;
	}
	//getter pt capacitate mailbox
	public int getMailboxCapacitate() {
		return mailboxCapacitate;
	}
	
	//metoda pt setarea unui email alternativ(setter)
	public void setEmailAlternativ(String emailAlt) {
		this.emailAlternativ=emailAlt;
	}
	
	//getter pt email alternativ
	public String getEmailAlternativ() {
		return emailAlternativ;
	}
	
	//metoda pt schimbarea parolei
	public String schimbareParola(String parola) {
		System.out.println("Doriti schimbarea parolei?(1=da; 0=nu)");
		Scanner ans=new Scanner(System.in);
		String rasp=ans.nextLine();
		if(rasp=="da")
		{return "Anagajatul "+prenume+" "+numeFamilie+" si-a schimbat parola: "+this.parola+" in: "+parola;}
		else
		{return "Angajatul nu doreste schimbarea parolei. Parola a ramas: "+this.parola;}
		
	}
	//getter pt parola
	public String getParola() {
		return parola;
	}
	
	//getter pt prenume, nume de familie si email
	public String getPrenume() {
		return prenume;
	}
	public String getNumeFamilie() {
		return numeFamilie;
	}
	public String getEmail() {
		return email;
	}
	
	public String showInfo() {
		return "Numele complet este: "+prenume+" "+numeFamilie+
				"\nEmailul este: "+email+
				"\nCapacitatea mailului este: "+mailboxCapacitate+"mb";
	}
	
	
	
	
	
	

	
	
	
	
	

}
