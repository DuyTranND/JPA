package vniot.star.services;

import java.util.List;

import vniot.star.entity.Video;

public interface IVideoService {

	int count();
	
	List<Video> findAll(int page, int pageSize);
	
	List<Video> findByTitle(String title);
	
	List<Video> findAll();
	
	Video findById(String videoid);
	
	void delete(String videoid) throws Exception;
	
	void update(Video video);
	
	void insert(Video video);
}