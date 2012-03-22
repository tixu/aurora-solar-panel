create table measure (
        taken timestamp,
        produced real, 
        unity   varchar
) as 
select PARSEDATETIME(DATE,'yyyyMMdd'),VALUE as real,unity
 from 
csvread('/home/security/aurora-1.7.9/test2.csv', null,'fieldSeparator=:')


