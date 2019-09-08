package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.*;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist TomCruise = new Artist("Tom Cruise");
		Artist MichaelJackson = new Artist("MichaelJackson");
		Artist LouisDeFunes = new Artist("Louis De Funes");

		Work minorityReport = new Work("Minority report");
		Work bad = new Work("bad");
		Work leGendarmeDeSaintTropez = new Work("le Gendarme De Saint Tropez");

		minorityReport.setMainArtist(TomCruise);
		bad.setMainArtist(MichaelJackson);
		leGendarmeDeSaintTropez.setMainArtist(LouisDeFunes);

		minorityReport.setRelease(2002);
		bad.setRelease(2010);
		leGendarmeDeSaintTropez.setRelease(1964);

		minorityReport.setSummary("Resumé 1");
		bad.setSummary("resumé 2");
		leGendarmeDeSaintTropez.setSummary("Resumé 3");

		minorityReport.setGenre("Science Fiction");
		bad.setGenre("Pop music");
		leGendarmeDeSaintTropez.setGenre("Comedie");

		Catalogue.listOfWorks.add(minorityReport);
		Catalogue.listOfWorks.add(bad);
		Catalogue.listOfWorks.add(leGendarmeDeSaintTropez);

		for (Work work : Catalogue.listOfWorks) {
			System.out.println(work.getTitle() + " (" + work.getRelease() + ")");

		}

	}

}
