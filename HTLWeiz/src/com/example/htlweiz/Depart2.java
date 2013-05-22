package com.example.htlweiz;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class Depart2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depart2);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		TextView header = (TextView) findViewById(R.id.textView1);
		TextView info = (TextView) findViewById(R.id.textView2);
		TextView dauer = (TextView) findViewById(R.id.textView4);
		TextView absch = (TextView) findViewById(R.id.textView6);

		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		int aint = Integer.parseInt(message);

		switch (aint) {
		case 0:
			header.setText("Kolleg Betriebsinformatik");
			info.setText("Vermittlung theoretischer und praktischer Grundlagen aus den Bereichen industrieller Fertigung, Werkstoffkunde und Elektrotechnik. Ausbildung in den Lernbereichen der Betriebstechnik wie Unternehmensorganisation, Logistik, Controlling, Projektmanagement, Kostenrechnung, Kalkulation und Marketing. Anwendung von Techniken des Qualit�t's- und Umweltmanagements. Auswahl und Anwendung von Standardsoftware zur L�sung betrieblicher Aufgaben.");
			dauer.setText("4 Semester, 2 Jahre bis zur Diplompr�fung");
			absch.setText("Erfolgreich abgelegte Reifepr�fung einer AHS bzw. BHS.\n\nErfolgreich abgelegte Abschlusspr�fung einer facheinschl�gigen 4-j�hrigen Fachschule.\n\nPersonen mit Berufsberechtigung oder abgeschlossener 3-j�hrigen oder nicht facheinschl�giger Fachschule nach Ablegung einer Aufnahmspr�fung bzw. nach Absolvierung eines Vorbereitungsmoduls.");
			break;
		case 1:
			header.setText("Elektrotechnik Automatisierung");
			info.setText("Es erwartet dich eine fundierte Allgemeinausblidung mit gezielter Fremdsprachenausbildung in Englisch, die durch eine Auslands - Sprachwoche intensiviert wird (Cambridge First Certificate nach Wahl). Die Entwicklung wesentlicher soft skills wie Verantwortungsbewusstsein, Teamgeist und Kommunikationsf�higkeit. Die Schwerpunkte der Ausbildung liegen bei der Automatisierung in der Programmierung von SPS und Mikrocontrollern, in der Erfassung, Aufbereitung und Verarbeitung von Messdaten, im Entwurf und der Dimensionierung von Mess-, Steuer,- und Regelungssystemen und in Entwicklung bzw. Einsatz branchenspezifischer Software");
			dauer.setText("5 Jahre bis zur Reife- und Diplompr�fung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 2:
			header.setText("Industrielle Informationstechnik");
			info.setText("Es erwartet dich eine fundierte Allgemeinausblidung mit gezielter Fremdsprachenausbildung in Englisch, die durch eine Auslands - Sprachwoche intensiviert wird (Cambridge First Certificate nach Wahl). Die Entwicklung wesentlicher soft skills wie Verantwortungsbewusstsein, Teamgeist und Kommunikationsf�higkeit. Die fachliche Ausbildung wird beim Schwerpunkt Informationstechnik in den Bereichen Automatisierungstechnik, aktuelle Betriebssysteme und Netzwerktechnologien, Industrielle Informationstechnik, Projekt - Engineering mit SAP (auf Wunsch mit Zertifikat), Datenbanken, Webtechnologien, sowie Qualit�ts und Produktmanagement vertieft");
			dauer.setText("5 Jahre bis zur Reife- und Diplompr�fung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 3:
			header.setText("Maschinen - Anlagentechnik");
			info.setText("Die Maschinentechniker/innen sind aufgrund ihrer Ausbildung bef�higt, in die verschiedensten Branchen von Industrie und Gewerbe einzusteigen. Sie sind flexibel und arbeiten sich rasch in neue Aufgabengebiete ein. Schon in jungen Jahren gehen sie in die betriebliche Praxis, sammeln dort Erfahrung und sind dann bestens qualifiziert, um mittlere und auch h�here Managementfunktionen zu �bernehmen. Nach dreij�hriger, facheinschl�giger T�tigkeit kann der Berufstitel Ingenieur erworben werden.");
			dauer.setText("5 Jahre bis zur Reife- und Diplompr�fung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 4:
			header.setText("Umwelttechnik");
			info.setText("Die Nachfrage der Industrie nach Absolventen der Abteilung Maschineningenieurwesen mit ausgepr�gter Fachkompetenz im Energie- und Umweltsektor ist derzeit sehr hoch. Durch stetig steigende Energiekosten und Verknappung der Ressourcen sind auch im Dienstleistungssektor (Ingenieurb�ros) zahlreiche neue Aufgabengebiete entstanden, die sich mit der Thematik Umweltschutz, Energieerzeugung aus regenerativen Energiequellen oder Anlagensimulation befassen (Green Jobs). Nach dreij�hriger, facheinschl�giger T�tigkeit kann der Berufstitel Ingenieur erworben werden.");
			dauer.setText("5 Jahre bis zur Reife- und Diplompr�fung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 5:
			header.setText("Betriebsmanagement");
			info.setText("Unser Absolvent ist in nahezu allen Bereichen der Wirtschaft einsetzbar: Als technischer Spezialist im Betrieb, als Auftrags- und Einsatzleiter um In- und Ausland, als technisch-betriebswirtschaftlicher Controller, als technischer Ein- und Verk�ufer, als Projektmanager oder als verantwortlicher Produkt-Manager etc...");
			dauer.setText("5 Jahre bis zur Reife- und Diplompr�fung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 6:
			header.setText("Anlagentechnik");
			info.setText("Es erwartet dich eine grundlegende Ausbildung im allgemeinbildenden Bereich mit einer Fremdsprachenausbildung in Englisch. Eine stark praxisorientierte Ausbildung in den aktuellen Technologien der Elektrotechnik und der Elektronik, wobei das Ausbildungsniveau �ber dem eines vergleichbaren Lehrabschlusses liegt. Fachliche Vertiefung erfolgt in den Bereichen Elektrische Maschinen und Antriebe, Elektrische Anlagen, Mess-, Steuerungs- und Regelungstechnik sowie Industrielle Elektronik.");
			dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschl�gigen Betrieb");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			break;
		case 7:
			header.setText("Informationstechnik");
			info.setText("Aufgrund der umfassenden theoretischen und praktischen Ausbildung liegen die Einsatzbereiche haupts�chlich in der Planung sowie der Wartung und Betreuung von betrieblichen EDV-Systemen sowie deren Vernetzung und An�bindung an Internet- und Telekommunikationsdienste. Auch der Einsatz im An- und Verkauf von EDV-Systemen ist vorgesehen. Im Anschluss an die Ausbildung ist (nach einem Vorbereitungslehrgang) der Einstieg in ein 2-j�hriges Kolleg (Abschluss mit Reife- und Diplompr�fung) m�glich. Es kann auch (nach einem Aufbaulehrgang) die Berufsreifepr�fung abgelegt und damit die Studienberechtigung erworben werden.");
			dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschl�gigen Betrieb");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			break;
		case 8:
			header.setText("Fertigungstechnik");
			info.setText("Erwerb eines grundlegenden fachlichen Wissens und K�nnens,das unmittelbar zur Aus�bung eines Berufs auf gewerblichtechnischem Gebiet bef�higt. Erweiterung und Vertiefung der Allgemeinbildung in einer der k�nftigen Berufst�tigkeit angemessenen Weise. Durch die verst�rkte fachpraktische Ausbildung soll der Sch�ler an den modernen Beruf des Fertigungstechnikers herangef�hrt werden. Der allgemeinbildende, fachtheoretische und fachpraktische Unterricht soll ein Ausbildungsniveau sichern, das �ber dem eines Lehrabschlusses liegt.");
			dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschl�gigen Betrieb");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			break;
		case 9:
			header.setText("Wirtschaftsingenieurwesen");
			info.setText("Der Absolvent bekommt eine umfassende betriebsorganisatorisch kaufm�nnische Ausbildung, die die Basisqualifikation f�r leitende T�tigkeiten in der Industrie darstellt, vermittelt. Mit dem erfolgreichen HTBLA - Abschluss sind mehrere Berufsberechtigungen (Lehrabschl�sse) f�r einschl�gige Berufe verbunden. Erwerb des Berufstitels �Ingenieur� nach dreij�hriger facheinschl�giger T�tigkeit. Berechtigung zum Studium an einer Fachhochschule bzw. Universit�t zur Erlangung eines akademischen Grades.");
			dauer.setText("4 bzw. 3 Jahre am Abend bis zur Reife- und Diplompr�fung");
			absch.setText("Die erfolgreiche Ablegung der Lehrabschlusspr�fung in einem entsprechenden Lehrberuf\n\nDer erfolgreiche Abschluss einer einschl�gigen Fachschule\n\nDer erfolgreiche Abschluss einer einschl�gigen Werkmeisterschule\n\nF�r Bewerber, die eine fachfremde Reifepr�fung abgelegt haben, der Besuch eines praktischen Unterrichts.");
			break;
		case 10:
			header.setText("Elektrotechnik - Wirtschaft");
			info.setText("Einsatz als Absolvent der elektrotechnischen Fachrichtung in allen Bereichen.Direkter Zugang zum einschl�gigen Gewerbe nach entsprechender Praxis. Mit dem erfolgreichen HTBLA - Abschluss sind mehrere Berufsberechtigungen (Lehrabschl�sse) f�r einschl�gige Berufe verbunden. Die Ausbildung stellt eine Basis f�r mittleres und h�heres Management in Betrieben dar. Durch die starke Wirtschaftsorientierung und die Ausbildung in Wirtschaftsinformatik sowie F�hrungstechnik ist die Qualifikation f�r leitende Funktionen vorhanden. Erwerb des Berufstitels �Ingenieur� nach dreij�hriger facheinschl�giger T�tigkeit.Berechtigung zum Studium an einer Fachhochschule bzw. Universit�t zur Erlangung eines akademischen Grades.");
			dauer.setText("4 bzw. 3 Jahre am Abend bis zur Reife- und Diplompr�fung");
			absch.setText("Die erfolgreiche Ablegung der Lehrabschlusspr�fung in einem entsprechenden Lehrberuf\n\nDer erfolgreiche Abschluss einer einschl�gigen Fachschule\n\nDer erfolgreiche Abschluss einer einschl�gigen Werkmeisterschule\n\nF�r Bewerber, die eine fachfremde Reifepr�fung abgelegt haben, der Besuch eines praktischen Unterrichts.");
			break;
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_depart2, menu);
		return true;
	}

}
