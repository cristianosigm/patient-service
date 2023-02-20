create table if not exists patient (
    id serial,
    name varchar(250) not null,
    surname varchar(250),
    address varchar(1024),
    birthdate date,

    primary key(id)
);

create index idx_patient_name on patient(name);