package com.saraya.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlaneService {
	
	public static List<Plane> planes= new ArrayList<Plane>();
	
private static int planeCount=4;

	static {
		planes.add(new Plane(1,"AirBirko","booing",2020,"cool","https://images.unsplash.com/photo-1504284400718-8e56ca675f61?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cGxhbmVzfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60","$456000"));
		planes.add(new Plane(2,"AirBirko","booing",2020,"cool","https://images.unsplash.com/photo-1504284400718-8e56ca675f61?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cGxhbmVzfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60","$456000"));
		planes.add(new Plane(3,"AirBirko","booing",2020,"cool","https://images.unsplash.com/photo-1504284400718-8e56ca675f61?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cGxhbmVzfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60","$456000"));
		planes.add(new Plane(4,"AirBirko","booing",2020,"cool","https://images.unsplash.com/photo-1504284400718-8e56ca675f61?ixid=MXwxMjA3fDB8MHxzZWFyY2h8Mnx8cGxhbmVzfGVufDB8fDB8&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60","$456000"));
	}
	
	public List<Plane> retrievePlanes(){
		return planes;
	}
	public Plane retrievePlaneById(int id) {
		for(Plane plane:planes) {
			if(plane.getId()==id) {
				return plane;
			}
			
		}
		return null;
	}
//	public void addPlane(Plane plane) {
//		planes.add(plane);
//	}

	public void addPlane(int id, String name, String model, int year, String description, String picture, String price) {
	planes.add(new Plane(++planeCount, name, model, year, description, picture,price ));
	}
	public void deleteById(int id) {
		Iterator<Plane> iterator=planes.iterator();
		while(iterator.hasNext()) {
			Plane plane=iterator.next();
				if(plane.getId()==id) {
					iterator.remove();
				}
			}
		}
	}
