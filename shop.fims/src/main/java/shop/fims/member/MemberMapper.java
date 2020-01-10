package shop.fims.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import shop.fims.vo.Area;
import shop.fims.vo.AreaCity;
import shop.fims.vo.AreaCityAdmin;
import shop.fims.vo.Member3;
import shop.fims.vo.MemberLev;

@Mapper
public interface MemberMapper {
	
	// 모든 회원 조회
	public List<Member3> memberList();
	
	// 회원 권한 조회
	public List<MemberLev> memberLevList();
	

}
