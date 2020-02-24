
insert into bloodGroupDetails(blood_group_id,blood_group)
values(1,'A+ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(2,'A-ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(3,'B+ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(4,'B-ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(5,'O+ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(6,'O-ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(7,'AB+ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(8,'AB-ve');
insert into bloodGroupDetails(blood_group_id,blood_group)
values(9,'Golden Blood');

select * from bloodGroupDetails;

insert into blood_app(user_id,user_name,email,blood_group_id,city)
values(employee_id_seq.nextval,'ARJUN','arjunae798@gmail.com',1,'Madurai');
insert into blood_app(user_id,user_name,email,blood_group_id,city)
values(employee_id_seq.nextval,'KESAVAN','kesavanp555@gmail.com',3,'Coimbatore');
insert into blood_app(user_id,user_name,email,blood_group_id)
values(employee_id_seq.nextval,'KARTHICK','karrthicks10@gmail.com',5,'Chennai');

--inner join--
select user_id,user_name,email,blood_group,active,city from blood_app ba
inner join bloodGroup bg on bg.blood_group_id=ba.blood_group_id;

--sub query--
select count(user_id) from blood_app where blood_group_id=(select blood_group_id from bloodGroupDetails where blood_group ='A+ve' ) and city='madurai';       

select * from blood_app;