package shop.fims.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.fims.vo.Revenue;

@Service
public class GoodsrevenueService {

	@Autowired GoodsrevenueMapper revenuemapper;
	
	//모든 축제별 보유물품 대여관리 리스트 - 세입 리스트
	public List<Revenue> revenuelist(){
		return revenuemapper.revenuelist();
	}
	
	public List<Revenue> coderevenue(String goodsren_rev_cd) {
		return revenuemapper.coderevenue(goodsren_rev_cd);
	}
	
}
