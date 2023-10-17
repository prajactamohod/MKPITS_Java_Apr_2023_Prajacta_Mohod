delimiter //
    create procedure customer_info()
    begin
    DECLARE records varchar(200);
    declare n,c varchar(20);
    declare myCursor CURSOR for
      select cust_name, city from customer;
      declare continue handler for NOT FOUND set records=1;
      open myCursor;
      label: loop
      fetch myCursor into n,c;
      insert into newCustomer values (n,c);
      if records=1 then
      leave label;
      end if;
      end loop;
      close myCursor;
      end ;
      // delimiter ;
     
      select * from newCustomer