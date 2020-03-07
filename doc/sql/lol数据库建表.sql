-- 用户表
create table user_info(
 user_id int auto_increment primary key, -- 用户id
 user_phone varchar(20) not null, -- 账号
 user_pwd varchar(20) not null,  -- 密码
 user_name varchar(50), -- 姓名
 photo varchar(50) default 'default.jpg', -- 头像
 sex tinyint(1) not null, -- 性别 0为女 1为男
 birthday datetime not null, -- 生日
 phone varchar(20), -- 手机号码
 email varchar(100) -- 邮箱
)auto_increment=1000

-- 角色表 
create table role_info(
 role_id int auto_increment primary key, -- 角色表id
 role_name varchar(20) not null -- 职位
)auto_increment=1000


-- 用户角色表
create table user_role(
 user_id int not null, -- 用户表id
 role_id int not null  -- 角色表id  
)

-- 操作表菜单表
create table menu_info(
 menu_id int auto_increment primary key, -- 操作功能id
 parent_id int not null, -- 操作功能父id
 menu_name varchar(20) not null,  -- 操作功能名称
 menu_url varchar(20) not null  -- 操作功能URL
)auto_increment=1000


-- 角色操作权限表
create table role_menu(
 menu_id int not null, -- 操作功能id
 role_id int not null -- 角色
)


-- 优惠卷表
create table discount_info(
 dis_id int auto_increment primary key, -- 优惠券id
 dis_type tinyint(1) not null, -- 优惠券类型，（0优惠券，1免邮券，2折扣券）
 dis_num double,  -- 优惠金额
 lose_date int not null, -- 失效天数
 use_or_not tinyint(1) not null, -- 是否使用，0没有，1已使用
 dis_status tinyint(1) not null -- 状态，0为失效，1为未失效
)auto_increment=1000

-- 优惠券关联用户表
create table discount_user(
	user_id int not null, -- 用户ID
	dis_id int not null -- 优惠券ID
)

-- 收货地址表
create table address_info(
	address_id int not null primary key, -- 收货地址ID
	user_id int not null, -- 用户ID
	take_name varchar(50) not null, -- 取货人姓名
	take_phone varchar(20) not null, -- 手机号码
	take_address varchar(200) not null, -- 收货地址，省市县+详细收货地址
	postcode varchar(10) not null, -- 邮政编码
	status tinyint -- 状态，即是否设置为默认收货地址，0无，1设置
)

-- 城市表
create table city_info(
	city_code varchar(32) not null primary key, -- 地区码
	city_parent_code varchar(32) not null, -- 父级地区码
	city_name varchar(128) not null, -- 地区名称
	city_type tinyint not null -- 地区类型，1无，1省级，2市级，3县级
)

-- 收藏表
create table collect_info(
	collect_id int not null primary key, -- 收藏ID
	user_id int not null, -- 用户ID
	pro_id int not null -- 商品ID
)

-- 评论表
create table comment_info(
	com_id int not null primary key, -- 评论ID
	user_id int not null, -- 用户ID
	details_id int not null, -- 订单明细表id,一个订单有多个购物项
	description tinyint not null, -- 描述相符，12345颗星
	delivery tinyint not null, -- 送货服务
	service tinyint not null, -- 服务态度
	content varchar(200) not null, -- 评论的内容
	com_date date, -- 评论时间（当前时间）
	like_num int not null, -- 点赞数
	parent_id int not null -- 父id默认是0
)

-- 评论图片表
create table comment_photo(
	photo_id int not null primary key, -- 图片表id
	photo varchar(100) not null, -- 图片文件名
	com_id int not null -- 评论id
)

-- 追加评论表:
CREATE TABLE add_comment(
	add_com_id INT	Not NULL auto_increment primary key,	-- 评论id
	com_id INT	Not NULL,	-- 评论id
	add_content	Varchar(200)	Not NULL,	-- 评论内容
	add_date	DateTime	Not NULL	-- 追加评论时间
)auto_increment=1000


-- 回复评论表：
CREATE TABLE return_content(
	return_id	INT	Not NULL auto_increment primary key,	-- 回复id
	com_id	INT NOT NUll,	-- 评论id，这条回复是属于那一条评论的
	return_parent_id	INT Not NULL,	-- 回复的评论的父id，这条字段的作用是实现回复功能
	user_id	INT NOT NUll,	-- 回复的用户id
	content	Varchar(200) NOT NUll,	-- 回复的内容
	return_date	date	NOT NUll,	-- 回复的时间
	like_num	INT	NOT NUll	-- 点赞数
)auto_increment=1000


