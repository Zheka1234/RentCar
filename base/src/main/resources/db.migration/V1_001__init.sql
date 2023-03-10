create table if not exists "user"
(
    id                serial
        primary key,
    user_name         varchar(50)  default 'name'::character varying       not null,
    surname           varchar(100)                                         not null,
    mobile            varchar(30),
    email             varchar(50),
    login_user        varchar(255)                                         not null,
    password_user     varchar(255)                                         not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6)            not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6)            not null,
    status            varchar(20)  default 'NOT_ACTIVE'::character varying not null
);

alter table "user"
    owner to postgres;

create table if not exists roles
(
    id                serial
        primary key,
    role_name         varchar(20)  default 'ACTIVE'::character varying not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6)        not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6)        not null
);

alter table roles
    owner to postgres;

create table if not exists city
(
    id                serial
        primary key,
    city_name         varchar(50)  default 'Minsk'::character varying    not null,
    address           varchar(255) default 'Pushkina'::character varying not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6)          not null,
    modification_date timestamp    default CURRENT_TIMESTAMP(6)          not null
);

alter table city
    owner to postgres;

create table if not exists car
(
    id                serial
        primary key
        constraint car_city_id_fk
            references city,
    brand             varchar(20)      default 'BMW'::character varying   not null,
    model             varchar(10)      default 'i3'::character varying    not null,
    color             varchar(20)      default 'black'::character varying not null,
    price             double precision default 5000                       not null,
    creation_date     timestamp(6)     default CURRENT_TIMESTAMP(6)       not null,
    modification_date timestamp(6)     default CURRENT_TIMESTAMP(6)       not null,
    city_id           integer
);

alter table car
    owner to postgres;

create table if not exists contract
(
    id                serial
        primary key
        constraint contract_car_id_fk
            references car
        constraint contract_user_id_fk
            references "user",
    car_id            integer,
    user_id           integer,
    contract_number   varchar(50)  default 'ST123'::character varying                not null,
    passport          varchar(100) default '324234sdfvsgfd234fvd'::character varying not null,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6)                      not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6)                      not null
);

alter table contract
    owner to postgres;

create table if not exists user_roles
(
    id                serial
        primary key
        constraint user_roles_roles_id_fk
            references roles
        constraint user_roles_user_id_fk
            references "user",
    user_id           integer,
    role_id           integer,
    creation_date     timestamp(6) default CURRENT_TIMESTAMP(6) not null,
    modification_date timestamp(6) default CURRENT_TIMESTAMP(6) not null
);

alter table user_roles
    owner to postgres;

