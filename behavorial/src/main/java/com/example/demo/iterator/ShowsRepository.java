package com.example.demo.iterator;

import java.util.Iterator;

public class ShowsRepository implements Iterable<String>{

	private String [] shows;
	private int index;
		
	public ShowsRepository() {
		this.shows = new String[10];
		this.index = 0;
	}

	public void addShow(String show) {
		if (index == shows.length) {
			String [] largerShows = new String[shows.length + 5];
			System.arraycopy(show, 0, largerShows, 0, show.length());
			shows = largerShows;
			largerShows = null;
		}
		
		shows[index] = show;
		index++;
	}
	@Override
	public Iterator<String> iterator() {
		Iterator<String> it = new Iterator<String>() {
			
			int currentIndex = 0;
			
			@Override
			public boolean hasNext() {
				return currentIndex < shows.length && shows[currentIndex] != null;
			}

			@Override
			public String next() {
				return shows[currentIndex++];
			}
			
		};
		
		return it;
	}

}