-- 评论举报表：
CREATE TABLE content_report(
	report_id	INT	Not NULL auto_increment primary key,	-- 举报表id
	com_id	INT NOT NUll,	-- 评论id
	report_name	Varchar(200) NOT NUll,	-- 举报原因（用户写）
	reason_id	INT NOT NUll	-- 举报表原因id
)auto_increment=1000

-- 举报原因表
CREATE TABLE report_reason(
	reason_id		INT	Not NULL auto_increment primary key,-- 举报表原因id
	reason_name	Varchar(200)	NOT NUll	-- 举报原因（用户选择）
)auto_increment=1000


#订单信息表
create table order_info(
order_id varChar(32) primary key Not null,	#订单id
order_static_id	Int	Not null,	#订单状态id(关联订单状态表)
address_id	Int	Not null,	#收货信息id(关联收货信息表)
user_id	Int Not null,	#用户id(关联用户信息表)
preferential_amount	Decimal(16,2)	Not null,	#优惠金额
payment_money Decimal(16,2)	Not null,	#支付金额
order_time	Datetime default CURRENT_TIMESTAMP null,	#下单时间
payment_time	DateTime,		#支付时间
delivery_time	DateTime,		#发货时间
receiving_time	DateTime		#收货时间
);


#订单详情表
create table order_details(
    details_id	Int auto_increment primary key Not null,	#订单明细id
    order_id Char(32) Not null,	#订单id(订单表)
    good_id	Int	not null,	#商品id(关联商品表)
    good_number	int	not null,	#商品数量
    specs_id varchar(64) not null	#商品规格id(关联商品规格表)
)auto_increment=1000;

#订单状态表
create table order_static(
    static_id Int auto_increment primary key Not null,	#订单状态id
    static_name	varChar(32)	Not null	#订单状态名称
)auto_increment=1000;

#订单关闭类型表
create table close_type(
    close_type_id int auto_increment primary key NOT NULL,	#类型id
    close_type_value	varchar(64)	NOT NULL	#订单关闭类型
)auto_increment=1000;


#退款信息表
create table refund_apply(
    refund_id int auto_increment primary key NOT NULL,	#id
    user_id	int	NOT NULL,	#用户id(关联用户)
    reason_id	int	not null,	#关联退款原因表
    refund_explain	varchar(200),		#退款申请说明
    voucher_image	varchar(64),	#退款申请图片
    order_id	Char(32)	not null,	#订单id（订单表）
    details_id	Int	Not null,	#订单明细id(订单明细表)
    reason_sum	Int	Not null,	#退款数量（不能超过购买数量）
    reason_type_id	Int 	Not null,	#退款类型id(退款类型表)
    reason_price	Decimal(16,2)	Not null,	#退款金额(小于商品金额)
    Reason_static_id	Int 	Not null	#关联退款状态表
)auto_increment=1000;

#退款原因表
create table refund_reason(
    reason_id	int auto_increment primary key NOT NULL,	#id
    reason_value	varchar(64)	NOT NULL	#退款原因
)auto_increment=1000;


#退款类型表
create table refund_type(
    reason_type_id	int auto_increment primary key 	NOT NULL,	#id
    reason_type_value	varchar(64)	NOT NULL	#退款类型
)auto_increment=1000;


#退款状态表
create table refund_static(
    reason_static_id int auto_increment primary key NOT NULL,	#id
    reason_static_value	varchar(64)	NOT NULL	#退款状态
)auto_increment=1000;

-- 物流公司表
create table logistics_info
(
	log_id int primary key auto_increment, -- 物流公司id
	log_name varchar(20) not null -- 物流公司名称
)auto_increment = 1000;

-- 员工表
create table employee_info
(
    e_id int primary key auto_increment, -- 员工的id
    user_id int not null, -- 用户的id
    e_name varchar(20) not null, -- 员工的姓名
    e_telephone varchar(20) not null, -- 员工的电话
    e_sex tinyint(1) not null, -- 员工性别
    e_age int not null, -- 员工年龄
    e_state int not null, -- 员工状态（离职，在岗）
    e_hiredate datetime not null, -- 入职时间
    e_line int not null -- 离职时间
)auto_increment = 1000;

-- 客服聊天表
create table message_info
(
    m_id int primary key auto_increment, -- 消息id
    m_messages varchar(1000) not null, -- 消息内容
    m_state tinyint(1) not null, -- 消息状态
    message_type_id int not null, -- 消息类型id
    m_time datetime not null, -- 发送时间（当前时间）
    output_user_id int not null, -- 用户id（发送者）
    input_user_id int not null, -- 用户id（接收者）
    re_time datetime not null -- 管理员回复的时间
)auto_increment = 1000;

-- 消息类型表
create table message_type_info
(
    message_type_id int primary key auto_increment, -- 消息类型id
    message_type_name varchar(20) not null -- 类型名称
)auto_increment = 1000;

