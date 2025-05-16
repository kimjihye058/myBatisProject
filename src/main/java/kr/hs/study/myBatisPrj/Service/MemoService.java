package kr.hs.study.myBatisPrj.Service;

import kr.hs.study.myBatisPrj.DTO.MemoDTO;

import java.util.List;

// 여기에 @Service를 하는게 아님!
public interface MemoService {
    // CRUD: 삽입, 조회, 수정, 삭제
    // 1. Insert
    public void insert(MemoDTO dto); // 항상 DTO에 값이 저장되어있기 때문에 값을 DTO로 넘겨줌
    // 2. Update
    public void update(MemoDTO dto);
    // 3. Delete
    public void delete(int idx);
    // 4. Select
    public List<MemoDTO> listAll();     // select는 매개변수 없음

    public MemoDTO selectOne(int idx);
}
