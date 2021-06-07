package kr.ac.kopo.kopo41.dao;

import java.util.List;

import kr.ac.kopo.kopo41.domain.Board;

public class BoardDaoImpl implements BoardDao{
	@Override
	public void create(Board board) {
		
		
	}
	
	@Override
	public Board selectOne(int id) {
		Board board = new Board();
		board.setId(1);
		board.setTitle("aaaaaaa");
		return board;
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
