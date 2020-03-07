
#订单信息表
create table order_info(
order_id varChar(32) primary key Not null,	#订单id
order_static_id	Int	Not null,	#订单状态id（关联订单状态表）
address_id	Int	Not null,	#收货信息id(关联收货信息表)
user_id	Int Not null,	#用户id（关联用户信息表）
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














