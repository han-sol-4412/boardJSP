package kr.ac.kopo.kopo41.dao;

import java.util.List;

import kr.ac.kopo.kopo41.domain.Board;
import kr.ac.kopo.kopo41.domain.BoardItem;

public interface BoardItemDao {
	void create(Board board);
	Board selectOne(int id);
	List<BoardItem> selectAll();
	void update(Board board);
	void delete(Board board);
}
