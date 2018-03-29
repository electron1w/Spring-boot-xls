package top.zhwen.entity;


public class MemberCollect {

	private Long memberId;

	private Long goodsId;

	/**
	 * 排序
	 */
	private Long sort;

	public Long getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public Long getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * 获取排序
	 */
	public Long getSort() {
		return this.sort;
	}

	/**
	 * 设置排序
	 */
	public void setSort(Long sort) {
		this.sort = sort;
	}

}
