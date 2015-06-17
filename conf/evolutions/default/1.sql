# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table events (
  id                        bigint not null,
  title                     varchar(255),
  user                      varchar(255),
  car                       varchar(255),
  date                      varchar(255),
  description               varchar(255),
  constraint pk_events primary key (id))
;

create sequence events_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists events;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists events_seq;

