package com.fly.sdk;


public class Product  extends FlyProduct {
/**
	 * 
	 */
	private static final long serialVersionUID = -8268033148731833173L;
//	"id"=>1, 
//            "title"=>"this is a title",         # 标题
//            "abstract"=>"this is a abstract",   # 摘要 
//            "first_image"=>"boat.gif",          # 第一张图片
//            "price": "1000",                    # 价格
//            "comment_count": "10"  
	
//  "id":3,
//  "title": "this is the title",         # 标题
//  "abstract": "this is a abstract"      # 摘要（app应该不需要显示这块）
//  "page":"\u003cp style=\"text-align:center\"\u003e\u003cimg alt=\"十八大后黑龙江首个省部级高官隋凤富被调查(图)\" src=\"http://img1.cache.netease.com/cnews/2014/11/28/20141128023112271a4.jpg\" style=\"border:0px; vertical-align:top\" /\u003e\u003cbr /\u003e\r\n隋凤富\u003c/p\u003e\r\n\r\n\u003cp style=\"text-align:justify\"\u003e\u003cstrong\u003e系十八大以来黑龙江首个被查省部级高官；在黑龙江农垦系统工作37年\u003c/strong\u003e\u003c/p\u003e\r\n\r\n\u003cp style=\"text-align:justify\"\u003e新京报讯 一个月前的10月28日，中央巡视组反馈黑龙江存在的问题时指出，该省农垦系统违纪违法案件频发。昨晚9：55，中纪委官网通报称，黑龙江省人大常委会副主任、省农垦总局党委书记隋凤富涉嫌严重违纪违法，目前正接受组织调查。\u003c/p\u003e\r\n\r\n\u003cp style=\"text-align:justify\"\u003e在隋凤富之前，十八大以来被调查的省部级及以上官员已达52人。但这52名高官均未涉及黑龙江。也就是说，隋凤富系黑龙江首个被调查的省部级高官。\u003c/p\u003e\r\n",    ＃详情内容
//  "comment_count": "10"                 # 评论数
//  "price":"1000",                       # 价格
//  "comments":[                          # 评论
//    {
//      "id"=>1, 
//      "title"=>"",                      # 评论的标题
//      "comment"=>"this is a comment",   # 评论的内容
//      "commentable_id"=>1,              # 评论的产品的id
//      "commentable_type"=>"Product",    # 评论的对象是Product
//      "user_id"=>1,                     # 评论者的id
//      "role"=>"comments",               # 不用管这个字段
//      "created_at"=>"2014-11-29T00:36:58.896+08:00", 
//      "updated_at"=>"2014-11-29T00:36:58.896+08:00"
//    },
	
    private double price ;
    public double getPrice() {
 		return price;
 	}
 	public void setPrice(double price) {
 		this.price = price;
 	}
 	
 	
     
     
}
