package com.basic.ta.algorithm.sort;

import org.junit.Test;

/** 
 * 用排序算法模拟购物网站中的商品推荐
 * 
 * 定义一个类继承Comparable接口，在compareTo方法中定义一个比较规则
 * 在本例模拟中商品流行度优先，其次看用户的喜爱度（可根据实际需求定义不同的规则）
 * 然后根据会员编号获取所有ProductRecommend对象进行排序
 * 
 * 
* @author 唐忠文
* @qq 1358723085
* @date 2017年6月11日 下午9:01:22 
*/
public class ProductRecommend implements Comparable<ProductRecommend> {

	private String productId; //商品编号
	private String accountId; //会员编号
	private Integer popular;  //商品的流行度
	private Integer favorite; //该用户对该商品的喜爱程度

	@Override
	public int compareTo(ProductRecommend o) {
		if (this.popular < o.popular) {
			return -1;
		}
		if (this.popular > o.popular) {
			return 1;
		}
		if (this.favorite < o.favorite) {
			return -1;
		}
		if (this.favorite > o.favorite) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Comparable[] a = { new ProductRecommend("1", "1", 7, 7), new ProductRecommend("2", "1", 8, 7),
				new ProductRecommend("3", "1", 7, 4), new ProductRecommend("4", "1", 7, 9),
				new ProductRecommend("5", "1", 6, 7), new ProductRecommend("6", "1", 6, 10) };

		MargeSort.sort(a); //使用递归排序
		
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i].toString());
		}
	}

	public String toString() {
		return productId + "," + popular + "," + favorite;
	}

	public ProductRecommend() {

	}

	public ProductRecommend(String productId, String accountId, Integer popular, Integer favorite) {
		super();
		this.productId = productId;
		this.accountId = accountId;
		this.popular = popular;
		this.favorite = favorite;
	}

}
