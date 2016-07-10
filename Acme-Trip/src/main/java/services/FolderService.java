package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.FolderRepository;
import domain.Folder;


@Service
@Transactional
public class FolderService {

	@Autowired
	private FolderRepository folderRepository;

	public FolderService() {
		super();
	}
	
	public Folder create(){
		return null;
	}
	

	public Collection<Folder> findAll(){
		return folderRepository.findAll();
	}
	
	public Folder findOne(int id_folder){
		return folderRepository.findOne(id_folder);
		
	}
	
	public void save(Folder folder){
		folderRepository.save(folder);
	}
	
	public void delete(Folder folder){
		folderRepository.delete(folder);
	}
	
	
}
