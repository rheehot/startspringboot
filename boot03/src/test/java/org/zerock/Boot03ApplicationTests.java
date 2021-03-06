package org.zerock;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Board;
import org.zerock.persistence.BoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Boot03ApplicationTests {

	@Autowired
	private BoardRepository repo;

//	@Test
//	public void testInsert200() {
//
//		for (int i = 1; i <= 200; i++) {
//
//			Board board = new Board();
//			board.setTitle("Title!!!.." + i);
//			board.setContent("Contents!!! ...." + i + " Fullup ");
//			board.setWriter("user0" + (i % 10));
//			repo.save(board);
//
//		}
//
//	}

//	@Test
//	public void testByTitle() {
//
//		repo.findBoardByTitle("Title!!!..117").forEach(board -> System.out.println(board));
//
//	}
	
//	Hibernate: select board0_.bno as bno1_0_, board0_.content as content2_0_, board0_.regdate as regdate3_0_, board0_.title as title4_0_, board0_.updatedate as updateda5_0_, board0_.writer as writer6_0_ from tbl_boards board0_ where board0_.title=?
//			Board(bno=522, title=Title!!!..117, writer=user07, content=Contents!!! ....117 Fullup , regdate=2018-06-23 16:25:02.0, updatedate=2018-06-23 16:25:02.0)

//
//	@Test
//	public void testByWriter() {
//
//		Collection<Board> results = repo.findByWriter("user00");
//
//		results.forEach(board -> System.out.println(board));
//	}
//
//	@Test
//	public void testByWriterContaining() {
//
//		Collection<Board> results = repo.findByWriterContaining("05");
//
//		results.forEach(board -> System.out.println(board));
//	}
//
	
//	@Test
//	public void testByWriterContaining() {
//
//		Collection<Board> results = repo.findByTitleContainingOrContentContaining("05","Title");
//
//		results.forEach(board -> System.out.println(board));
//
//	}
	
//	@Test
//	public void testByTitleAndBno() {
//
//		Collection<Board> results = repo.findByTitleContainingAndBnoGreaterThan("5", 50L);
//
//		results.forEach(board -> System.out.println(board));
//
//	}

//	@Test
//	public void testBnoOrderBy() {
//
//		Collection<Board> results = repo.findByBnoGreaterThanOrderByBnoDesc(400L);
//		results.forEach(board -> System.out.println(board));
//
//	}
//
//	@Test
//	public void testBnoOrderByPaging() {
//
//		//Pageable paging = new PageRequest(0, 10);
//		
//		
//		//spring boot 2.0.0
//		Pageable paging = PageRequest.of(0, 10);
//
//		Collection<Board> results = repo.findByBnoGreaterThanOrderByBnoDesc(0L, paging);
//		results.forEach(board -> System.out.println(board));
//
//	}

//	@Test
//	public void testBnoPagingSort() {
//
//	Pageable paging = PageRequest.of(0, 10, Sort.Direction.ASC, "bno");
//
//		
//		Collection<Board> results = repo.findByBnoGreaterThanOrderByBnoDesc(0L, paging);
//		results.forEach(board -> System.out.println(board));
//
//	}
	
//	@Test
//	public void testBnoPagingSort() {
//
//		//Pageable paging = new PageRequest(0, 10, Sort.Direction.ASC, "bno");
//		
//		//spring boot 2.0.0
//		Pageable paging = PageRequest.of(0, 10, Sort.Direction.ASC, "bno");
//
//		Page<Board> result = repo.findByBnoGreaterThan(0L, paging);
//		
//		System.out.println("PAGE SIZE: " + result.getSize());
//		System.out.println("TOTAL PAGES: " + result.getTotalPages());
//		System.out.println("TOTAL COUNT: " + result.getTotalElements());
//		System.out.println("NEXT: " + result.nextPageable());
//		
//		List<Board> list = result.getContent();
//		
//		list.forEach(board -> System.out.println(board));
//		
//	}
//
//
//	@Test
//	public void testByTitle2() {
//
//		repo.findByTitle("17").forEach(board -> System.out.println(board));
//
//	}
//
//	@Test
//	public void testByTitle17() {
//
//		repo.findByTitle2("17").forEach(arr -> System.out.println(Arrays.toString(arr)));
//
//	}
//
//	@Test
//	public void testByPaging() {
//
//		Pageable pageable = PageRequest.of(0, 10);
//
//		repo.findBypage(pageable).forEach(board -> System.out.println(board));
//
//	}

}