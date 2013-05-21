package com.example.htlweiz;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class Depart2 extends Activity {

	ProgressDialog ShowProgress;
	String url = "";
	WebView wv;
	String response = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depart2);

		ActionBar actionBar = getActionBar();
		actionBar.hide();

		wv = (WebView) findViewById(R.id.webView12);
		wv.setBackgroundColor(00000000);
		WebSettings settings = wv.getSettings();
		settings.setDefaultTextEncodingName("utf-8");

		ShowProgress = ProgressDialog.show(Depart2.this, "Bitte warten",
				"Daten werden geladen", true);

		TextView header = (TextView) findViewById(R.id.textView1);
		// TextView dauer = (TextView) findViewById(R.id.textView4);
		// TextView absch = (TextView) findViewById(R.id.textView6);

		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
		int aint = Integer.parseInt(message);

		switch (aint) {
		case 0:
			header.setText("Kolleg Betriebsinformatik");
			// dauer.setText("4 Semester, 2 Jahre bis zur Diplomprüfung");
			// absch.setText("Erfolgreich abgelegte Reifeprüfung einer AHS bzw. BHS.\n\nErfolgreich abgelegte Abschlussprüfung einer facheinschlägigen 4-jährigen Fachschule.\n\nPersonen mit Berufsberechtigung oder abgeschlossener 3-jährigen oder nicht facheinschlägiger Fachschule nach Ablegung einer Aufnahmsprüfung bzw. nach Absolvierung eines Vorbereitungsmoduls.");
			url = "http://www.htbla-weiz.at/index.php/kolleg";
			break;
		case 1:
			header.setText("Elektrotechnik Automatisierung");
			// info.setText("Es erwartet dich eine fundierte Allgemeinausblidung mit gezielter Fremdsprachenausbildung in Englisch, die durch eine Auslands - Sprachwoche intensiviert wird (Cambridge First Certificate nach Wahl). Die Entwicklung wesentlicher soft skills wie Verantwortungsbewusstsein, Teamgeist und Kommunikationsfähigkeit. Die Schwerpunkte der Ausbildung liegen bei der Automatisierung in der Programmierung von SPS und Mikrocontrollern, in der Erfassung, Aufbereitung und Verarbeitung von Messdaten, im Entwurf und der Dimensionierung von Mess-, Steuer,- und Regelungssystemen und in Entwicklung bzw. Einsatz branchenspezifischer Software");
			// dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			response = "<img src=\"http://elektrotechnik.htbla-weiz.at/plugins/content/plugin_jw_sig/showthumb.php?img=Abteilung_Automatisierung/Automatisierung600x1000.jpg&width=650&height=550&quality=120\">";
			break;
		case 2:
			header.setText("Industrielle Informationstechnik");
			// info.setText("Es erwartet dich eine fundierte Allgemeinausblidung mit gezielter Fremdsprachenausbildung in Englisch, die durch eine Auslands - Sprachwoche intensiviert wird (Cambridge First Certificate nach Wahl). Die Entwicklung wesentlicher soft skills wie Verantwortungsbewusstsein, Teamgeist und Kommunikationsfähigkeit. Die fachliche Ausbildung wird beim Schwerpunkt Informationstechnik in den Bereichen Automatisierungstechnik, aktuelle Betriebssysteme und Netzwerktechnologien, Industrielle Informationstechnik, Projekt - Engineering mit SAP (auf Wunsch mit Zertifikat), Datenbanken, Webtechnologien, sowie Qualitäts und Produktmanagement vertieft");
			// dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			response = "<img src=\"http://elektrotechnik.htbla-weiz.at/plugins/content/plugin_jw_sig/showthumb.php?img=Abteilung_Informationstechnik/Informationstechnik600x1000.jpg&width=650&height=550&quality=80\">";
			break;
		case 3:
			header.setText("Maschinen - Anlagentechnik");
			// info.setText("Die Maschinentechniker/innen sind aufgrund ihrer Ausbildung befähigt, in die verschiedensten Branchen von Industrie und Gewerbe einzusteigen. Sie sind flexibel und arbeiten sich rasch in neue Aufgabengebiete ein. Schon in jungen Jahren gehen sie in die betriebliche Praxis, sammeln dort Erfahrung und sind dann bestens qualifiziert, um mittlere und auch höhere Managementfunktionen zu übernehmen. Nach dreijähriger, facheinschlägiger Tätigkeit kann der Berufstitel Ingenieur erworben werden.");
			// dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			url = "http://www.htbla-weiz.at/index.php/maschinentechnik-edv";
			break;
		case 4:
			header.setText("Umwelttechnik");
			// info.setText("Die Nachfrage der Industrie nach Absolventen der Abteilung Maschineningenieurwesen mit ausgeprägter Fachkompetenz im Energie- und Umweltsektor ist derzeit sehr hoch. Durch stetig steigende Energiekosten und Verknappung der Ressourcen sind auch im Dienstleistungssektor (Ingenieurbüros) zahlreiche neue Aufgabengebiete entstanden, die sich mit der Thematik Umweltschutz, Energieerzeugung aus regenerativen Energiequellen oder Anlagensimulation befassen (Green Jobs). Nach dreijähriger, facheinschlägiger Tätigkeit kann der Berufstitel Ingenieur erworben werden.");
			// dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			url = "http://www.htbla-weiz.at/index.php/umwelttechnik";
			break;
		case 5:
			header.setText("Betriebsmanagement");
			// info.setText("Unser Absolvent ist in nahezu allen Bereichen der Wirtschaft einsetzbar: Als technischer Spezialist im Betrieb, als Auftrags- und Einsatzleiter um In- und Ausland, als technisch-betriebswirtschaftlicher Controller, als technischer Ein- und Verkäufer, als Projektmanager oder als verantwortlicher Produkt-Manager etc...");
			// dauer.setText("5 Jahre bis zur Reife- und Diplomprüfung");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS");
			url = "http://www.htbla-weiz.at/index.php/betriebsmanagement";
			break;
		case 6:
			header.setText("Anlagentechnik");
			// info.setText("Es erwartet dich eine grundlegende Ausbildung im allgemeinbildenden Bereich mit einer Fremdsprachenausbildung in Englisch. Eine stark praxisorientierte Ausbildung in den aktuellen Technologien der Elektrotechnik und der Elektronik, wobei das Ausbildungsniveau über dem eines vergleichbaren Lehrabschlusses liegt. Fachliche Vertiefung erfolgt in den Bereichen Elektrische Maschinen und Antriebe, Elektrische Anlagen, Mess-, Steuerungs- und Regelungstechnik sowie Industrielle Elektronik.");
			// dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschlägigen Betrieb");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			response = "<img src=\"http://elektrotechnik.htbla-weiz.at/plugins/content/plugin_jw_sig/showthumb.php?img=Abteilung_FS_ET/Fachschule600x1000.jpg&width=650&height=550&quality=80\">";
			break;
		case 7:
			header.setText("Informationstechnik");
			// info.setText("Aufgrund der umfassenden theoretischen und praktischen Ausbildung liegen die Einsatzbereiche hauptsächlich in der Planung sowie der Wartung und Betreuung von betrieblichen EDV-Systemen sowie deren Vernetzung und An­bindung an Internet- und Telekommunikationsdienste. Auch der Einsatz im An- und Verkauf von EDV-Systemen ist vorgesehen. Im Anschluss an die Ausbildung ist (nach einem Vorbereitungslehrgang) der Einstieg in ein 2-jähriges Kolleg (Abschluss mit Reife- und Diplomprüfung) möglich. Es kann auch (nach einem Aufbaulehrgang) die Berufsreifeprüfung abgelegt und damit die Studienberechtigung erworben werden.");
			// dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschlägigen Betrieb");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			url = "http://www.htbla-weiz.at/index.php/fachschule-fuer-informationstechnik";
			break;
		case 8:
			header.setText("Fertigungstechnik");
			// info.setText("Erwerb eines grundlegenden fachlichen Wissens und Könnens,das unmittelbar zur Ausübung eines Berufs auf gewerblichtechnischem Gebiet befähigt. Erweiterung und Vertiefung der Allgemeinbildung in einer der künftigen Berufstätigkeit angemessenen Weise. Durch die verstärkte fachpraktische Ausbildung soll der Schüler an den modernen Beruf des Fertigungstechnikers herangeführt werden. Der allgemeinbildende, fachtheoretische und fachpraktische Unterricht soll ein Ausbildungsniveau sichern, das über dem eines Lehrabschlusses liegt.");
			// dauer.setText("3 1/2 Jahre schulische Ausbildung inkl. 3-monatigem Betriebspraktikum in einem facheinschlägigen Betrieb");
			// absch.setText("Abschluss der 4. Klasse einer Hauptschule bzw. einer AHS-Unterstufe.");
			url = "http://www.htbla-weiz.at/index.php/fachschule-fuer-maschinenbau-fertigungstechnik";
			break;
		case 9:
			header.setText("Wirtschaftsingenieurwesen");
			// info.setText("Der Absolvent bekommt eine umfassende betriebsorganisatorisch kaufmännische Ausbildung, die die Basisqualifikation für leitende Tätigkeiten in der Industrie darstellt, vermittelt. Mit dem erfolgreichen HTBLA - Abschluss sind mehrere Berufsberechtigungen (Lehrabschlüsse) für einschlägige Berufe verbunden. Erwerb des Berufstitels „Ingenieur“ nach dreijähriger facheinschlägiger Tätigkeit. Berechtigung zum Studium an einer Fachhochschule bzw. Universität zur Erlangung eines akademischen Grades.");
			// dauer.setText("4 bzw. 3 Jahre am Abend bis zur Reife- und Diplomprüfung");
			// absch.setText("Die erfolgreiche Ablegung der Lehrabschlussprüfung in einem entsprechenden Lehrberuf\n\nDer erfolgreiche Abschluss einer einschlägigen Fachschule\n\nDer erfolgreiche Abschluss einer einschlägigen Werkmeisterschule\n\nFür Bewerber, die eine fachfremde Reifeprüfung abgelegt haben, der Besuch eines praktischen Unterrichts.");
			url = "http://www.htbla-weiz.at/index.php/abendschule/wirtschaftsingenieurwesen";
			break;
		case 10:
			header.setText("Elektrotechnik - Wirtschaft");
			// info.setText("Einsatz als Absolvent der elektrotechnischen Fachrichtung in allen Bereichen.Direkter Zugang zum einschlägigen Gewerbe nach entsprechender Praxis. Mit dem erfolgreichen HTBLA - Abschluss sind mehrere Berufsberechtigungen (Lehrabschlüsse) für einschlägige Berufe verbunden. Die Ausbildung stellt eine Basis für mittleres und höheres Management in Betrieben dar. Durch die starke Wirtschaftsorientierung und die Ausbildung in Wirtschaftsinformatik sowie Führungstechnik ist die Qualifikation für leitende Funktionen vorhanden. Erwerb des Berufstitels „Ingenieur“ nach dreijähriger facheinschlägiger Tätigkeit.Berechtigung zum Studium an einer Fachhochschule bzw. Universität zur Erlangung eines akademischen Grades.");
			// dauer.setText("4 bzw. 3 Jahre am Abend bis zur Reife- und Diplomprüfung");
			// absch.setText("Die erfolgreiche Ablegung der Lehrabschlussprüfung in einem entsprechenden Lehrberuf\n\nDer erfolgreiche Abschluss einer einschlägigen Fachschule\n\nDer erfolgreiche Abschluss einer einschlägigen Werkmeisterschule\n\nFür Bewerber, die eine fachfremde Reifeprüfung abgelegt haben, der Besuch eines praktischen Unterrichts.");
			url = "http://www.htbla-weiz.at/index.php/abendschule/elektrotechnik-wirtschaft";
			break;
		}

		readWebpage(wv);

	}

	private class DownloadWebPageTask extends AsyncTask<String, Void, String> {
		@Override
		protected String doInBackground(String... urls) {

			for (String url : urls) {
				DefaultHttpClient client = new DefaultHttpClient();
				HttpGet httpGet = new HttpGet(url);
				try {
					HttpResponse execute = client.execute(httpGet);
					InputStream content = execute.getEntity().getContent();

					BufferedReader buffer = new BufferedReader(
							new InputStreamReader(content));
					String s = "";
					while ((s = buffer.readLine()) != null) {
						response += s;
					}

					String css = "<style type='text/css'>p{color:white;font-size:15;font-family:Arial;} "
							+ "h2{color:white;text-align:left;font-size:22}"
							+ "ul{color:white;font-size:15;font-family:Arial;}"
							+ "ol{color:white;font-size:15;font-family:Arial;}"
							+ "</style>";

					int startPosition = response.indexOf("Berufs");
					int endPosition = response.indexOf("<div id=",
							startPosition);
					response = "<html><body>" + css + "<h2>"
							+ response.substring(startPosition, endPosition)
							+ "</body></html>";

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			return response;
		}

		@Override
		protected void onPostExecute(String result) {
			wv.loadData(result, "text/html; charset=UTF-8", null);
			ShowProgress.dismiss();
		}
	}

	public void readWebpage(View view) {
		DownloadWebPageTask task = new DownloadWebPageTask();
		task.execute(new String[] { url });

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_depart2, menu);
		return true;
	}

}
