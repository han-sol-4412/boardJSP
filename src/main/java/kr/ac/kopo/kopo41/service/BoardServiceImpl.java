package kr.ac.kopo.kopo41.service;

import java.util.List;

import kr.ac.kopo.kopo41.dao.BoardDao;
import kr.ac.kopo.kopo41.dao.BoardDaoImpl;
import kr.ac.kopo.kopo41.domain.Board;

public class BoardServiceImpl implements BoardService{
	private BoardDao boardDao = new BoardDaoImpl();
	
	@Override
	public void create(Board board) {
		
	}
	@Override
	public Board selectOne(int id) {
		return null;
	}
	@Override
	public List<Board> selectAll(){
		return null;
	}
	@Override
	public void update(Board board) {
		
	}
	@Override
	public void delete(Board board) {
		
	}
}
