truncate table lookup;
truncate table user_type;
truncate table users;
truncate table user_type_order;

insert into lookup(lookup_id, lookup_name) values(nextval('lookup_seq'), 'PromoCard');
insert into lookup(lookup_id, lookup_name) values(nextval('lookup_seq'), 'CategoryCard');
insert into lookup(lookup_id, lookup_name) values(nextval('lookup_seq'), 'FlashSaleCard');
insert into lookup(lookup_id, lookup_name) values(nextval('lookup_seq'), 'HistoryCard');
insert into lookup(lookup_id, lookup_name) values(nextval('lookup_seq'), 'NewsCard');

insert into user_type(user_type_id, user_type) values (nextval('user_type_seq'), 'UserA');
insert into user_type(user_type_id, user_type) values (nextval('user_type_seq'), 'UserB');
insert into user_type(user_type_id, user_type) values (nextval('user_type_seq'), 'UserC');

insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 1, 1, 1);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 1, 2, 2);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 1, 3, 3);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 1, 4, 4);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 1, 5, 5);

insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 2, 1, 1);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 2, 2, 5);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 2, 3, 3);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 2, 4, 2);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 2, 5, 4);

insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 3, 1, 1);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 3, 2, 3);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 3, 3, 2);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 3, 4, 5);
insert into user_type_order (user_type_order_id, user_type_id, user_type_order_seq, lookup_id) values (nextval('user_type_order_seq'), 3, 5, 4);

insert into users(user_id, user_name, user_password, user_type_id) values (nextval('users_seq'), 'test1', 'test1', 1);
insert into users(user_id, user_name, user_password, user_type_id) values (nextval('users_seq'), 'test2', 'test2', 2);
insert into users(user_id, user_name, user_password, user_type_id) values (nextval('users_seq'), 'test3', 'test3', 3);

