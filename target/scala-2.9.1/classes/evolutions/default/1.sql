# --- First database schema

# --- !Ups

set ignorecase true;


create table measure (
        taken timestamp,
        produced Double, 
        unity   varchar
) as 
select PARSEDATETIME(DATE,'yyyyMMdd'),VALUE as real,unity
 from 
csvread('/home/security/aurora-1.7.9/test2.csv', null,'fieldSeparator=:')






# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists measure;



SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists company_seq;

drop sequence if exists computer_seq;
