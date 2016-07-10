package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.TripRepository;
import domain.Trip;


@Service
@Transactional
public class TripService {

	@Autowired
	private TripRepository tripRepository;

	public TripService() {
		super();
	}
	
	public Trip create(){
		return null;
	}
	

	public Collection<Trip> findAll(){
		return tripRepository.findAll();
	}
	
	public Trip findOne(int id_trip){
		return tripRepository.findOne(id_trip);
		
	}
	
	public void save(Trip trip){
		tripRepository.save(trip);
	}
	
	public void delete(Trip trip){
		tripRepository.delete(trip);
	}
	
}