-- 客服用户表
create table friend_info
(
    f_id int primary key auto_increment, -- 客服用户id
    e_id int not null, -- 员工id
    user_id int not null -- 用户id
)auto_increment = 1000;



#公告表
CREATE  TABLE notice_info(
n_id INT	Not NULL auto_increment primary key,	#公告id
e_id	INT	NOT NULL, #员工id
n_content VARCHAR(500) NOT NULL, #公告的内容
n_time  DateTime	DEFAULT current_timestamp , #公告时间
update_time	DateTime,		#公告修改的时间
n_state INT	NOT NULL 	#公告状态
)auto_increment=1000

#购物车表
CREATE TABLE shop_cart(
shop_id	INT 	NOT NULL	auto_increment primary key,	#购物车id 
shop_u_id	INT	NOT NULL , #用户id
specs_product_id	INT	Not null,#skuId
shop_count	INT	Not null,#商品数量
shop_state	INT	Not null#购物车状态
)auto_increment=1000

#商品分类表
CREATE TABLE product_type(
product_type_id	INT 	NOT NULL auto_increment primary key ,#商品分类的id
parent_id	INT	NOT NULL,#商品分类的父id
Product_type_name	VARCHAR(100)	NOT NULL,#商品分类的名称
create_time	DateTime	DEFAULT current_timestamp ,#商品分类创建时间（默认为当前时间）
update_time	DateTime, #修改分类时间
product_state	Int	NOT NULL #商品分类的状态
)auto_increment=1000

#商品表
CREATE TABLE  product_info(
product_id	Int 	NOT NULL	auto_increment primary key ,#商品的id
product_type_id	Int	NOT NULL, #商品分类的id
product_name	varchar(50)	NOT NULL ,	#商品的名称
product_create_time	DateTime	DEFAULT current_timestamp, 	#商品创建时间（默认为当前时间）
product_update_time	DateTime,	#商品修改时间（默认为当前时间）
product_main_image	varchar(100)	NOT NULL,	#商品的主图显示
product_particular	LongText	NOT NULL,	#商品的详细介绍
product_weight	Int	NOT NULL,	#商品的重量
product_attribute	varchar(200)	NOT NULL,	#记录这个商品所有的规格
product_state	Int	NOT NULL	#商品的状态
)auto_increment=1000
#商品规格表
CREATE TABLE  product_specs(
product_id	Int 	NOT NULL	auto_increment primary key ,#商品的id
product_type_id	Int	NOT NULL, #商品分类的id
product_name	varchar(50)	NOT NULL ,	#商品的名称
product_create_time	DateTime	DEFAULT current_timestamp, 	#商品创建时间（默认为当前时间）
product_update_time	DateTime,	#商品修改时间（默认为当前时间）
product_main_image	varchar(100)	NOT NULL,	#商品的主图显示
product_particular	LongText	NOT NULL,	#商品的详细介绍
product_weight	Int	NOT NULL,	#商品的重量
product_attribute	varchar(200)	NOT NULL,	#记录这个商品所有的规格
product_state	Int	NOT NULL	#商品的状态
)auto_increment=1000

#商品规格键(key)表 
CREATE TABLE  product_attribute_key(
attribute_key_id	Int	NOT NULL auto_increment primary key,	#商品属性key的id
product_type_id	Int	NOT NULL,	#关联商品分类的Id
attribute_key_name	varchar(200)	NOT NULL,	#属性key的名称
attribute_create_time	DateTime	DEFAULT current_timestamp NOT NULL,	#属性创建时间（默认为当前时间）
attribute_update_time	DateTime		#属性修改时间（默认为当前时间）
)auto_increment=1000

#商品规格值(vaule)表 
CREATE TABLE  product_attribute_value(
attribute_value_id	Int	NOT NULL auto_increment primary key ,#商品属性value的id
attribute_key_id	Int	NOT NULL,		#关联属性key的Id
attribute_key_name	varchar(200)	NOT NULL,	#属性value的名称
attribute_create_time	DateTime	DEFAULT current_timestamp ,	#属性创建时间（默认为当前时间）
attribute_update_time	DateTime		#属性修改时间（默认为当前时间）
)auto_increment=1000

#商品图片表
CREATE TABLE  product_image(
image_id	Int	NOT NULL auto_increment primary key,	#商品图片表的id
product_type_id	Int	NOT NULL,	#关联商品的Id
image_name	varchar(50)	NOT NULL,	#图片名称
attribute_create_time	DateTime	DEFAULT current_timestamp,	#图片创建时间（默认为当前时间）
attribute_update_time	DateTime 	#图片修改时间（默认为当前时间）
)auto_increment=1000
