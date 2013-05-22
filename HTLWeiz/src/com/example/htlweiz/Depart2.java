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
			info.setText("Vermittlung theoretischer und praktischer Grundlagen aus den Bereichen industrieller Fertigung, Werkstoffkunde und Elektrotechnik. Ausbildung in den Lernbereichen der Betriebstechnik wie Unternehmensorganisation, Logistik, Controlling, Projektmanagement, Kostenrechnung, Kalkulation und Marketing. Anwendung von Techniken des Qualität's- und Umweltmanagements. Auswahl und Anwendung von Standardsoftware zur Lösung betrieblicher Aufgaben.");
			dauer.setText("4 Semester, 2 Jahre bis zur Diplomprüfung");
			absch.setText("Erfolgreich abgelegte Reifeprüfung einer AHS bzw. BHS.\n\nErfolgreich abgelegte Abschlussprüfung einer facheinschlägigen 4-jährigen Fachschule.\n\nPersonen mit Berufsberechtigung oder abgeschlossener 3-jährigen oder nicht facheinschlägiger Fachschule nach Ablegung einer Aufnahmsprüfung bzw. nach Absolvierung eines Vorbereitungsmoduls.");
			break;
		case 1:
			header.setText("Elektrotechnik Automatisierung");
			info.setText("Es erwartet dich eine fundierte Allgemeinausblidung mit gezielter Fremdsprachenausbildung in Englisch, die durch eine Auslands - Sprachwoche intensiviert wird (Cambridge First Certificate nach Wahl). Die Entwicklung wesentlicher soft skills wie Verantwortungsbewusstsein, Teamgeist und Kommunikationsfähigkeit. Die Schwerpunkte der Ausbildung liegen bei der Automatisierung in der Programmierung von SPS und Mikrocontrollern, in der Erfassung, Aufbereitung und Verarbeitung von Messdaten, im Entwurf und der Dimensionierung von Mess-, Steuer,- und Regelungssystemen und in Entwicklung bzw. Einsatz branchenspezifischer Software");
			dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 2:
			header.setText("Industrielle Informationstechnik");
			info.setText("Es erwartet dich eine fundierte Allgemeinausblidung mit gezielter Fremdsprachenausbildung in Englisch, die durch eine Auslands - Sprachwoche intensiviert wird (Cambridge First Certificate nach Wahl). Die Entwicklung wesentlicher soft skills wie Verantwortungsbewusstsein, Teamgeist und Kommunikationsfähigkeit. Die fachliche Ausbildung wird beim Schwerpunkt Informationstechnik in den Bereichen Automatisierungstechnik, aktuelle Betriebssysteme und Netzwerktechnologien, Industrielle Informationstechnik, Projekt - Engineering mit SAP (auf Wunsch mit Zertifikat), Datenbanken, Webtechnologien, sowie Qualitäts und Produktmanagement vertieft");
			dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 3:
			header.setText("Maschinen - Anlagentechnik");
			info.setText("Die Maschinentechniker/innen sind aufgrund ihrer Ausbildung befähigt, in die verschiedensten Branchen von Industrie und Gewerbe einzusteigen. Sie sind flexibel und arbeiten sich rasch in neue Aufgabengebiete ein. Schon in jungen Jahren gehen sie in die betriebliche Praxis, sammeln dort Erfahrung und sind dann bestens qualifiziert, um mittlere und auch höhere Managementfunktionen zu übernehmen. Nach dreijähriger, facheinschlägiger Tätigkeit kann der Berufstitel Ingenieur erworben werden.");
			dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 4:
			header.setText("Umwelttechnik");
			info.setText("Die Nachfrage der Industrie nach Absolventen der Abteilung Maschineningenieurwesen mit ausgeprägter Fachkompetenz im Energie- und Umweltsektor ist derzeit sehr hoch. Durch stetig steigende Energiekosten und Verknappung der Ressourcen sind auch im Dienstleistungssektor (Ingenieurbüros) zahlreiche neue Aufgabengebiete entstanden, die sich mit der Thematik Umweltschutz, Energieerzeugung aus regenerativen Energiequellen oder Anlagensimulation befassen (Green Jobs). Nach dreijähriger, facheinschlägiger Tätigkeit kann der Berufstitel Ingenieur erworben werden.");
			dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 5:
			header.setText("Betriebsmanagement");
			info.setText("Unser Absolvent ist in nahezu allen Bereichen der Wirtschaft einsetzbar: Als technischer Spezialist im Betrieb, als Auftrags- und Einsatzleiter um In- und Ausland, als technisch-betriebswirtschaftlicher Controller, als technischer Ein- und Verkäufer, als Projektmanager oder als verantwortlicher Produkt-Manager etc...");
			dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			break;
		case 6:
			header.setText("Anlagentechnik");
			info.setText("Es erwartet dich eine grundlegende Ausbildung im allgemeinbildenden Bereich mit einer Fremdsprachenausbildung in Englisch. Eine stark praxisorientierte Ausbildung in den aktuellen Technologien der Elektrotechnik und der Elektronik, wobei das Ausbildungsniveau über dem eines vergleichbaren Lehrabschlusses liegt. Fachliche Vertiefung erfolgt in den Bereichen Elektrische Maschinen und Antriebe, Elektrische Anlagen, Mess-, Steuerungs- und Regelungstechnik sowie Industrielle Elektronik.");
			dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschlägigen Betrieb");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			break;
		case 7:
			header.setText("Informationstechnik");
			info.setText("Aufgrund der umfassenden theoretischen und praktischen Ausbildung liegen die Einsatzbereiche hauptsächlich in der Planung sowie der Wartung und Betreuung von betrieblichen EDV-Systemen sowie deren Vernetzung und An­bindung an Internet- und Telekommunikationsdienste. Auch der Einsatz im An- und Verkauf von EDV-Systemen ist vorgesehen. Im Anschluss an die Ausbildung ist (nach einem Vorbereitungslehrgang) der Einstieg in ein 2-jähriges Kolleg (Abschluss mit Reife- und Diplomprüfung) möglich. Es kann auch (nach einem Aufbaulehrgang) die Berufsreifeprüfung abgelegt und damit die Studienberechtigung erworben werden.");
			dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschlägigen Betrieb");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			break;
		case 8:
			header.setText("Fertigungstechnik");
			info.setText("Erwerb eines grundlegenden fachlichen Wissens und Könnens,das unmittelbar zur Ausübung eines Berufs auf gewerblichtechnischem Gebiet befähigt. Erweiterung und Vertiefung der Allgemeinbildung in einer der künftigen Berufstätigkeit angemessenen Weise. Durch die verstärkte fachpraktische Ausbildung soll der Schüler an den modernen Beruf des Fertigungstechnikers herangeführt werden. Der allgemeinbildende, fachtheoretische und fachpraktische Unterricht soll ein Ausbildungsniveau sichern, das über dem eines Lehrabschlusses liegt.");
			dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschlägigen Betrieb");
			absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			break;
		case 9:
			header.setText("Wirtschaftsingenieurwesen");
			info.setText("Der Absolvent bekommt eine umfassende betriebsorganisatorisch kaufmännische Ausbildung, die die Basisqualifikation für leitende Tätigkeiten in der Industrie darstellt, vermittelt. Mit dem erfolgreichen HTBLA - Abschluss sind mehrere Berufsberechtigungen (Lehrabschlüsse) für einschlägige Berufe verbunden. Erwerb des Berufstitels „Ingenieur“ nach dreijähriger facheinschlägiger Tätigkeit. Berechtigung zum Studium an einer Fachhochschule bzw. Universität zur Erlangung eines akademischen Grades.");
			dauer.setText("4 bzw. 3 Jahre am Abend bis zur Reife- und Diplomprüfung");
			absch.setText("Die erfolgreiche Ablegung der Lehrabschlussprüfung in einem entsprechenden Lehrberuf\n\nDer erfolgreiche Abschluss einer einschlägigen Fachschule\n\nDer erfolgreiche Abschluss einer einschlägigen Werkmeisterschule\n\nFür Bewerber, die eine fachfremde Reifeprüfung abgelegt haben, der Besuch eines praktischen Unterrichts.");
			break;
		case 10:
			header.setText("Elektrotechnik - Wirtschaft");
			info.setText("Einsatz als Absolvent der elektrotechnischen Fachrichtung in allen Bereichen.Direkter Zugang zum einschlägigen Gewerbe nach entsprechender Praxis. Mit dem erfolgreichen HTBLA - Abschluss sind mehrere Berufsberechtigungen (Lehrabschlüsse) für einschlägige Berufe verbunden. Die Ausbildung stellt eine Basis für mittleres und höheres Management in Betrieben dar. Durch die starke Wirtschaftsorientierung und die Ausbildung in Wirtschaftsinformatik sowie Führungstechnik ist die Qualifikation für leitende Funktionen vorhanden. Erwerb des Berufstitels „Ingenieur“ nach dreijähriger facheinschlägiger Tätigkeit.Berechtigung zum Studium an einer Fachhochschule bzw. Universität zur Erlangung eines akademischen Grades.");
			dauer.setText("4 bzw. 3 Jahre am Abend bis zur Reife- und Diplomprüfung");
			absch.setText("Die erfolgreiche Ablegung der Lehrabschlussprüfung in einem entsprechenden Lehrberuf\n\nDer erfolgreiche Abschluss einer einschlägigen Fachschule\n\nDer erfolgreiche Abschluss einer einschlägigen Werkmeisterschule\n\nFür Bewerber, die eine fachfremde Reifeprüfung abgelegt haben, der Besuch eines praktischen Unterrichts.");
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
